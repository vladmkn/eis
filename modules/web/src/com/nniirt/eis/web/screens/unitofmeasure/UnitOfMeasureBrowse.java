package com.nniirt.eis.web.screens.unitofmeasure;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.UnitOfMeasure;

@UiController("eis_UnitOfMeasure.browse")
@UiDescriptor("unit-of-measure-browse.xml")
@LookupComponent("unitOfMeasuresTable")
@LoadDataBeforeShow
public class UnitOfMeasureBrowse extends StandardLookup<UnitOfMeasure> {
}