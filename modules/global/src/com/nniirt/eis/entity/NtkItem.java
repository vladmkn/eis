package com.nniirt.eis.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@Table(name = "EIS_NTK_ITEM")
@Entity(name = "eis_NtkItem")
@NamePattern("%s %s|blueprint,name")
public class NtkItem extends StandardEntity {
    private static final long serialVersionUID = 2230486159174544746L;

    @Column(name = "BLUEPRINT")
    private String blueprint;

    @Column(name = "ROUTE")
    private String route;

    @Column(name = "NAME")
    private String name;

    @Column(name = "GEOMETRY")
    private String geometry;

    @Column(name = "WEIGHT")
    private Double weight;

    @Column(name = "PRODUCT_ID")
    private String productId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPONENT_ID")
    private NomenclatureItem component;

    @Column(name = "QUANTITY")
    private Double quantity;

    @Column(name = "MATERIAL_ROUTE")
    private String materialRoute;

    @Column(name = "MATERIAL_SIZE")
    private String materialSize;

    @OneToMany(mappedBy = "ntkItem")
    private List<NtkBOMItem> components;

    @Column(name = "STATUS")
    private Integer status;

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

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
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