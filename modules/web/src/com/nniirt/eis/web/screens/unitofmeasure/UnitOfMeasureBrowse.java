package com.nniirt.eis.web.screens.unitofmeasure;

import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.actions.list.RefreshAction;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.DialogAction;
import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.UnitOfMeasure;
import com.nniirt.eis.service.NomenclatureService;

import javax.inject.Inject;
import javax.inject.Named;

@UiController("eis_UnitOfMeasure.browse")
@UiDescriptor("unit-of-measure-browse.xml")
@LookupComponent("unitOfMeasuresTable")
@LoadDataBeforeShow
public class UnitOfMeasureBrowse extends StandardLookup<UnitOfMeasure> {

    @Inject
    private NomenclatureService nomenclatureService;

    @Inject
    private Dialogs dialogs;

    @Named("unitOfMeasuresTable.refresh")
    private RefreshAction unitOfMeasuresTableRefresh;

    @Subscribe("reloadData")
    protected void onCloneNtkActionPerformed(Action.ActionPerformedEvent event) {
        dialogs.createOptionDialog()
                .withCaption("Пожалуйста подтвердите!")
                .withMessage("Вы действительно хотите обновить справочник ЕИ по данным галактики?")
                .withActions(
                        new DialogAction(DialogAction.Type.YES)
                                .withHandler(e -> nomenclatureService.ReloadFromARM())
                                .withHandler(e -> unitOfMeasuresTableRefresh.execute()),
                        new DialogAction(DialogAction.Type.NO)
                )
                .show();
    }
}