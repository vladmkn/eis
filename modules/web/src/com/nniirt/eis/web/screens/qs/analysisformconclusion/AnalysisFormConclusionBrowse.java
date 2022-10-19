package com.nniirt.eis.web.screens.qs.analysisformconclusion;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisFormConclusion;

@UiController("eis_AnalysisFormConclusion.browse")
@UiDescriptor("analysis-form-conclusion-browse.xml")
@LookupComponent("analysisFormConclusionsTable")
@LoadDataBeforeShow
public class AnalysisFormConclusionBrowse extends StandardLookup<AnalysisFormConclusion> {
}