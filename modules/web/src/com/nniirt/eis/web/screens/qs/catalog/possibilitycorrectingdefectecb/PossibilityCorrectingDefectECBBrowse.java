package com.nniirt.eis.web.screens.qs.catalog.possibilitycorrectingdefectecb;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.catalog.PossibilityCorrectingDefectECB;

@UiController("eis_PossibilityCorrectingDefectECB.browse")
@UiDescriptor("possibility-correcting-defect-ecb-browse.xml")
@LookupComponent("possibilityCorrectingDefectECBsTable")
@LoadDataBeforeShow
public class PossibilityCorrectingDefectECBBrowse extends StandardLookup<PossibilityCorrectingDefectECB> {
}