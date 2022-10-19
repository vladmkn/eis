package com.nniirt.eis.web.screens.qs.analysisformapprovingperson;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisFormApprovingPerson;

@UiController("eis_AnalysisFormApprovingPerson.edit")
@UiDescriptor("analysis-form-approving-person-edit.xml")
@EditedEntityContainer("analysisFormApprovingPersonDc")
@LoadDataBeforeShow
public class AnalysisFormApprovingPersonEdit extends StandardEditor<AnalysisFormApprovingPerson> {
}