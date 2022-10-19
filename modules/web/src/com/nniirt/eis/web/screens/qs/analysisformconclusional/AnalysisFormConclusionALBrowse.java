package com.nniirt.eis.web.screens.qs.analysisformconclusional;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisFormConclusionAL;

@UiController("eis_AnalysisFormConclusionAL.browse")
@UiDescriptor("analysis-form-conclusion-al-browse.xml")
@LookupComponent("analysisFormConclusionALsTable")
@LoadDataBeforeShow
public class AnalysisFormConclusionALBrowse extends StandardLookup<AnalysisFormConclusionAL> {
}