package com.nniirt.eis.entity.qs;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.nniirt.eis.entity.NomenclatureItem;
import com.nniirt.eis.entity.catalog.Product;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEFECT_DIVISION_ID")
    private DivisionIndex defectDivision;

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
    @Column(name = "DEFECT_CAUSE")
    private String defectCause;

    @Lob
    @Column(name = "DEFECT_MUST_BE")
    private String defectMustBe;

    @Lob
    @Column(name = "DEFECT_AS_IS")
    private String defectAsIs;

    @Lob
    @Column(name = "INSPECTION_RESULTS")
    private String inspectionResults;

    @Column(name = "ADDRESS", length = 300)
    private String address;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_OF_REQUIRED_ARRIVAL")
    private Date dateOfRequiredArrival;

    @Column(name = "RECIPIENT", length = 300)
    private String recipient;

    @Column(name = "ANALYSIS_SUBJECT")
    private String analysisSubject;

    @Column(name = "FAX", length = 300)
    private String fax;

    @Column(name = "PHONE", length = 300)
    private String phone;

    @Column(name = "EMAIL")
    private String email;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "technicalForm")
    private List<TechnicalFormApprovingPerson> approvingPerson;

    @Lob
    @Column(name = "TEXT_S2")
    private String textS2;

    @Column(name = "CHAIRMAN_S2", length = 300)
    private String chairmanS2;

    @Column(name = "COMMISSION_S2", length = 300)
    private String commissionS2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EXECUTOR_S2_ID")
    private DivisionIndex executorS2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EXECUTOR_S1_ID")
    private DivisionIndex executorS1;

    @Column(name = "FINALDATE_S2", length = 300)
    private String finaldateS2;

    @Column(name = "FINALDATE_S1", length = 300)
    private String finaldateS1;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "technicalForm")
    private List<TechnicalFormConclusion> conclusion;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "technicalForm")
    private List<TechnicalFormConclusion2> conclusion2;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "technicalForm")
    private List<TechnicalFormCommission> commission;

    @JoinTable(name = "EIS_TECHNICAL_FORM_FILE_DESCRIPTOR_LINK",
            joinColumns = @JoinColumn(name = "TECHNICAL_FORM_ID"),
            inverseJoinColumns = @JoinColumn(name = "FILE_DESCRIPTOR_ID"))
    @ManyToMany
    private List<FileDescriptor> files;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "technicalForm")
    private List<TechnicalFormComponent> components;

    public List<TechnicalFormConclusion2> getConclusion2() {
        return conclusion2;
    }

    public void setConclusion2(List<TechnicalFormConclusion2> conclusion2) {
        this.conclusion2 = conclusion2;
    }

    public String getFinaldateS1() {
        return finaldateS1;
    }

    public void setFinaldateS1(String finaldateS1) {
        this.finaldateS1 = finaldateS1;
    }

    public DivisionIndex getExecutorS1() {
        return executorS1;
    }

    public void setExecutorS1(DivisionIndex executorS1) {
        this.executorS1 = executorS1;
    }

    public String getFinaldateS2() {
        return finaldateS2;
    }

    public void setFinaldateS2(String finaldateS2) {
        this.finaldateS2 = finaldateS2;
    }

    public DivisionIndex getExecutorS2() {
        return executorS2;
    }

    public void setExecutorS2(DivisionIndex executorS2) {
        this.executorS2 = executorS2;
    }

    public String getCommissionS2() {
        return commissionS2;
    }

    public void setCommissionS2(String commissionS2) {
        this.commissionS2 = commissionS2;
    }

    public String getChairmanS2() {
        return chairmanS2;
    }

    public void setChairmanS2(String chairmanS2) {
        this.chairmanS2 = chairmanS2;
    }

    public String getTextS2() {
        return textS2;
    }

    public void setTextS2(String textS2) {
        this.textS2 = textS2;
    }

    public String getAnalysisSubject() {
        return analysisSubject;
    }

    public void setAnalysisSubject(String analysisSubject) {
        this.analysisSubject = analysisSubject;
    }

    public Date getDateOfRequiredArrival() {
        return dateOfRequiredArrival;
    }

    public void setDateOfRequiredArrival(Date dateOfRequiredArrival) {
        this.dateOfRequiredArrival = dateOfRequiredArrival;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getDefectDivisionDef() {
        return defectDivisionDef;
    }

    public void setDefectDivisionDef(String defectDivisionDef) {
        this.defectDivisionDef = defectDivisionDef;
    }

    public List<TechnicalFormApprovingPerson> getApprovingPerson() {
        return approvingPerson;
    }

    public void setApprovingPerson(List<TechnicalFormApprovingPerson> approvingPerson) {
        this.approvingPerson = approvingPerson;
    }

    public List<TechnicalFormComponent> getComponents() {
        return components;
    }

    public void setComponents(List<TechnicalFormComponent> components) {
        this.components = components;
    }

    public List<FileDescriptor> getFiles() {
        return files;
    }

    public void setFiles(List<FileDescriptor> files) {
        this.files = files;
    }

    public List<TechnicalFormConclusion> getConclusion() {
        return conclusion;
    }

    public void setConclusion(List<TechnicalFormConclusion> conclusion) {
        this.conclusion = conclusion;
    }

    public DivisionIndex getDefectDivision() {
        return defectDivision;
    }

    public void setDefectDivision(DivisionIndex defectDivision) {
        this.defectDivision = defectDivision;
    }

    public List<TechnicalFormCommission> getCommission() {
        return commission;
    }

    public void setCommission(List<TechnicalFormCommission> commission) {
        this.commission = commission;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}