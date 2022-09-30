package com.nniirt.eis.entity.qs;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.nniirt.eis.entity.NomenclatureItem;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "EIS_ANALYSIS_FORM_COMPONENT")
@Entity(name = "eis_AnalysisFormComponent")
public class AnalysisFormComponent extends StandardEntity {
    private static final long serialVersionUID = 26896452650090226L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPONENT_ID")
    private NomenclatureItem component;

    @Column(name = "QUANTITY", precision = 28, scale = 8)
    private BigDecimal quantity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANALYSIS_FORM_ID")
    private AnalysisForm analysisForm;

    public AnalysisForm getAnalysisForm() {
        return analysisForm;
    }

    public void setAnalysisForm(AnalysisForm analysisForm) {
        this.analysisForm = analysisForm;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public NomenclatureItem getComponent() {
        return component;
    }

    public void setComponent(NomenclatureItem component) {
        this.component = component;
    }
}