package com.nniirt.eis.web.screens.qs.analysisform;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisForm;

@UiController("eis_AnalysisForm.edit")
@UiDescriptor("analysis-form-edit.xml")
@EditedEntityContainer("analysisFormDc")
@LoadDataBeforeShow
public class AnalysisFormEdit extends StandardEditor<AnalysisForm> {
}