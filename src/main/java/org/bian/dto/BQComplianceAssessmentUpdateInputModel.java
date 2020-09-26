package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQComplianceAssessmentUpdateInputModel
 */
public class BQComplianceAssessmentUpdateInputModel   {
  private String complianceReportingAdministrativePlanInstanceReference = null;

  private String complianceAssessmentInstanceReference = null;

  private String complianceAssessmentPreconditions = null;

  private String complianceAssessmentBusinessUnitEmployeeReference = null;

  private String complianceAssessmentWorkSchedule = null;

  private String auditandReporting = null;

  private String complianceAssessmentPostconditions = null;

  private String complianceAssessmentAuditandReportingServiceType = null;

  private String complianceAssessmentAuditandReportingServiceDescription = null;

  private String complianceAssessmentAuditandReportingServiceInputsandOuputs = null;

  private String complianceAssessmentAuditandReportingServiceWorkProduct = null;

  private Object complianceAssessmentUpdateActionTaskRecord = null;

  private String complianceAssessmentUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Compliance Reporting Administrative Plan instance 
   * @return complianceReportingAdministrativePlanInstanceReference
  **/

  public String getComplianceReportingAdministrativePlanInstanceReference() {
    return complianceReportingAdministrativePlanInstanceReference;
  }

  public void setComplianceReportingAdministrativePlanInstanceReference(String complianceReportingAdministrativePlanInstanceReference) {
    this.complianceReportingAdministrativePlanInstanceReference = complianceReportingAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Compliance Assessment instance 
   * @return complianceAssessmentInstanceReference
  **/

  public String getComplianceAssessmentInstanceReference() {
    return complianceAssessmentInstanceReference;
  }

  public void setComplianceAssessmentInstanceReference(String complianceAssessmentInstanceReference) {
    this.complianceAssessmentInstanceReference = complianceAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return complianceAssessmentPreconditions
  **/

  public String getComplianceAssessmentPreconditions() {
    return complianceAssessmentPreconditions;
  }

  public void setComplianceAssessmentPreconditions(String complianceAssessmentPreconditions) {
    this.complianceAssessmentPreconditions = complianceAssessmentPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return complianceAssessmentBusinessUnitEmployeeReference
  **/

  public String getComplianceAssessmentBusinessUnitEmployeeReference() {
    return complianceAssessmentBusinessUnitEmployeeReference;
  }

  public void setComplianceAssessmentBusinessUnitEmployeeReference(String complianceAssessmentBusinessUnitEmployeeReference) {
    this.complianceAssessmentBusinessUnitEmployeeReference = complianceAssessmentBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return complianceAssessmentWorkSchedule
  **/

  public String getComplianceAssessmentWorkSchedule() {
    return complianceAssessmentWorkSchedule;
  }

  public void setComplianceAssessmentWorkSchedule(String complianceAssessmentWorkSchedule) {
    this.complianceAssessmentWorkSchedule = complianceAssessmentWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Compliance Reporting Administrative Plan specific Business Service 
   * @return auditandReporting
  **/

  public String getAuditandReporting() {
    return auditandReporting;
  }

  public void setAuditandReporting(String auditandReporting) {
    this.auditandReporting = auditandReporting;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return complianceAssessmentPostconditions
  **/

  public String getComplianceAssessmentPostconditions() {
    return complianceAssessmentPostconditions;
  }

  public void setComplianceAssessmentPostconditions(String complianceAssessmentPostconditions) {
    this.complianceAssessmentPostconditions = complianceAssessmentPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return complianceAssessmentAuditandReportingServiceType
  **/

  public String getComplianceAssessmentAuditandReportingServiceType() {
    return complianceAssessmentAuditandReportingServiceType;
  }

  public void setComplianceAssessmentAuditandReportingServiceType(String complianceAssessmentAuditandReportingServiceType) {
    this.complianceAssessmentAuditandReportingServiceType = complianceAssessmentAuditandReportingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return complianceAssessmentAuditandReportingServiceDescription
  **/

  public String getComplianceAssessmentAuditandReportingServiceDescription() {
    return complianceAssessmentAuditandReportingServiceDescription;
  }

  public void setComplianceAssessmentAuditandReportingServiceDescription(String complianceAssessmentAuditandReportingServiceDescription) {
    this.complianceAssessmentAuditandReportingServiceDescription = complianceAssessmentAuditandReportingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return complianceAssessmentAuditandReportingServiceInputsandOuputs
  **/

  public String getComplianceAssessmentAuditandReportingServiceInputsandOuputs() {
    return complianceAssessmentAuditandReportingServiceInputsandOuputs;
  }

  public void setComplianceAssessmentAuditandReportingServiceInputsandOuputs(String complianceAssessmentAuditandReportingServiceInputsandOuputs) {
    this.complianceAssessmentAuditandReportingServiceInputsandOuputs = complianceAssessmentAuditandReportingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return complianceAssessmentAuditandReportingServiceWorkProduct
  **/

  public String getComplianceAssessmentAuditandReportingServiceWorkProduct() {
    return complianceAssessmentAuditandReportingServiceWorkProduct;
  }

  public void setComplianceAssessmentAuditandReportingServiceWorkProduct(String complianceAssessmentAuditandReportingServiceWorkProduct) {
    this.complianceAssessmentAuditandReportingServiceWorkProduct = complianceAssessmentAuditandReportingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return complianceAssessmentUpdateActionTaskRecord
  **/

  public Object getComplianceAssessmentUpdateActionTaskRecord() {
    return complianceAssessmentUpdateActionTaskRecord;
  }

  public void setComplianceAssessmentUpdateActionTaskRecord(Object complianceAssessmentUpdateActionTaskRecord) {
    this.complianceAssessmentUpdateActionTaskRecord = complianceAssessmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return complianceAssessmentUpdateActionRequest
  **/

  public String getComplianceAssessmentUpdateActionRequest() {
    return complianceAssessmentUpdateActionRequest;
  }

  public void setComplianceAssessmentUpdateActionRequest(String complianceAssessmentUpdateActionRequest) {
    this.complianceAssessmentUpdateActionRequest = complianceAssessmentUpdateActionRequest;
  }


}

