package com.nniirt.eis.web.screens.ntkitem;

import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.DialogAction;
import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.NtkItem;
import com.nniirt.eis.service.NtkService;

import javax.inject.Inject;

@UiController("eis_NtkItem.edit")
@UiDescriptor("ntk-item-edit.xml")
@EditedEntityContainer("ntkItemDc")
@LoadDataBeforeShow
public class NtkItemEdit extends StandardEditor<NtkItem> {
    @Inject
    private NtkService ntkService;

    @Inject
    private Dialogs dialogs;

    @Subscribe("cloneNtk")
    protected void onCloneNtkActionPerformed(Action.ActionPerformedEvent event) {
        dialogs.createOptionDialog()
                .withCaption("Пожалуйста подтвердите!")
                .withMessage("Вы действительно хотите создать копию текущего объекта?")
                .withActions(
                        new DialogAction(DialogAction.Type.YES)
                                .withHandler(e -> ntkService.DeepCloneNtkItem(getEditedEntity())),
                        new DialogAction(DialogAction.Type.NO)
                )
                .show();
    }
}