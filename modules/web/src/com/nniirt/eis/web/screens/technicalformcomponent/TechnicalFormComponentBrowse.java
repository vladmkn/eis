package com.nniirt.eis.web.screens.technicalformcomponent;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.TechnicalFormComponent;

@UiController("eis_TechnicalFormComponent.browse")
@UiDescriptor("technical-form-component-browse.xml")
@LookupComponent("technicalFormComponentsTable")
@LoadDataBeforeShow
public class TechnicalFormComponentBrowse extends StandardLookup<TechnicalFormComponent> {
}