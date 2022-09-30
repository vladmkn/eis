package com.nniirt.eis.web.screens.analysisformcomponent;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisFormComponent;

@UiController("eis_AnalysisFormComponent.browse")
@UiDescriptor("analysis-form-component-browse.xml")
@LookupComponent("analysisFormComponentsTable")
@LoadDataBeforeShow
public class AnalysisFormComponentBrowse extends StandardLookup<AnalysisFormComponent> {
}