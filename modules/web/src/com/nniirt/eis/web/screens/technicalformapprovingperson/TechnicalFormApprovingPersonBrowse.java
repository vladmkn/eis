package com.nniirt.eis.web.screens.technicalformapprovingperson;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.TechnicalFormApprovingPerson;

@UiController("eis_TechnicalFormApprovingPerson.browse")
@UiDescriptor("technical-form-approving-person-browse.xml")
@LookupComponent("technicalFormApprovingPersonsTable")
@LoadDataBeforeShow
public class TechnicalFormApprovingPersonBrowse extends StandardLookup<TechnicalFormApprovingPerson> {
}