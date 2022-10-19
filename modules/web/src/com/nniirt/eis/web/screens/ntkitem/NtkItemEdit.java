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
import com.nniirt.eis.entity.NomenclatureItem;
import com.nniirt.eis.entity.NtkBOMItem;
import com.nniirt.eis.entity.NtkItem;
import com.nniirt.eis.entity.ntk.NtkRemarkItem;
import com.nniirt.eis.service.NtkService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.Column;
import java.math.BigDecimal;

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
    protected CheckBox ogtaddField;
    @Inject
    protected CheckBox htsField;
    @Inject
    protected CheckBox omeField;
    @Inject
    protected CheckBox bmnField;
    @Inject
    protected CheckBox otppField;
    @Inject
    protected CheckBox ogtmaterialField;
    @Inject
    protected CheckBox ogtaddmaterialField;
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

    @Inject
    private GroupBoxLayout grpGeometry;

    @Inject
    private GroupBoxLayout grpMaterialSize;

    @Inject
    private TextField gmLengthField;

    @Inject
    private TextField gmWidthField;

    @Inject
    private TextField gmHeightField;

    @Inject
    private TextField gmDiameterField;

    @Inject
    private TextField gbLengthField;

    @Inject
    private TextField gbWidthField;

    @Inject
    private TextField gbHeightField;

    @Inject
    private TextField gbDiameterField;

    @Inject
    private TextField materialRouteField;

    private NomenclatureItem oldComponent;
    private String oldMaterialRoute;
    private BigDecimal oldGmLength;
    private BigDecimal oldGmWidth;
    private BigDecimal oldGmHeight;
    private BigDecimal oldGmDiameter;

    private void enableGeometry(boolean check){
        gbLengthField.setEditable(check);
        gbWidthField.setEditable(check);
        gbHeightField.setEditable(check);
        gbDiameterField.setEditable(check);
    }

    private void enableMaterialGeometry(boolean check){
        gmLengthField.setEditable(check);
        gmWidthField.setEditable(check);
        gmHeightField.setEditable(check);
        gmDiameterField.setEditable(check);
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
            enableGeometry(false);
            enableMaterialGeometry(false);
            ogtField.setEditable(false);
            htsField.setEditable(false);
            omeField.setEditable(false);
            bmnField.setEditable(false);
        }else{
            ogtField.setEditable (security.isSpecificPermitted("app.ntk.ogt"));
            ogtaddField.setEditable (security.isSpecificPermitted("app.ntk.ogtadd"));
            htsField.setEditable (security.isSpecificPermitted("app.ntk.hts"));
            omeField.setEditable (security.isSpecificPermitted("app.ntk.ome"));
            bmnField.setEditable (security.isSpecificPermitted("app.ntk.bmn"));
            otppField.setEditable (security.isSpecificPermitted("app.ntk.otpp"));

            oldComponent = getEditedEntity().getComponent();
            oldMaterialRoute = getEditedEntity().getMaterialRoute();
            oldGmLength = getEditedEntity().getGmLength();
            oldGmWidth = getEditedEntity().getGmWidth();
            oldGmHeight = getEditedEntity().getGmHeight();
            oldGmDiameter = getEditedEntity().getGmDiameter();

            boolean check = security.isSpecificPermitted("app.ntk.ogt") ||
                    security.isSpecificPermitted("app.ntk.ogtadd") ||
                    security.isSpecificPermitted("app.ntk.hts") ||
                    security.isSpecificPermitted("app.ntk.ome") ||
                    security.isSpecificPermitted("app.ntk.bmn") ||
                    security.isSpecificPermitted("app.ntk.otpp");

            remarksTableCreate.setVisible(check);
            componentsTableCreate.setVisible(check);

            formMainTab.setEditable(security.isSpecificPermitted("app.ntk.ogt"));
            enableGeometry(security.isSpecificPermitted("app.ntk.ogt"));

            if(componentField.getValue() != null && ogtmaterialField.getValue() && !htsmaterialField.getValue()
                    && !ogtaddmaterialField.getValue()) {
                formMaterialTab.setEditable(security.isSpecificPermitted("app.ntk.ogt"));
                enableMaterialGeometry(security.isSpecificPermitted("app.ntk.ogt"));
            }
            if(componentField.getValue() != null && htsmaterialField.getValue() && !ogtmaterialField.getValue()
                    && !ogtaddmaterialField.getValue()) {
                formMaterialTab.setEditable(security.isSpecificPermitted("app.ntk.hts"));
                enableMaterialGeometry(security.isSpecificPermitted("app.ntk.hts"));
            }
            if(componentField.getValue() != null && ogtaddmaterialField.getValue() && !ogtmaterialField.getValue()
                    && !htsmaterialField.getValue()) {
                formMaterialTab.setEditable(security.isSpecificPermitted("app.ntk.ogtadd"));
                enableMaterialGeometry(security.isSpecificPermitted("app.ntk.ogtadd"));
            }
            if(!security.isSpecificPermitted("app.ntk.hts") && !security.isSpecificPermitted("app.ntk.ogt")
                    && !security.isSpecificPermitted("app.ntk.ogtadd")) {
                formMaterialTab.setEditable(false);
                enableMaterialGeometry(false);
            }
        }
    }

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {

        if (getEditedEntity().getComponent() != oldComponent ||
                getEditedEntity().getGmHeight() != oldGmHeight ||
                getEditedEntity().getGmDiameter() != oldGmDiameter ||
                getEditedEntity().getGmLength() != oldGmLength ||
                getEditedEntity().getGmWidth() != oldGmWidth ||
                getEditedEntity().getMaterialRoute() != oldMaterialRoute)
        {
            getEditedEntity().setOgtmaterial(security.isSpecificPermitted("app.ntk.ogt"));
            getEditedEntity().setHtsmaterial(security.isSpecificPermitted("app.ntk.hts"));
        }

        if (getEditedEntity().getBmn() != null && getEditedEntity().getBmn() &&
                getEditedEntity().getHts() != null && getEditedEntity().getHts() &&
                getEditedEntity().getOme() != null && getEditedEntity().getOme() &&
                getEditedEntity().getOgt() != null && getEditedEntity().getOgt() &&
                getEditedEntity().getOgtadd() != null && getEditedEntity().getOgtadd() &&
                getEditedEntity().getOtpp() != null && getEditedEntity().getOtpp() &&
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
            boolean ogtadd = (security.isSpecificPermitted("app.ntk.ogtadd") && (item.getOgtadd() == null ? false : item.getOgtadd()));
            boolean hts = (security.isSpecificPermitted("app.ntk.hts") && (item.getHts() == null ? false : item.getHts()));
            boolean ome = (security.isSpecificPermitted("app.ntk.ome") && (item.getOme() == null ? false : item.getOme()));
            boolean bmn = (security.isSpecificPermitted("app.ntk.bmn") && (item.getBmn() == null ? false : item.getBmn()));
            boolean otpp = (security.isSpecificPermitted("app.ntk.otpp") && (item.getOtpp() == null ? false : item.getOtpp()));

            if(!(ogt || ogtadd || hts || ome || bmn || otpp)) check = false;
        }
        remarksTableRemove.setEnabled(check);
    }

    @Subscribe("componentsTable")
    protected void onComponentsTableSelection(Table.SelectionEvent<NtkBOMItem> event) {
        boolean check = true;
        for(NtkBOMItem item : event.getSelected()){
            boolean ogt = (security.isSpecificPermitted("app.ntk.ogt") && (item.getOgt() == null ? false : item.getOgt()));
            boolean ogtadd = (security.isSpecificPermitted("app.ntk.ogtadd") && (item.getOgtadd() == null ? false : item.getOgtadd()));
            boolean hts = (security.isSpecificPermitted("app.ntk.hts") && (item.getHts() == null ? false : item.getHts()));
            boolean ome = (security.isSpecificPermitted("app.ntk.ome") && (item.getOme() == null ? false : item.getOme()));
            boolean bmn = (security.isSpecificPermitted("app.ntk.bmn") && (item.getBmn() == null ? false : item.getBmn()));
            boolean otpp = (security.isSpecificPermitted("app.ntk.otpp") && (item.getOtpp() == null ? false : item.getOtpp()));

            if(!(ogt || ogtadd || hts || ome || bmn || otpp)) check = false;
        }
        componentsTableRemove.setEnabled(check);
    }
}