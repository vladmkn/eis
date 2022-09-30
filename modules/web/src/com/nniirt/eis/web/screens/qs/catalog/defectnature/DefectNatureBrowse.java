package com.nniirt.eis.web.screens.qs.catalog.defectnature;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.catalog.DefectNature;

@UiController("eis_DefectNature.browse")
@UiDescriptor("defect-nature-browse.xml")
@LookupComponent("defectNaturesTable")
@LoadDataBeforeShow
public class DefectNatureBrowse extends StandardLookup<DefectNature> {
}