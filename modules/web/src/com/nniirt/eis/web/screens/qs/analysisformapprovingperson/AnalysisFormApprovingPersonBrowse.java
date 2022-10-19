package com.nniirt.eis.web.screens.qs.analysisformapprovingperson;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisFormApprovingPerson;

@UiController("eis_AnalysisFormApprovingPerson.browse")
@UiDescriptor("analysis-form-approving-person-browse.xml")
@LookupComponent("analysisFormApprovingPersonsTable")
@LoadDataBeforeShow
public class AnalysisFormApprovingPersonBrowse extends StandardLookup<AnalysisFormApprovingPerson> {
}