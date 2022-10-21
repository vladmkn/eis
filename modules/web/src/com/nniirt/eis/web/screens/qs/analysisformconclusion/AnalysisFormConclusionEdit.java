package com.nniirt.eis.web.screens.qs.analysisformconclusion;

import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisFormConclusion;

import javax.inject.Inject;

@UiController("eis_AnalysisFormConclusion.edit")
@UiDescriptor("analysis-form-conclusion-edit.xml")
@EditedEntityContainer("analysisFormConclusionDc")
@LoadDataBeforeShow
public class AnalysisFormConclusionEdit extends StandardEditor<AnalysisFormConclusion> {
    @Inject
    protected TextField recipientField;
    @Inject
    protected TextField addressField;
    @Inject
    protected TextField faxField;
    @Inject
    protected TextField phoneField;
    @Subscribe
    protected void onAfterShow(AfterShowEvent event) {
        boolean extDoc = false;
        if(getEditedEntity().getAnalysisForm() != null &&
                getEditedEntity().getAnalysisForm().getExternalDocument() != null) {
            extDoc = getEditedEntity().getAnalysisForm().getExternalDocument().booleanValue();
        }

        recipientField.setVisible(extDoc);
        addressField.setVisible(extDoc);
        faxField.setVisible(extDoc);
        phoneField.setVisible(extDoc);
    }


}