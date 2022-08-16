package com.nniirt.eis.entity.qs;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.nniirt.eis.entity.NomenclatureItem;
import com.nniirt.eis.entity.catalog.Product;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "EIS_TECHNICAL_FORM")
@Entity(name = "eis_TechnicalForm")
public class TechnicalForm extends StandardEntity {
    private static final long serialVersionUID = 2002532952014752579L;

    @Column(name = "DOCUMENT_NUM")
    private String documentNum;

    @Temporal(TemporalType.DATE)
    @Column(name = "DOCUMENT_DATE")
    private Date documentDate;

    @Column(name = "EXTERNAL_DOCUMENT")
    private Boolean externalDocument;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPONENT_ID")
    private NomenclatureItem component;

    @Column(name = "COMPONENT_NUMBER", length = 300)
    private String componentNumber;

    @Column(name = "QUANTITY", precision = 28, scale = 8)
    private BigDecimal quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @Column(name = "PRODUCT_NUMBER", length = 300)
    private String productNumber;

    @Column(name = "MANUFACTURER", length = 300)
    private String manufacturer;

    @Column(name = "CONTRACT", length = 300)
    private String contract;

    @Column(name = "PROVIDER", length = 300)
    private String provider;

    @Column(name = "ASSEMBLY_NUM")
    private String assemblyNum;

    @Column(name = "MASTER_COMPONENT_DEFINITION", length = 300)
    private String masterComponentDefinition;

    @Column(name = "MASTER_COMPONENT_NUMBER", length = 300)
    private String masterComponentNumber;

    @Temporal(TemporalType.DATE)
    @Column(name = "WARRANTY_START_DATE")
    private Date warrantyStartDate;

    @Column(name = "WARRANTY_PERIOD", length = 455)
    private String warrantyPeriod;

    @Temporal(TemporalType.DATE)
    @Column(name = "DEFECT_DATE")
    private Date defectDate;

    @Lob
    @Column(name = "DEFECT_CONDITIONS")
    private String defectConditions;

    @Lob
    @Column(name = "DEFECT_DEFINITION")
    private String defectDefinition;

    @Lob
    @Column(name = "DEFECT_CAUSE")
    private String defectCause;

    @Lob
    @Column(name = "INSPECTION_RESULTS")
    private String inspectionResults;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMasterComponentNumber() {
        return masterComponentNumber;
    }

    public void setMasterComponentNumber(String masterComponentNumber) {
        this.masterComponentNumber = masterComponentNumber;
    }

    public String getMasterComponentDefinition() {
        return masterComponentDefinition;
    }

    public void setMasterComponentDefinition(String masterComponentDefinition) {
        this.masterComponentDefinition = masterComponentDefinition;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Boolean getExternalDocument() {
        return externalDocument;
    }

    public void setExternalDocument(Boolean externalDocument) {
        this.externalDocument = externalDocument;
    }

    public String getComponentNumber() {
        return componentNumber;
    }

    public void setComponentNumber(String componentNumber) {
        this.componentNumber = componentNumber;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    public String getInspectionResults() {
        return inspectionResults;
    }

    public void setInspectionResults(String inspectionResults) {
        this.inspectionResults = inspectionResults;
    }

    public String getDefectCause() {
        return defectCause;
    }

    public void setDefectCause(String defectCause) {
        this.defectCause = defectCause;
    }

    public String getDefectDefinition() {
        return defectDefinition;
    }

    public void setDefectDefinition(String defectDefinition) {
        this.defectDefinition = defectDefinition;
    }

    public String getDefectConditions() {
        return defectConditions;
    }

    public void setDefectConditions(String defectConditions) {
        this.defectConditions = defectConditions;
    }

    public Date getDefectDate() {
        return defectDate;
    }

    public void setDefectDate(Date defectDate) {
        this.defectDate = defectDate;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public Date getWarrantyStartDate() {
        return warrantyStartDate;
    }

    public void setWarrantyStartDate(Date warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public NomenclatureItem getComponent() {
        return component;
    }

    public void setComponent(NomenclatureItem component) {
        this.component = component;
    }

    public String getDocumentNum() {
        return documentNum;
    }

    public void setDocumentNum(String documentNum) {
        this.documentNum = documentNum;
    }

    public String getAssemblyNum() {
        return assemblyNum;
    }

    public void setAssemblyNum(String assemblyNum) {
        this.assemblyNum = assemblyNum;
    }
}