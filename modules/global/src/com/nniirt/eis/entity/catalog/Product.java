package com.nniirt.eis.entity.catalog;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "EIS_PRODUCT")
@Entity(name = "eis_Product")
@NamePattern("%s %s|name, series")
public class Product extends StandardEntity {
    private static final long serialVersionUID = -6750963016886989134L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SERIES", length = 100)
    private String series;

    @Column(name = "ASSEMBLY_MASK")
    private String assemblyMask;

    public String getAssemblyMask() {
        return assemblyMask;
    }

    public void setAssemblyMask(String assemblyMask) {
        this.assemblyMask = assemblyMask;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}