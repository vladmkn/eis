package com.nniirt.eis.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "EIS_NTK_BOM_ITEM")
@Entity(name = "eis_NtkBOMItem")
public class NtkBOMItem extends StandardEntity {
    private static final long serialVersionUID = -7979183356712261856L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPONENT_ID")
    private NomenclatureItem component;

    @Column(name = "QUANTITY")
    private Double quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NTK_ITEM_ID")
    private NtkItem ntkItem;

    public NtkItem getNtkItem() {
        return ntkItem;
    }

    public void setNtkItem(NtkItem ntkItem) {
        this.ntkItem = ntkItem;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public NomenclatureItem getComponent() {
        return component;
    }

    public void setComponent(NomenclatureItem component) {
        this.component = component;
    }
}