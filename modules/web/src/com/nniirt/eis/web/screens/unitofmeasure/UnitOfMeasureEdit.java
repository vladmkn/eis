package com.nniirt.eis.web.screens.unitofmeasure;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.UnitOfMeasure;

@UiController("eis_UnitOfMeasure.edit")
@UiDescriptor("unit-of-measure-edit.xml")
@EditedEntityContainer("unitOfMeasureDc")
@LoadDataBeforeShow
public class UnitOfMeasureEdit extends StandardEditor<UnitOfMeasure> {
}