package com.nniirt.eis.web.screens.technicalformconclusion2;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.TechnicalFormConclusion2;

@UiController("eis_TechnicalFormConclusion2.browse")
@UiDescriptor("technical-form-conclusion2-browse.xml")
@LookupComponent("technicalFormConclusion2sTable")
@LoadDataBeforeShow
public class TechnicalFormConclusion2Browse extends StandardLookup<TechnicalFormConclusion2> {
}