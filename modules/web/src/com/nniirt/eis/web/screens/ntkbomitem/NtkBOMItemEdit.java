package com.nniirt.eis.web.screens.ntkbomitem;

import com.haulmont.cuba.core.global.Security;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.DocumentStatuses;
import com.nniirt.eis.entity.NtkBOMItem;

import javax.inject.Inject;

@UiController("eis_NtkBOMItem.edit")
@UiDescriptor("ntk-bom-item-edit.xml")
@EditedEntityContainer("ntkBOMItemDc")
@LoadDataBeforeShow
public class NtkBOMItemEdit extends StandardEditor<NtkBOMItem> {
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
    private Security security;
    @Inject
    private Form form;
    @Inject
    private Button commitAndCloseBtn;
    @Inject
    private TextField routeField;
    @Inject
    private TextField quantityField;
    @Inject
    private TextField kzapField;
    @Inject
    private TextField ratioField;
    @Inject
    private TextField slkmField;
    @Inject
    private TextArea remarkField;
    @Inject
    private TextField sdragField;
    @Inject
    private TextField smetField;
    @Inject
    private TextField saktivField;
    @Inject
    private TextField shimField;

    private void setAccessToForm(Boolean wr, Boolean otpp)
    {
        componentField.setEditable(wr);
        quantityField.setEditable(wr);
        kzapField.setEditable(wr);
        ratioField.setEditable(wr);
        slkmField.setEditable(wr);
        remarkField.setEditable(wr);
        sdragField.setEditable(wr);
        smetField.setEditable(wr);
        saktivField.setEditable(wr);
        shimField.setEditable(wr);
        routeField.setEditable(wr || otpp);
    }

    @Subscribe
    protected void onAfterShow(AfterShowEvent event) {

        if(componentField.getValue() == null) {
            if (security.isSpecificPermitted("app.ntk.ogt")) ogtField.setValue(Boolean.TRUE); else
            if (security.isSpecificPermitted("app.ntk.ogtadd")) ogtaddField.setValue(Boolean.TRUE); else
            if (security.isSpecificPermitted("app.ntk.hts")) htsField.setValue(Boolean.TRUE); else
            if (security.isSpecificPermitted("app.ntk.ome")) omeField.setValue(Boolean.TRUE); else
            if (security.isSpecificPermitted("app.ntk.bmn")) bmnField.setValue(Boolean.TRUE); else
            if (security.isSpecificPermitted("app.ntk.otpp")) otppField.setValue(Boolean.TRUE);
        }

        boolean check =  ((security.isSpecificPermitted("app.ntk.ogt") && ogtField.getValue()) ||
                (security.isSpecificPermitted("app.ntk.ogtadd") && ogtaddField.getValue()) ||
                (security.isSpecificPermitted("app.ntk.hts") && htsField.getValue()) ||
                (security.isSpecificPermitted("app.ntk.ome") && omeField.getValue()) ||
                (security.isSpecificPermitted("app.ntk.bmn") && bmnField.getValue()) ||
                (security.isSpecificPermitted("app.ntk.otpp") && otppField.getValue())) &&
                !(getEditedEntity().getNtkItem().getStatus() != null &&
                        getEditedEntity().getNtkItem().getStatus() == DocumentStatuses.COMPLETED);

        setAccessToForm(check, security.isSpecificPermitted("app.ntk.otpp"));

        commitAndCloseBtn.setEnabled(check || security.isSpecificPermitted("app.ntk.otpp"));
        commitAndCloseBtn.setVisible(check || security.isSpecificPermitted("app.ntk.otpp"));
    }


}