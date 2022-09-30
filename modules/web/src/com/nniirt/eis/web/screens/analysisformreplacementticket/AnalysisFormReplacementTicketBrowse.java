package com.nniirt.eis.web.screens.analysisformreplacementticket;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.AnalysisFormReplacementTicket;

@UiController("eis_AnalysisFormReplacementTicket.browse")
@UiDescriptor("analysis-form-replacement-ticket-browse.xml")
@LookupComponent("analysisFormReplacementTicketsTable")
@LoadDataBeforeShow
public class AnalysisFormReplacementTicketBrowse extends StandardLookup<AnalysisFormReplacementTicket> {
}