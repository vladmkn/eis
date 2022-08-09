package com.nniirt.eis.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Table(name = "EIS_UNIT_OF_MEASURE")
@Entity(name = "eis_UnitOfMeasurePDM")
@NamePattern("%s|nickname")
public class UnitOfMeasurePDM extends StandardEntity {
    private static final long serialVersionUID = 6365141488559933683L;

    @Column(name = "NICKNAME", length = 100, columnDefinition = "nvarchar(100)")
    private String nickname;

    @Column(name = "FULLNAME", columnDefinition = "nvarchar(255)")
    private String fullname;

    @Column(name = "IDPDM")
    private UUID idpdm;

    @Column(name = "IDGAL")
    private UUID idgal;

    @Column(name = "IDMDM", columnDefinition = "nvarchar(100)")
    private String idmdm;

    @Column(name = "IDARM")
    private Long idarm;

    @Column(name = "INFORMATION_SOURCE")
    private Integer informationSource;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LOAD_TS")
    private Date loadTs;

    public Date getLoadTs() {
        return loadTs;
    }

    public void setLoadTs(Date loadTs) {
        this.loadTs = loadTs;
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

    public void setIdpdm(UUID idpdm) {
        this.idpdm = idpdm;
    }

    public UUID getIdpdm() {
        return idpdm;
    }

    public String getIdmdm() {
        return idmdm;
    }

    public void setIdmdm(String idmdm) {
        this.idmdm = idmdm;
    }

    public UUID getIdgal() {
        return idgal;
    }

    public void setIdgal(UUID idgal) {
        this.idgal = idgal;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}