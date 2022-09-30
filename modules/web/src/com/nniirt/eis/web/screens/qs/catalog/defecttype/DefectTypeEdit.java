package com.nniirt.eis.web.screens.qs.catalog.defecttype;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.catalog.DefectType;

@UiController("eis_DefectType.edit")
@UiDescriptor("defect-type-edit.xml")
@EditedEntityContainer("defectTypeDc")
@LoadDataBeforeShow
public class DefectTypeEdit extends StandardEditor<DefectType> {
}