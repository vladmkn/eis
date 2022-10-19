package com.nniirt.eis.web.screens.qs.analysisformcommission;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisFormCommission;

@UiController("eis_AnalysisFormCommission.edit")
@UiDescriptor("analysis-form-commission-edit.xml")
@EditedEntityContainer("analysisFormCommissionDc")
@LoadDataBeforeShow
public class AnalysisFormCommissionEdit extends StandardEditor<AnalysisFormCommission> {
}