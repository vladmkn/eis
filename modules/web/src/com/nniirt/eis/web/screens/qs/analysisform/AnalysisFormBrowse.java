package com.nniirt.eis.web.screens.qs.analysisform;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisForm;

@UiController("eis_AnalysisForm.browse")
@UiDescriptor("analysis-form-browse.xml")
@LookupComponent("analysisFormsTable")
@LoadDataBeforeShow
public class AnalysisFormBrowse extends StandardLookup<AnalysisForm> {
}