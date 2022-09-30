package com.nniirt.eis.entity.qs.catalog;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "EIS_TYPE_PURCHASED_ITEM")
@Entity(name = "eis_TypePurchasedItem")
public class TypePurchasedItem extends StandardEntity {
    private static final long serialVersionUID = 6398504249799466807L;

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
}