package com.nniirt.eis.web.screens.technicalformcommission;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.TechnicalFormCommission;

@UiController("eis_TechnicalFormCommission.edit")
@UiDescriptor("technical-form-commission-edit.xml")
@EditedEntityContainer("technicalFormCommissionDc")
@LoadDataBeforeShow
public class TechnicalFormCommissionEdit extends StandardEditor<TechnicalFormCommission> {
}