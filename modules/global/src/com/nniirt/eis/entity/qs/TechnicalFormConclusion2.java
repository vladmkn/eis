package com.nniirt.eis.entity.qs;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "EIS_TECHNICAL_FORM_CONCLUSION2")
@Entity(name = "eis_TechnicalFormConclusion2")
public class TechnicalFormConclusion2 extends StandardEntity {
    private static final long serialVersionUID = -2750286843747200674L;

    @Lob
    @Column(name = "DEFINITION_")
    private String definition;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNTABLE_ID")
    private DivisionIndex accountable;

    @Column(name = "FINALDATE", length = 300)
    private String finaldate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TECHNICAL_FORM_ID")
    private TechnicalForm technicalForm;

    public TechnicalForm getTechnicalForm() {
        return technicalForm;
    }

    public void setTechnicalForm(TechnicalForm technicalForm) {
        this.technicalForm = technicalForm;
    }

    public String getFinaldate() {
        return finaldate;
    }

    public void setFinaldate(String finaldate) {
        this.finaldate = finaldate;
    }

    public DivisionIndex getAccountable() {
        return accountable;
    }

    public void setAccountable(DivisionIndex accountable) {
        this.accountable = accountable;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}