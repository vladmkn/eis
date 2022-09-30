package com.nniirt.eis.entity.qs.catalog;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "EIS_DEFECT_TYPE")
@Entity(name = "eis_DefectType")
public class DefectType extends StandardEntity {
    private static final long serialVersionUID = 3135584085802928482L;

    @Column(name = "GROUP_CODE", length = 10)
    private String groupCode;

    @Column(name = "TYPE_CODE", length = 10)
    private String typeCode;

    @Column(name = "CODE", length = 10)
    private String code;

    @Column(name = "ABBR", length = 10)
    private String abbr;

    @Column(name = "DEFINITION_")
    private String definition;

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

}