package com.nniirt.eis.web.screens.qs.analysisformconclusional;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisFormConclusionAL;

@UiController("eis_AnalysisFormConclusionAL.edit")
@UiDescriptor("analysis-form-conclusion-al-edit.xml")
@EditedEntityContainer("analysisFormConclusionALDc")
@LoadDataBeforeShow
public class AnalysisFormConclusionALEdit extends StandardEditor<AnalysisFormConclusionAL> {
}