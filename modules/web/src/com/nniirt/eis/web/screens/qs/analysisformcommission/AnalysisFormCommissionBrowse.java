package com.nniirt.eis.web.screens.qs.analysisformcommission;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisFormCommission;

@UiController("eis_AnalysisFormCommission.browse")
@UiDescriptor("analysis-form-commission-browse.xml")
@LookupComponent("analysisFormCommissionsTable")
@LoadDataBeforeShow
public class AnalysisFormCommissionBrowse extends StandardLookup<AnalysisFormCommission> {
}