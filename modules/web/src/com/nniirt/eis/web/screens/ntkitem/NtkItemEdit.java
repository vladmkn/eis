package com.nniirt.eis.web.screens.ntkitem;

import com.haulmont.cuba.core.global.Security;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.actions.list.CreateAction;
import com.haulmont.cuba.gui.actions.list.EditAction;
import com.haulmont.cuba.gui.actions.list.RemoveAction;
import com.haulmont.cuba.gui.components.*;
//import com.haulmont.cuba.gui.components.actions.RemoveAction;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.reports.gui.actions.EditorPrintFormAction;
import com.nniirt.eis.entity.DocumentStatuses;
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
    protected PickerField componentField;
    @Inject
    protected CheckBox ogtField;
    @Inject
    protected CheckBox htsField;
    @Inject
    protected CheckBox omeField;
    @Inject
    protected CheckBox bmnField;
    @Inject
    protected CheckBox ogtmaterialField;
    @Inject
    protected CheckBox htsmaterialField;
    @Inject
    private Security security;

    @Named("remarksTable.remove")
    private RemoveAction remarksTableRemove;

    @Named("componentsTable.remove")
    private RemoveAction componentsTableRemove;

    @Named("remarksTable.create")
    private CreateAction remarksTableCreate;

    @Named("componentsTable.create")
    private CreateAction componentsTableCreate;

    @Named("remarksTable.edit")
    private EditAction remarksTableEdit;

    @Named("componentsTable.edit")
    private EditAction componentsTableEdit;

    @Inject
    private Form formMainTab;

    @Inject
    private Form formMaterialTab;

    @Inject
    private Table componentsTable;

    @Inject
    private Table remarksTable;

    @Subscribe
    public void onInit(InitEvent event) {
        componentField.addFieldValueChangeListener(valueChangeEvent -> {
            ogtmaterialField.setValue(security.isSpecificPermitted("app.ntk.ogt"));
            htsmaterialField.setValue(security.isSpecificPermitted("app.ntk.hts"));
        });
    }

    @Subscribe
    protected void onAfterShow(AfterShowEvent event) {
        if(getEditedEntity().getStatus() != null && getEditedEntity().getStatus() == DocumentStatuses.COMPLETED){
            formMainTab.setEditable(false);
            formMaterialTab.setEditable(false);
            componentsTable.setEditable(false);
            remarksTable.setEditable(false);
            remarksTableRemove.setVisible(false);
            componentsTableRemove.setVisible(false);
            remarksTableCreate.setVisible(false);
            componentsTableCreate.setVisible(false);
            remarksTableEdit.setVisible(false);
            componentsTableEdit.setVisible(false);
            ogtField.setEditable(false);
            htsField.setEditable(false);
            omeField.setEditable(false);
            bmnField.setEditable(false);
        }else{
            ogtField.setEditable (security.isSpecificPermitted("app.ntk.ogt"));
            htsField.setEditable (security.isSpecificPermitted("app.ntk.hts"));
            omeField.setEditable (security.isSpecificPermitted("app.ntk.ome"));
            bmnField.setEditable (security.isSpecificPermitted("app.ntk.bmn"));

            formMainTab.setEditable(security.isSpecificPermitted("app.ntk.ogt"));

            if(componentField.getValue() != null && ogtmaterialField.getValue() && !htsmaterialField.getValue())
                formMaterialTab.setEditable(security.isSpecificPermitted("app.ntk.ogt"));
            if(componentField.getValue() != null && htsmaterialField.getValue() && !ogtmaterialField.getValue())
                formMaterialTab.setEditable(security.isSpecificPermitted("app.ntk.hts"));

            if(!security.isSpecificPermitted("app.ntk.hts") && !security.isSpecificPermitted("app.ntk.ogt"))
                formMaterialTab.setEditable(false);
        }
    }

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        if (getEditedEntity().getBmn() != null && getEditedEntity().getBmn() &&
                getEditedEntity().getHts() != null && getEditedEntity().getHts() &&
                getEditedEntity().getOme() != null && getEditedEntity().getOme() &&
                getEditedEntity().getOgt() != null && getEditedEntity().getOgt() &&
                (getEditedEntity().getStatus() == null || getEditedEntity().getStatus() != DocumentStatuses.COMPLETED)) {
                    dialogs.createOptionDialog()
                    .withCaption("Внимание!")
                    .withMessage("Все подразделения подтвердили обработку НТК? Переводим статус в состояние 'Утвержден'")
                    .withActions(
                            new DialogAction(DialogAction.Type.OK).withHandler(e -> {
                                getEditedEntity().setStatus(DocumentStatuses.COMPLETED);

                                event.resume(commitChanges());
                            }),
                            new DialogAction(DialogAction.Type.CANCEL)
                    )
                    .show();

            event.preventCommit();
        }
    }

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