package com.nniirt.eis.entity.qs;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "EIS_ANALYSIS_FORM_CONCLUSION_AL")
@Entity(name = "eis_AnalysisFormConclusionAL")
public class AnalysisFormConclusionAL extends StandardEntity {
    private static final long serialVersionUID = -6735322176993648781L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private DivisionIndex member;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANALYSIS_FORM_CONCLUSION_ID")
    private AnalysisFormConclusion analysisFormConclusion;

    public AnalysisFormConclusion getAnalysisFormConclusion() {
        return analysisFormConclusion;
    }

    public void setAnalysisFormConclusion(AnalysisFormConclusion analysisFormConclusion) {
        this.analysisFormConclusion = analysisFormConclusion;
    }

    public DivisionIndex getMember() {
        return member;
    }

    public void setMember(DivisionIndex member) {
        this.member = member;
    }
}