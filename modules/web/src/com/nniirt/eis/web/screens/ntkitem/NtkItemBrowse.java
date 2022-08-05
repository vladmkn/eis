package com.nniirt.eis.web.screens.ntkitem;

import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.actions.list.RefreshAction;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.DialogAction;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.NtkItem;
import com.nniirt.eis.service.NtkService;

import javax.inject.Inject;
import javax.inject.Named;

@UiController("eis_NtkItem.browse")
@UiDescriptor("ntk-item-browse.xml")
@LookupComponent("ntkItemsTable")
@LoadDataBeforeShow
public class NtkItemBrowse extends StandardLookup<NtkItem> {
    @Inject
    private NtkService ntkService;

    @Inject
    private Dialogs dialogs;
    @Inject
    private GroupTable<NtkItem> ntkItemsTable;

    @Named("ntkItemsTable.refresh")
    private RefreshAction ntkItemsTableRefresh;

    @Subscribe("cloneNtk")
    protected void onCloneNtkActionPerformed(Action.ActionPerformedEvent event) {
        dialogs.createOptionDialog()
                .withCaption("Пожалуйста подтвердите!")
                .withMessage("Вы действительно хотите создать копию текущего объекта?")
                .withActions(
                        new DialogAction(DialogAction.Type.YES)
                                .withHandler(e -> ntkService.DeepCloneNtkItem(ntkItemsTable.getSingleSelected()))
                                .withHandler(e -> ntkItemsTableRefresh.execute()),
                        new DialogAction(DialogAction.Type.NO)
                )
                .show();
    }
}