package com.nniirt.eis.web.screens.ntk.ntkremarkitem;

import com.haulmont.cuba.core.global.Security;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.DocumentStatuses;
import com.nniirt.eis.entity.ntk.NtkRemarkItem;

import javax.inject.Inject;

@UiController("eis_NtkRemarkItem.edit")
@UiDescriptor("ntk-remark-item-edit.xml")
@EditedEntityContainer("ntkRemarkItemDc")
@LoadDataBeforeShow
public class NtkRemarkItemEdit extends StandardEditor<NtkRemarkItem> {
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
    protected TextArea textField;
    @Inject
    private Security security;
    @Inject
    private Form form;
    @Inject
    private Button commitAndCloseBtn;

    @Subscribe
    protected void onAfterShow(AfterShowEvent event) {

        if(textField.getRawValue().length() == 0) {
            if (security.isSpecificPermitted("app.ntk.ogt")) ogtField.setValue(Boolean.TRUE); else
            if (security.isSpecificPermitted("app.ntk.ogtadd")) ogtaddField.setValue(Boolean.TRUE); else
            if (security.isSpecificPermitted("app.ntk.hts")) htsField.setValue(Boolean.TRUE); else
            if (security.isSpecificPermitted("app.ntk.ome")) omeField.setValue(Boolean.TRUE); else
            if (security.isSpecificPermitted("app.ntk.bmn")) bmnField.setValue(Boolean.TRUE);else
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