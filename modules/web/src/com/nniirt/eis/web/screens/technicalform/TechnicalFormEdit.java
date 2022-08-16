package com.nniirt.eis.web.screens.technicalform;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.TechnicalForm;

@UiController("eis_TechnicalForm.edit")
@UiDescriptor("technical-form-edit.xml")
@EditedEntityContainer("technicalFormDc")
@LoadDataBeforeShow
public class TechnicalFormEdit extends StandardEditor<TechnicalForm> {
}