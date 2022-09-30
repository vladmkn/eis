package com.nniirt.eis.web.screens.qs.catalog.defectnature;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.catalog.DefectNature;

@UiController("eis_DefectNature.edit")
@UiDescriptor("defect-nature-edit.xml")
@EditedEntityContainer("defectNatureDc")
@LoadDataBeforeShow
public class DefectNatureEdit extends StandardEditor<DefectNature> {
}