package com.nniirt.eis.entity.qs;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.nniirt.eis.entity.catalog.Employee;

import javax.persistence.*;

@Table(name = "EIS_ANALYSIS_FORM_COMMISSION")
@Entity(name = "eis_AnalysisFormCommission")
public class AnalysisFormCommission extends StandardEntity {
    private static final long serialVersionUID = 5978145347787340172L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private Employee member;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANALYSIS_FORM_ID")
    private AnalysisForm analysisForm;

    public AnalysisForm getAnalysisForm() {
        return analysisForm;
    }

    public void setAnalysisForm(AnalysisForm analysisForm) {
        this.analysisForm = analysisForm;
    }

    public Employee getMember() {
        return member;
    }

    public void setMember(Employee member) {
        this.member = member;
    }
}