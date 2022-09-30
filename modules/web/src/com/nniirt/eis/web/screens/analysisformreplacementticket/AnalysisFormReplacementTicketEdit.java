package com.nniirt.eis.web.screens.analysisformreplacementticket;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisFormReplacementTicket;

@UiController("eis_AnalysisFormReplacementTicket.edit")
@UiDescriptor("analysis-form-replacement-ticket-edit.xml")
@EditedEntityContainer("analysisFormReplacementTicketDc")
@LoadDataBeforeShow
public class AnalysisFormReplacementTicketEdit extends StandardEditor<AnalysisFormReplacementTicket> {
}