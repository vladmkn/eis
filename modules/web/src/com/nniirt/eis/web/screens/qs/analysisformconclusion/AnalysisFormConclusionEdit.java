package com.nniirt.eis.web.screens.qs.analysisformconclusion;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisFormConclusion;

@UiController("eis_AnalysisFormConclusion.edit")
@UiDescriptor("analysis-form-conclusion-edit.xml")
@EditedEntityContainer("analysisFormConclusionDc")
@LoadDataBeforeShow
public class AnalysisFormConclusionEdit extends StandardEditor<AnalysisFormConclusion> {
}