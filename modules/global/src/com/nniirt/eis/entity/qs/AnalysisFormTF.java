package com.nniirt.eis.entity.qs;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "EIS_ANALYSIS_FORM_TF")
@Entity(name = "eis_AnalysisFormTF")
public class AnalysisFormTF extends StandardEntity {
    private static final long serialVersionUID = 7001090865071075311L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TECHNICAL_FORM_ID")
    private TechnicalForm technicalForm;

    @Lob
    @Column(name = "DEFINITION_")
    private String definition;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANALYSIS_FORM_ID")
    private AnalysisForm analysisForm;

    public AnalysisForm getAnalysisForm() {
        return analysisForm;
    }

    public void setAnalysisForm(AnalysisForm analysisForm) {
        this.analysisForm = analysisForm;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public TechnicalForm getTechnicalForm() {
        return technicalForm;
    }

    public void setTechnicalForm(TechnicalForm technicalForm) {
        this.technicalForm = technicalForm;
    }
}