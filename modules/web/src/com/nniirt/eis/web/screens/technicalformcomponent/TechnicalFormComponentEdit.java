package com.nniirt.eis.web.screens.technicalformcomponent;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.TechnicalFormComponent;

@UiController("eis_TechnicalFormComponent.edit")
@UiDescriptor("technical-form-component-edit.xml")
@EditedEntityContainer("technicalFormComponentDc")
@LoadDataBeforeShow
public class TechnicalFormComponentEdit extends StandardEditor<TechnicalFormComponent> {
}