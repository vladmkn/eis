package com.nniirt.eis.entity.qs;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.nniirt.eis.entity.NomenclatureItem;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "EIS_TECHNICAL_FORM_COMPONENT")
@Entity(name = "eis_TechnicalFormComponent")
public class TechnicalFormComponent extends StandardEntity {
    private static final long serialVersionUID = -6517795481059190795L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPONENT_ID")
    private NomenclatureItem component;

    @Column(name = "COMPONENT_NUMBER")
    private String componentNumber;

    @Column(name = "QUANTITY", precision = 28, scale = 8)
    private BigDecimal quantity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TECHNICAL_FORM_ID")
    private TechnicalForm technicalForm;

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public TechnicalForm getTechnicalForm() {
        return technicalForm;
    }

    public void setTechnicalForm(TechnicalForm technicalForm) {
        this.technicalForm = technicalForm;
    }

    public String getComponentNumber() {
        return componentNumber;
    }

    public void setComponentNumber(String componentNumber) {
        this.componentNumber = componentNumber;
    }

    public NomenclatureItem getComponent() {
        return component;
    }

    public void setComponent(NomenclatureItem component) {
        this.component = component;
    }
}