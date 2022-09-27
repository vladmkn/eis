package com.nniirt.eis.web.screens.ntkitem;

import com.haulmont.cuba.core.global.Security;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.actions.list.RemoveAction;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.DialogAction;
import com.haulmont.cuba.gui.components.Table;
//import com.haulmont.cuba.gui.components.actions.RemoveAction;
import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.NtkBOMItem;
import com.nniirt.eis.entity.NtkItem;
import com.nniirt.eis.entity.ntk.NtkRemarkItem;
import com.nniirt.eis.service.NtkService;

import javax.inject.Inject;
import javax.inject.Named;

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

    @Inject
    private Security security;

    @Named("remarksTable.remove")
    private RemoveAction remarksTableRemove;

    @Named("componentsTable.remove")
    private RemoveAction componentsTableRemove;

    @Subscribe("remarksTable")
    protected void onRemarksTableSelection(Table.SelectionEvent<NtkRemarkItem> event) {
        boolean check = true;
        for(NtkRemarkItem item : event.getSelected()){
            boolean ogt = (security.isSpecificPermitted("app.ntk.ogt") && (item.getOgt() == null ? false : item.getOgt()));
            boolean hts = (security.isSpecificPermitted("app.ntk.hts") && (item.getHts() == null ? false : item.getHts()));
            boolean ome = (security.isSpecificPermitted("app.ntk.ome") && (item.getOme() == null ? false : item.getOme()));
            boolean bmn = (security.isSpecificPermitted("app.ntk.bmn") && (item.getBmn() == null ? false : item.getBmn()));

            if(!(ogt || hts || ome || bmn)) check = false;
        }
        remarksTableRemove.setEnabled(check);
    }

    @Subscribe("componentsTable")
    protected void onComponentsTableSelection(Table.SelectionEvent<NtkBOMItem> event) {
        boolean check = true;
        for(NtkBOMItem item : event.getSelected()){
            boolean ogt = (security.isSpecificPermitted("app.ntk.ogt") && (item.getOgt() == null ? false : item.getOgt()));
            boolean hts = (security.isSpecificPermitted("app.ntk.hts") && (item.getHts() == null ? false : item.getHts()));
            boolean ome = (security.isSpecificPermitted("app.ntk.ome") && (item.getOme() == null ? false : item.getOme()));
            boolean bmn = (security.isSpecificPermitted("app.ntk.bmn") && (item.getBmn() == null ? false : item.getBmn()));

            if(!(ogt || hts || ome || bmn)) check = false;
        }
        componentsTableRemove.setEnabled(check);
    }
}