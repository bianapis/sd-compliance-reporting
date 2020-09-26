package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRComplianceReportingAdministrativePlanUpdateInputModel
 */
public class CRComplianceReportingAdministrativePlanUpdateInputModel   {
  private String complianceReportingServicingSessionReference = null;

  private String complianceReportingAdministrativePlanInstanceReference = null;

  private String complianceReportingAdministrativePlanBudgetType = null;

  private String complianceReportingAdministrativePlanAssignment = null;

  private String complianceReportingAdministrativePlanPlan = null;

  private String complianceReportingAdministrativePlanReference = null;

  private Object complianceReportingAdministrativePlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return complianceReportingServicingSessionReference
  **/

  public String getComplianceReportingServicingSessionReference() {
    return complianceReportingServicingSessionReference;
  }

  public void setComplianceReportingServicingSessionReference(String complianceReportingServicingSessionReference) {
    this.complianceReportingServicingSessionReference = complianceReportingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Compliance Reporting Administrative Plan instance 
   * @return complianceReportingAdministrativePlanInstanceReference
  **/

  public String getComplianceReportingAdministrativePlanInstanceReference() {
    return complianceReportingAdministrativePlanInstanceReference;
  }

  public void setComplianceReportingAdministrativePlanInstanceReference(String complianceReportingAdministrativePlanInstanceReference) {
    this.complianceReportingAdministrativePlanInstanceReference = complianceReportingAdministrativePlanInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return complianceReportingAdministrativePlanUpdateActionTaskRecord
  **/

  public Object getComplianceReportingAdministrativePlanUpdateActionTaskRecord() {
    return complianceReportingAdministrativePlanUpdateActionTaskRecord;
  }

  public void setComplianceReportingAdministrativePlanUpdateActionTaskRecord(Object complianceReportingAdministrativePlanUpdateActionTaskRecord) {
    this.complianceReportingAdministrativePlanUpdateActionTaskRecord = complianceReportingAdministrativePlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

