package com.nniirt.eis.web.screens.qs.catalog.possibilitycorrectingdefect;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.catalog.PossibilityCorrectingDefect;

@UiController("eis_PossibilityCorrectingDefect.browse")
@UiDescriptor("possibility-correcting-defect-browse.xml")
@LookupComponent("possibilityCorrectingDefectsTable")
@LoadDataBeforeShow
public class PossibilityCorrectingDefectBrowse extends StandardLookup<PossibilityCorrectingDefect> {
}