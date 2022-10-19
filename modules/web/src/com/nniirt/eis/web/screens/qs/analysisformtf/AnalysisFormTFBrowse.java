package com.nniirt.eis.web.screens.qs.analysisformtf;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisFormTF;

@UiController("eis_AnalysisFormTF.browse")
@UiDescriptor("analysis-form-tf-browse.xml")
@LookupComponent("analysisFormTFsTable")
@LoadDataBeforeShow
public class AnalysisFormTFBrowse extends StandardLookup<AnalysisFormTF> {
}