package com.nniirt.eis.web.screens.technicalform;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.TechnicalForm;

@UiController("eis_TechnicalForm.browse")
@UiDescriptor("technical-form-browse.xml")
@LookupComponent("technicalFormsTable")
@LoadDataBeforeShow
public class TechnicalFormBrowse extends StandardLookup<TechnicalForm> {
}