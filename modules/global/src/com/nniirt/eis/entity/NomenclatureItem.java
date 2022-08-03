package com.nniirt.eis.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "EIS_NOMENCLATURE_ITEM")
@Entity(name = "eis_NomenclatureItem")
@NamePattern("%s|name")
public class NomenclatureItem extends StandardEntity {
    private static final long serialVersionUID = -6645312842549283419L;

    @Column(name = "NAME", length = 455)
    private String name;

    @Column(name = "BLUEPRINTNAME")
    private String blueprintname;

    @Column(name = "DISPLAYNAME")
    private String displayname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UOM_ID")
    private UnitOfMeasure uom;

    @Column(name = "IDMDM")
    private String idmdm;

    @Column(name = "IDPDM")
    private UUID idpdm;

    @Column(name = "IDGAL")
    private UUID idgal;

    @Column(name = "IDARM")
    private Integer idarm;

    @Column(name = "INFORMATION_SOURCE")
    private Integer informationSource;

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

    public Integer getIdarm() {
        return idarm;
    }

    public void setIdarm(Integer idarm) {
        this.idarm = idarm;
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

    public UnitOfMeasure getUom() {
        return uom;
    }

    public void setUom(UnitOfMeasure uom) {
        this.uom = uom;
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