package com.nniirt.eis.web.screens.technicalformcommissions2;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.TechnicalFormCommissionS2;

@UiController("eis_TechnicalFormCommissionS2.browse")
@UiDescriptor("technical-form-commission-s2-browse.xml")
@LookupComponent("technicalFormCommissionS2sTable")
@LoadDataBeforeShow
public class TechnicalFormCommissionS2Browse extends StandardLookup<TechnicalFormCommissionS2> {
}