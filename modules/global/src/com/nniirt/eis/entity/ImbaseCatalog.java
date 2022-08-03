package com.nniirt.eis.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.global.DdlGeneration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@Table(name = "EIS_IMBASE_CATALOG")
@Entity(name = "eis_ImbaseCatalog")
public class ImbaseCatalog extends StandardEntity {
    private static final long serialVersionUID = 5296951176910049063L;

    @Column(name = "FULLNAME", length = 455)
    private String fullname;

    @Column(name = "CATALOGNAME")
    private String catalogname;

    @Lob
    @Column(name = "FOLDERPATH")
    private String folderpath;

    public String getCatalogname() {
        return catalogname;
    }

    public void setCatalogname(String catalogname) {
        this.catalogname = catalogname;
    }

    public String getFolderpath() {
        return folderpath;
    }

    public void setFolderpath(String folderpath) {
        this.folderpath = folderpath;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}