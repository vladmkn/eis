package com.nniirt.eis.entity.qs;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.nniirt.eis.entity.catalog.Employee;

import javax.persistence.*;

@Table(name = "EIS_TECHNICAL_FORM_COMMISSION")
@Entity(name = "eis_TechnicalFormCommission")
public class TechnicalFormCommission extends StandardEntity {
    private static final long serialVersionUID = 5857375632832814082L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private Employee member;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TECHNICAL_FORM_ID")
    private TechnicalForm technicalForm;

    public TechnicalForm getTechnicalForm() {
        return technicalForm;
    }

    public void setTechnicalForm(TechnicalForm technicalForm) {
        this.technicalForm = technicalForm;
    }

    public Employee getMember() {
        return member;
    }

    public void setMember(Employee member) {
        this.member = member;
    }
}