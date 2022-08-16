package com.nniirt.eis.web.screens.technicalformconclusion;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.TechnicalFormConclusion;

@UiController("eis_TechnicalFormConclusion.edit")
@UiDescriptor("technical-form-conclusion-edit.xml")
@EditedEntityContainer("technicalFormConclusionDc")
@LoadDataBeforeShow
public class TechnicalFormConclusionEdit extends StandardEditor<TechnicalFormConclusion> {
}