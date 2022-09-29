package com.nniirt.eis.entity.qs;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.nniirt.eis.entity.NomenclatureItem;
import com.nniirt.eis.entity.catalog.Product;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "EIS_ANALYSIS_FORM")
@Entity(name = "eis_AnalysisForm")
public class AnalysisForm extends StandardEntity {
    private static final long serialVersionUID = -4514590459149305395L;

    @Column(name = "DOCUMENT_NUM")
    private String documentNum;

    @Temporal(TemporalType.DATE)
    @Column(name = "DOCUMENT_DATE")
    private Date documentDate;

    @Column(name = "EXTERNAL_DOCUMENT")
    private Boolean externalDocument;

    @Column(name = "MILITARY_DOCUMENT")
    private Boolean militaryDocument;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEFECT_DIVISION_ID")
    private DivisionIndex defectDivision;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPONENT_ID")
    private NomenclatureItem component;

    @Column(name = "COMPONENT_NUMBER", length = 300)
    private String componentNumber;

    @Column(name = "QUANTITY", precision = 28, scale = 8)
    private BigDecimal quantity;

    @Column(name = "ASSEMBLY_NUM")
    private String assemblyNum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANUFACTURER_ID")
    private DivisionIndex manufacturer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEVELOPER_ID")
    private DivisionIndex developer;

    @Column(name = "DEFECT_DIVISION_DEF", length = 300)
    private String defectDivisionDef;

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
    @Column(name = "DEFECT_MUST_BE")
    private String defectMustBe;

    @Lob
    @Column(name = "DEFECT_AS_IS")
    private String defectAsIs;

    @Lob
    @Column(name = "V_DEFECT_DEFINITION")
    private String vDefectDefinition;

    @Lob
    @Column(name = "V_DEFECT_MUST_BE")
    private String vDefectMustBe;

    @Lob
    @Column(name = "V_DEFECT_AS_IS")
    private String vDefectAsIs;

    @Lob
    @Column(name = "V_DEFECT_CAUSE")
    private String vDefectCause;

    @Lob
    @Column(name = "APPENDIX")
    private String appendix;

    @Column(name = "FORM_CREATOR", length = 300)
    private String formCreator;

    @Column(name = "FORM_CREATOR_PHONE", length = 50)
    private String formCreatorPhone;

    @Column(name = "FORM_INSTANCE_PLACE", length = 50)
    private String formInstance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FORM_CREATOR_DIVISION_ID")
    private DivisionIndex formCreatorDivision;

    @Lob
    @Column(name = "INSPECTION_RESULTS")
    private String inspectionResults;

    @Temporal(TemporalType.DATE)
    @Column(name = "MANUFACTURE_DATE")
    private Date manufactureDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @Column(name = "PRODUCT_NUMBER", length = 300)
    private String productNumber;

    @Column(name = "MASTER_COMPONENT_DEFINITION", length = 300)
    private String masterComponentDefinition;

    @Column(name = "MASTER_COMPONENT_NUMBER", length = 300)
    private String masterComponentNumber;

    public Boolean getMilitaryDocument() {
        return militaryDocument;
    }

    public void setMilitaryDocument(Boolean militaryDocument) {
        this.militaryDocument = militaryDocument;
    }

    public DivisionIndex getFormCreatorDivision() {
        return formCreatorDivision;
    }

    public void setFormCreatorDivision(DivisionIndex formCreatorDivision) {
        this.formCreatorDivision = formCreatorDivision;
    }

    public String getFormInstance() {
        return formInstance;
    }

    public void setFormInstance(String formInstance) {
        this.formInstance = formInstance;
    }

    public String getFormCreatorPhone() {
        return formCreatorPhone;
    }

    public void setFormCreatorPhone(String formCreatorPhone) {
        this.formCreatorPhone = formCreatorPhone;
    }

    public String getFormCreator() {
        return formCreator;
    }

    public void setFormCreator(String formCreator) {
        this.formCreator = formCreator;
    }

    public String getAppendix() {
        return appendix;
    }

    public void setAppendix(String appendix) {
        this.appendix = appendix;
    }

    public String getvDefectCause() {
        return vDefectCause;
    }

    public void setvDefectCause(String vDefectCause) {
        this.vDefectCause = vDefectCause;
    }

    public String getvDefectAsIs() {
        return vDefectAsIs;
    }

    public void setvDefectAsIs(String vDefectAsIs) {
        this.vDefectAsIs = vDefectAsIs;
    }

    public String getvDefectMustBe() {
        return vDefectMustBe;
    }

    public void setvDefectMustBe(String vDefectMustBe) {
        this.vDefectMustBe = vDefectMustBe;
    }

    public String getvDefectDefinition() {
        return vDefectDefinition;
    }

    public void setvDefectDefinition(String vDefectDefinition) {
        this.vDefectDefinition = vDefectDefinition;
    }

    public String getDefectAsIs() {
        return defectAsIs;
    }

    public void setDefectAsIs(String defectAsIs) {
        this.defectAsIs = defectAsIs;
    }

    public String getDefectMustBe() {
        return defectMustBe;
    }

    public void setDefectMustBe(String defectMustBe) {
        this.defectMustBe = defectMustBe;
    }

    public String getDefectDefinition() {
        return defectDefinition;
    }

    public void setDefectDefinition(String defectDefinition) {
        this.defectDefinition = defectDefinition;
    }

    public String getInspectionResults() {
        return inspectionResults;
    }

    public void setInspectionResults(String inspectionResults) {
        this.inspectionResults = inspectionResults;
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

    public DivisionIndex getDeveloper() {
        return developer;
    }

    public void setDeveloper(DivisionIndex developer) {
        this.developer = developer;
    }

    public DivisionIndex getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(DivisionIndex manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getAssemblyNum() {
        return assemblyNum;
    }

    public void setAssemblyNum(String assemblyNum) {
        this.assemblyNum = assemblyNum;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
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

    public String getComponentNumber() {
        return componentNumber;
    }

    public void setComponentNumber(String componentNumber) {
        this.componentNumber = componentNumber;
    }

    public NomenclatureItem getComponent() {
        return component;
    }

    public void setComponent(NomenclatureItem component) {
        this.component = component;
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

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getDefectDivisionDef() {
        return defectDivisionDef;
    }

    public void setDefectDivisionDef(String defectDivisionDef) {
        this.defectDivisionDef = defectDivisionDef;
    }

    public DivisionIndex getDefectDivision() {
        return defectDivision;
    }

    public void setDefectDivision(DivisionIndex defectDivision) {
        this.defectDivision = defectDivision;
    }

    public Boolean getExternalDocument() {
        return externalDocument;
    }

    public void setExternalDocument(Boolean externalDocument) {
        this.externalDocument = externalDocument;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    public String getDocumentNum() {
        return documentNum;
    }

    public void setDocumentNum(String documentNum) {
        this.documentNum = documentNum;
    }
}