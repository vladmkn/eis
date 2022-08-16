package com.nniirt.eis.web.screens.technicalformconclusion;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.TechnicalFormConclusion;

@UiController("eis_TechnicalFormConclusion.browse")
@UiDescriptor("technical-form-conclusion-browse.xml")
@LookupComponent("technicalFormConclusionsTable")
@LoadDataBeforeShow
public class TechnicalFormConclusionBrowse extends StandardLookup<TechnicalFormConclusion> {
}