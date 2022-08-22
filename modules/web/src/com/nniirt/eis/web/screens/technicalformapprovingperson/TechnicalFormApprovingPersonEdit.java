package com.nniirt.eis.web.screens.technicalformapprovingperson;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.TechnicalFormApprovingPerson;

@UiController("eis_TechnicalFormApprovingPerson.edit")
@UiDescriptor("technical-form-approving-person-edit.xml")
@EditedEntityContainer("technicalFormApprovingPersonDc")
@LoadDataBeforeShow
public class TechnicalFormApprovingPersonEdit extends StandardEditor<TechnicalFormApprovingPerson> {
}