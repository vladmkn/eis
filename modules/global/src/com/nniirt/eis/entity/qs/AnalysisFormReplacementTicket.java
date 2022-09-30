package com.nniirt.eis.entity.qs;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "EIS_ANALYSIS_FORM_REPLACEMENT_TICKET")
@Entity(name = "eis_AnalysisFormReplacementTicket")
public class AnalysisFormReplacementTicket extends StandardEntity {
    private static final long serialVersionUID = -5141313546559386184L;

    @Column(name = "TICKET_NUM")
    private String ticketNum;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANALYSIS_FORM_ID")
    private AnalysisForm analysisForm;

    public AnalysisForm getAnalysisForm() {
        return analysisForm;
    }

    public void setAnalysisForm(AnalysisForm analysisForm) {
        this.analysisForm = analysisForm;
    }

    public String getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum;
    }
}