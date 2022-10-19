package com.nniirt.eis.web.screens.qs.analysisformtf;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisFormTF;

@UiController("eis_AnalysisFormTF.edit")
@UiDescriptor("analysis-form-tf-edit.xml")
@EditedEntityContainer("analysisFormTFDc")
@LoadDataBeforeShow
public class AnalysisFormTFEdit extends StandardEditor<AnalysisFormTF> {
}