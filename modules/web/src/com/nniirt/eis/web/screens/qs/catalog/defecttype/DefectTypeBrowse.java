package com.nniirt.eis.web.screens.qs.catalog.defecttype;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.catalog.DefectType;

@UiController("eis_DefectType.browse")
@UiDescriptor("defect-type-browse.xml")
@LookupComponent("defectTypesTable")
@LoadDataBeforeShow
public class DefectTypeBrowse extends StandardLookup<DefectType> {
}