package com.nniirt.eis.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "EIS_NTK_BOM_ITEM")
@Entity(name = "eis_NtkBOMItem")
public class NtkBOMItem extends StandardEntity {
    private static final long serialVersionUID = -7979183356712261856L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COMPONENT_ID")
    @NotNull
    private NomenclatureItem component;

    @Column(name = "QUANTITY", precision = 28, scale = 8)
    private BigDecimal quantity;

    @Column(name = "ROUTE")
    private String route;

    @Column(name = "SLKM", precision = 28, scale = 8)
    private BigDecimal slkm;

    @Column(name = "SDRAG", precision = 28, scale = 8)
    private BigDecimal sdrag;

    @Column(name = "SMET", precision = 28, scale = 8)
    private BigDecimal smet;

    @Column(name = "SAKTIV", precision = 28, scale = 8)
    private BigDecimal saktiv;

    @Column(name = "SHIM", precision = 28, scale = 8)
    private BigDecimal shim;

    @Column(name = "KZAP", precision = 28, scale = 8)
    private BigDecimal kzap;

    @Column(name = "RATIO", precision = 28, scale = 8)
    private BigDecimal ratio;

    @Lob
    @Column(name = "REMARK")
    private String remark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NTK_ITEM_ID")
    private NtkItem ntkItem;

    @Column(name = "OGT")
    private Boolean ogt;

    @Column(name = "HTS")
    private Boolean hts;

    @Column(name = "OME")
    private Boolean ome;

    @Column(name = "BMN")
    private Boolean bmn;

    @Column(name = "OTPP")
    private Boolean otpp;

    @Column(name = "OGTADD")
    private Boolean ogtadd;

    public Boolean getOtpp() {
        return otpp;
    }

    public void setOtpp(Boolean otpp) {
        this.otpp = otpp;
    }

    public Boolean getOgtadd() {
        return ogtadd;
    }

    public void setOgtadd(Boolean ogtadd) {
        this.ogtadd = ogtadd;
    }

    public Boolean getBmn() {
        return bmn;
    }

    public void setBmn(Boolean bmn) {
        this.bmn = bmn;
    }

    public Boolean getOme() {
        return ome;
    }

    public void setOme(Boolean ome) {
        this.ome = ome;
    }

    public Boolean getHts() {
        return hts;
    }

    public void setHts(Boolean hts) {
        this.hts = hts;
    }

    public Boolean getOgt() {
        return ogt;
    }

    public void setOgt(Boolean ogt) {
        this.ogt = ogt;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setSlkm(BigDecimal slkm) {
        this.slkm = slkm;
    }

    public BigDecimal getSlkm() {
        return slkm;
    }

    public void setSdrag(BigDecimal sdrag) {
        this.sdrag = sdrag;
    }

    public BigDecimal getSdrag() {
        return sdrag;
    }

    public void setSmet(BigDecimal smet) {
        this.smet = smet;
    }

    public BigDecimal getSmet() {
        return smet;
    }

    public void setSaktiv(BigDecimal saktiv) {
        this.saktiv = saktiv;
    }

    public BigDecimal getSaktiv() {
        return saktiv;
    }

    public void setShim(BigDecimal shim) {
        this.shim = shim;
    }

    public BigDecimal getShim() {
        return shim;
    }

    public void setKzap(BigDecimal kzap) {
        this.kzap = kzap;
    }

    public BigDecimal getKzap() {
        return kzap;
    }

    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }

    public BigDecimal getRatio() {
        return ratio;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public NomenclatureItem getComponent() {
        return component;
    }

    public void setComponent(NomenclatureItem component) {
        this.component = component;
    }
}