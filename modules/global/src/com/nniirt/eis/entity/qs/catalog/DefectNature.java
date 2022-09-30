package com.nniirt.eis.entity.qs.catalog;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "EIS_DEFECT_NATURE")
@Entity(name = "eis_DefectNature")
public class DefectNature extends StandardEntity {
    private static final long serialVersionUID = -3339123920434563724L;

    @Column(name = "GROUP_CODE", length = 10)
    private String groupCode;

    @Column(name = "TYPE_CODE", length = 10)
    private String typeCode;

    @Column(name = "CODE", length = 10)
    private String code;

    @Column(name = "DEFINITION_")
    private String definition;

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
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

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
}