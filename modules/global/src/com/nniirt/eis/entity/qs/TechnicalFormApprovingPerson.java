package com.nniirt.eis.entity.qs;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.nniirt.eis.entity.catalog.Employee;

import javax.persistence.*;

@Table(name = "EIS_TECHNICAL_FORM_APPROVING_PERSON")
@Entity(name = "eis_TechnicalFormApprovingPerson")
public class TechnicalFormApprovingPerson extends StandardEntity {
    private static final long serialVersionUID = 7698837009135509755L;

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