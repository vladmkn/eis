package com.nniirt.eis.web.screens.analysisformcomponent;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisFormComponent;

@UiController("eis_AnalysisFormComponent.edit")
@UiDescriptor("analysis-form-component-edit.xml")
@EditedEntityContainer("analysisFormComponentDc")
@LoadDataBeforeShow
public class AnalysisFormComponentEdit extends StandardEditor<AnalysisFormComponent> {
}