package com.nniirt.eis.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.nniirt.eis.entity.ntk.NtkRemarkItem;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Table(name = "EIS_NTK_ITEM")
@Entity(name = "eis_NtkItem")
@NamePattern("%s %s|blueprint,name")
public class NtkItem extends StandardEntity {
    private static final long serialVersionUID = 2230486159174544746L;

    @Column(name = "BLUEPRINT", nullable = false)
    @NotNull
    private String blueprint;

    @Column(name = "NTK_VERSION")
    private String ntkVersion;

    @Column(name = "ROUTE")
    private String route;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "GEOMETRY")
    private String geometry;

    @Column(name = "WEIGHT", precision = 28, scale = 8)
    private BigDecimal weight;

    @Column(name = "PRODUCT_ID")
    private String productId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPONENT_ID")
    private NomenclatureItem component;

    @Column(name = "QUANTITY", precision = 28, scale = 8)
    private BigDecimal quantity;

    @Column(name = "MATERIAL_ROUTE")
    private String materialRoute;

    @Column(name = "MATERIAL_SIZE")
    private String materialSize;

    @OneToMany(mappedBy = "ntkItem")
    private List<NtkBOMItem> components;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "ntkItem")
    private List<NtkRemarkItem> remarks;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "OGT")
    private Boolean ogt;

    @Column(name = "OGTMATERIAL")
    private Boolean ogtmaterial;

    @Column(name = "HTSMATERIAL")
    private Boolean htsmaterial;

    @Column(name = "HTS")
    private Boolean hts;

    @Column(name = "OME")
    private Boolean ome;

    @Column(name = "BMN")
    private Boolean bmn;

    public Boolean getHtsmaterial() {
        return htsmaterial;
    }

    public void setHtsmaterial(Boolean htsmaterial) {
        this.htsmaterial = htsmaterial;
    }

    public Boolean getOgtmaterial() {
        return ogtmaterial;
    }

    public void setOgtmaterial(Boolean ogtmaterial) {
        this.ogtmaterial = ogtmaterial;
    }

    public List<NtkRemarkItem> getRemarks() {
        return remarks;
    }

    public void setRemarks(List<NtkRemarkItem> remarks) {
        this.remarks = remarks;
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

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public String getNtkVersion() {
        return ntkVersion;
    }

    public void setNtkVersion(String ntkVersion) {
        this.ntkVersion = ntkVersion;
    }

    public DocumentStatuses getStatus() {
        return status == null ? null : DocumentStatuses.fromId(status);
    }

    public void setStatus(DocumentStatuses status) {
        this.status = status == null ? null : status.getId();
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void setComponents(List<NtkBOMItem> components) {
        this.components = components;
    }

    public List<NtkBOMItem> getComponents() {
        return components;
    }

    public NomenclatureItem getComponent() {
        return component;
    }

    public void setComponent(NomenclatureItem component) {
        this.component = component;
    }

    public String getGeometry() {
        return geometry;
    }

    public void setGeometry(String geometry) {
        this.geometry = geometry;
    }

    public String getMaterialSize() {
        return materialSize;
    }

    public void setMaterialSize(String materialSize) {
        this.materialSize = materialSize;
    }

    public String getMaterialRoute() {
        return materialRoute;
    }

    public void setMaterialRoute(String materialRoute) {
        this.materialRoute = materialRoute;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlueprint() {
        return blueprint;
    }

    public void setBlueprint(String blueprint) {
        this.blueprint = blueprint;
    }
}