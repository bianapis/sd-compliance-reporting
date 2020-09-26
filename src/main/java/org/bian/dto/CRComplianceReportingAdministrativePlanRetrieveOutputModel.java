package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRComplianceReportingAdministrativePlanRetrieveOutputModelComplianceReportingAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRComplianceReportingAdministrativePlanRetrieveOutputModelComplianceReportingAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRComplianceReportingAdministrativePlanRetrieveOutputModel
 */
public class CRComplianceReportingAdministrativePlanRetrieveOutputModel   {
  private String complianceReportingAdministrativePlanBudgetType = null;

  private String complianceReportingAdministrativePlanAssignment = null;

  private String complianceReportingAdministrativePlanPlan = null;

  private String complianceReportingAdministrativePlanReference = null;

  private String complianceReportingAdministrativePlanRetrieveActionTaskReference = null;

  private Object complianceReportingAdministrativePlanRetrieveActionTaskRecord = null;

  private String complianceReportingAdministrativePlanRetrieveActionResponse = null;

  private CRComplianceReportingAdministrativePlanRetrieveOutputModelComplianceReportingAdministrativePlanInstanceReportRecord complianceReportingAdministrativePlanInstanceReportRecord = null;

  private CRComplianceReportingAdministrativePlanRetrieveOutputModelComplianceReportingAdministrativePlanInstanceAnalysis complianceReportingAdministrativePlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Budgets within Compliance Reporting Administrative Plan according to the type of resource and/or activity that is budgetted 
   * @return complianceReportingAdministrativePlanBudgetType
  **/

  public String getComplianceReportingAdministrativePlanBudgetType() {
    return complianceReportingAdministrativePlanBudgetType;
  }

  public void setComplianceReportingAdministrativePlanBudgetType(String complianceReportingAdministrativePlanBudgetType) {
    this.complianceReportingAdministrativePlanBudgetType = complianceReportingAdministrativePlanBudgetType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allocation of someone or something which is specified for Compliance Reporting Administrative Plan 
   * @return complianceReportingAdministrativePlanAssignment
  **/

  public String getComplianceReportingAdministrativePlanAssignment() {
    return complianceReportingAdministrativePlanAssignment;
  }

  public void setComplianceReportingAdministrativePlanAssignment(String complianceReportingAdministrativePlanAssignment) {
    this.complianceReportingAdministrativePlanAssignment = complianceReportingAdministrativePlanAssignment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A plan that defines clerical support for ComplianceReporting 
   * @return complianceReportingAdministrativePlanPlan
  **/

  public String getComplianceReportingAdministrativePlanPlan() {
    return complianceReportingAdministrativePlanPlan;
  }

  public void setComplianceReportingAdministrativePlanPlan(String complianceReportingAdministrativePlanPlan) {
    this.complianceReportingAdministrativePlanPlan = complianceReportingAdministrativePlanPlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Party who is involved in Compliance Reporting Administrative Plan 
   * @return complianceReportingAdministrativePlanReference
  **/

  public String getComplianceReportingAdministrativePlanReference() {
    return complianceReportingAdministrativePlanReference;
  }

  public void setComplianceReportingAdministrativePlanReference(String complianceReportingAdministrativePlanReference) {
    this.complianceReportingAdministrativePlanReference = complianceReportingAdministrativePlanReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Compliance Reporting Administrative Plan instance retrieve service call 
   * @return complianceReportingAdministrativePlanRetrieveActionTaskReference
  **/

  public String getComplianceReportingAdministrativePlanRetrieveActionTaskReference() {
    return complianceReportingAdministrativePlanRetrieveActionTaskReference;
  }

  public void setComplianceReportingAdministrativePlanRetrieveActionTaskReference(String complianceReportingAdministrativePlanRetrieveActionTaskReference) {
    this.complianceReportingAdministrativePlanRetrieveActionTaskReference = complianceReportingAdministrativePlanRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return complianceReportingAdministrativePlanRetrieveActionTaskRecord
  **/

  public Object getComplianceReportingAdministrativePlanRetrieveActionTaskRecord() {
    return complianceReportingAdministrativePlanRetrieveActionTaskRecord;
  }

  public void setComplianceReportingAdministrativePlanRetrieveActionTaskRecord(Object complianceReportingAdministrativePlanRetrieveActionTaskRecord) {
    this.complianceReportingAdministrativePlanRetrieveActionTaskRecord = complianceReportingAdministrativePlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return complianceReportingAdministrativePlanRetrieveActionResponse
  **/

  public String getComplianceReportingAdministrativePlanRetrieveActionResponse() {
    return complianceReportingAdministrativePlanRetrieveActionResponse;
  }

  public void setComplianceReportingAdministrativePlanRetrieveActionResponse(String complianceReportingAdministrativePlanRetrieveActionResponse) {
    this.complianceReportingAdministrativePlanRetrieveActionResponse = complianceReportingAdministrativePlanRetrieveActionResponse;
  }


  /**
   * Get complianceReportingAdministrativePlanInstanceReportRecord
   * @return complianceReportingAdministrativePlanInstanceReportRecord
  **/

  public CRComplianceReportingAdministrativePlanRetrieveOutputModelComplianceReportingAdministrativePlanInstanceReportRecord getComplianceReportingAdministrativePlanInstanceReportRecord() {
    return complianceReportingAdministrativePlanInstanceReportRecord;
  }

  public void setComplianceReportingAdministrativePlanInstanceReportRecord(CRComplianceReportingAdministrativePlanRetrieveOutputModelComplianceReportingAdministrativePlanInstanceReportRecord complianceReportingAdministrativePlanInstanceReportRecord) {
    this.complianceReportingAdministrativePlanInstanceReportRecord = complianceReportingAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get complianceReportingAdministrativePlanInstanceAnalysis
   * @return complianceReportingAdministrativePlanInstanceAnalysis
  **/

  public CRComplianceReportingAdministrativePlanRetrieveOutputModelComplianceReportingAdministrativePlanInstanceAnalysis getComplianceReportingAdministrativePlanInstanceAnalysis() {
    return complianceReportingAdministrativePlanInstanceAnalysis;
  }

  public void setComplianceReportingAdministrativePlanInstanceAnalysis(CRComplianceReportingAdministrativePlanRetrieveOutputModelComplianceReportingAdministrativePlanInstanceAnalysis complianceReportingAdministrativePlanInstanceAnalysis) {
    this.complianceReportingAdministrativePlanInstanceAnalysis = complianceReportingAdministrativePlanInstanceAnalysis;
  }


}

