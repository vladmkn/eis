package com.nniirt.eis.web.screens.ntkbomitem;

import com.haulmont.cuba.core.global.Security;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.Form;
import com.haulmont.cuba.gui.components.PickerField;
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

        form.setEditable(check);
        commitAndCloseBtn.setEnabled(check);
        commitAndCloseBtn.setVisible(check);

    }
}