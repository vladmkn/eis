package com.nniirt.eis.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Table(name = "EIS_NOMENCLATURE_ITEM", indexes = {
        @Index(name = "IDX_EIS_NOMENCLATURE_ITEM_NAME", columnList = "NAME"),
        @Index(name = "IDX_EIS_NOMENCLATURE_ITEM_IDGAL", columnList = "IDGAL")
})
@Entity(name = "eis_NomenclatureItemPDM")
@NamePattern("%s|name")
public class NomenclatureItemPDM extends StandardEntity {
    private static final long serialVersionUID = -6645312842549283419L;

    @Column(name = "NAME", length = 455, columnDefinition = "nvarchar(455)")
    private String name;

    @Column(name = "BLUEPRINTNAME", columnDefinition = "nvarchar(255)")
    private String blueprintname;

    @Column(name = "DISPLAYNAME", length = 455, columnDefinition = "nvarchar(455)")
    private String displayname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UOM_ID")
    private UnitOfMeasurePDM uom;

    @Column(name = "IDMDM", columnDefinition = "nvarchar(100)")
    private String idmdm;

    @Column(name = "IDPDM")
    private UUID idpdm;

    @Column(name = "IDGAL")
    private UUID idgal;

    @Column(name = "IDARM")
    private Long idarm;

    @Column(name = "INFORMATION_SOURCE")
    private Integer informationSource;

    @Column(name = "IS_USED", length = 100, columnDefinition = "nvarchar(255)")
    private String isUsed;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LOAD_TS")
    private Date loadTs;

    public Date getLoadTs() {
        return loadTs;
    }

    public void setLoadTs(Date loadTs) {
        this.loadTs = loadTs;
    }

    public UnitOfMeasurePDM getUom() {
        return uom;
    }

    public void setUom(UnitOfMeasurePDM uom) {
        this.uom = uom;
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed;
    }

    public void setIdarm(Long idarm) {
        this.idarm = idarm;
    }

    public Long getIdarm() {
        return idarm;
    }

    public InformationSources getInformationSource() {
        return informationSource == null ? null : InformationSources.fromId(informationSource);
    }

    public void setInformationSource(InformationSources informationSource) {
        this.informationSource = informationSource == null ? null : informationSource.getId();
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public UUID getIdgal() {
        return idgal;
    }

    public void setIdgal(UUID idgal) {
        this.idgal = idgal;
    }

    public UUID getIdpdm() {
        return idpdm;
    }

    public void setIdpdm(UUID idpdm) {
        this.idpdm = idpdm;
    }

    public String getIdmdm() {
        return idmdm;
    }

    public void setIdmdm(String idmdm) {
        this.idmdm = idmdm;
    }

    public String getBlueprintname() {
        return blueprintname;
    }

    public void setBlueprintname(String blueprintname) {
        this.blueprintname = blueprintname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}