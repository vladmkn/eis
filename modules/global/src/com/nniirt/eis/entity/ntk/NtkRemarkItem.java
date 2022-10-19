package com.nniirt.eis.entity.ntk;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.nniirt.eis.entity.NtkItem;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "EIS_NTK_REMARK_ITEM")
@Entity(name = "eis_NtkRemarkItem")
public class NtkRemarkItem extends StandardEntity {
    private static final long serialVersionUID = -9020249789398434246L;

    @Lob
    @Column(name = "TEXT", nullable = false)
    @NotNull
    private String text;

    @Column(name = "OGT")
    private Boolean ogt;

    @Column(name = "OGTADD")
    private Boolean ogtadd;

    @Column(name = "HTS")
    private Boolean hts;

    @Column(name = "OME")
    private Boolean ome;

    @Column(name = "BMN")
    private Boolean bmn;

    @Column(name = "OTPP")
    private Boolean otpp;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NTK_ITEM_ID")
    private NtkItem ntkItem;

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

    public NtkItem getNtkItem() {
        return ntkItem;
    }

    public void setNtkItem(NtkItem ntkItem) {
        this.ntkItem = ntkItem;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}