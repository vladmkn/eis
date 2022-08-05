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

    @Column(name = "ROUTE")
    private String route;

    @Column(name = "SLKM")
    private Double slkm;

    @Column(name = "SDRAG")
    private Double sdrag;

    @Column(name = "SMET")
    private Double smet;

    @Column(name = "SAKTIV")
    private Double saktiv;

    @Column(name = "SHIM")
    private Double shim;

    @Column(name = "KZAP")
    private Double kzap;

    @Column(name = "RATIO")
    private Double ratio;

    @Lob
    @Column(name = "REMARK")
    private String remark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NTK_ITEM_ID")
    private NtkItem ntkItem;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    public Double getKzap() {
        return kzap;
    }

    public void setKzap(Double kzap) {
        this.kzap = kzap;
    }

    public Double getShim() {
        return shim;
    }

    public void setShim(Double shim) {
        this.shim = shim;
    }

    public Double getSaktiv() {
        return saktiv;
    }

    public void setSaktiv(Double saktiv) {
        this.saktiv = saktiv;
    }

    public Double getSmet() {
        return smet;
    }

    public void setSmet(Double smet) {
        this.smet = smet;
    }

    public Double getSdrag() {
        return sdrag;
    }

    public void setSdrag(Double sdrag) {
        this.sdrag = sdrag;
    }

    public Double getSlkm() {
        return slkm;
    }

    public void setSlkm(Double slkm) {
        this.slkm = slkm;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

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