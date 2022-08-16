package com.nniirt.eis.web.screens.technicalformcommission;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.TechnicalFormCommission;

@UiController("eis_TechnicalFormCommission.browse")
@UiDescriptor("technical-form-commission-browse.xml")
@LookupComponent("technicalFormCommissionsTable")
@LoadDataBeforeShow
public class TechnicalFormCommissionBrowse extends StandardLookup<TechnicalFormCommission> {
}