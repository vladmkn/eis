package com.nniirt.eis.entity.qs;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.List;

@Table(name = "EIS_ANALYSIS_FORM_CONCLUSION")
@Entity(name = "eis_AnalysisFormConclusion")
public class AnalysisFormConclusion extends StandardEntity {
    private static final long serialVersionUID = -1865511617195994911L;

    @Lob
    @Column(name = "DEFINITION_")
    private String definition;

    @Column(name = "FINALDATE", length = 300)
    private String finaldate;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "analysisFormConclusion")
    private List<AnalysisFormConclusionAL> accountable;

    @Column(name = "RECIPIENT", length = 300)
    private String recipient;

    @Column(name = "ADDRESS", length = 300)
    private String address;

    @Column(name = "FAX", length = 300)
    private String fax;

    @Column(name = "PHONE", length = 300)
    private String phone;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public List<AnalysisFormConclusionAL> getAccountable() {
        return accountable;
    }

    public void setAccountable(List<AnalysisFormConclusionAL> accountable) {
        this.accountable = accountable;
    }

    public String getFinaldate() {
        return finaldate;
    }

    public void setFinaldate(String finaldate) {
        this.finaldate = finaldate;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}