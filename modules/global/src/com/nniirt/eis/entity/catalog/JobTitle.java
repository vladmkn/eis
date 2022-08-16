package com.nniirt.eis.entity.catalog;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "EIS_JOB_TITLE")
@Entity(name = "eis_JobTitle")
@NamePattern("%s|name")
public class JobTitle extends StandardEntity {
    private static final long serialVersionUID = 8214653263124633440L;

    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}