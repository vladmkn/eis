package com.nniirt.eis.entity.qs;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "EIS_TECHNICAL_FORM_COMMISSION_S2")
@Entity(name = "eis_TechnicalFormCommissionS2")
public class TechnicalFormCommissionS2 extends StandardEntity {
    private static final long serialVersionUID = -8576251396874017880L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DIVISION_ID")
    private DivisionIndex division;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TECHNICAL_FORM_ID")
    private TechnicalForm technicalForm;

    public TechnicalForm getTechnicalForm() {
        return technicalForm;
    }

    public void setTechnicalForm(TechnicalForm technicalForm) {
        this.technicalForm = technicalForm;
    }

    public DivisionIndex getDivision() {
        return division;
    }

    public void setDivision(DivisionIndex division) {
        this.division = division;
    }
}