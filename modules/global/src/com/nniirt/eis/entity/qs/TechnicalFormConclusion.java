package com.nniirt.eis.entity.qs;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "EIS_TECHNICAL_FORM_CONCLUSION")
@Entity(name = "eis_TechnicalFormConclusion")
public class TechnicalFormConclusion extends StandardEntity {
    private static final long serialVersionUID = -3707511408718764632L;

    @Lob
    @Column(name = "DEFINITION_")
    private String definition;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNTABLE_ID")
    private DivisionIndex accountable;

    @Temporal(TemporalType.DATE)
    @Column(name = "FINALDATE")
    private Date finaldate;

    @Column(name = "ADDRESS", length = 300)
    private String address;

    @Column(name = "RECIPIENT", length = 300)
    private String recipient;

    @Column(name = "FAX", length = 300)
    private String fax;

    @Column(name = "PHONE", length = 300)
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TECHNICAL_FORM_ID")
    private TechnicalForm technicalForm;

    public TechnicalForm getTechnicalForm() {
        return technicalForm;
    }

    public void setTechnicalForm(TechnicalForm technicalForm) {
        this.technicalForm = technicalForm;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getFinaldate() {
        return finaldate;
    }

    public void setFinaldate(Date finaldate) {
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