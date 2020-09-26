package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQConsolidationUpdateInputModel
 */
public class BQConsolidationUpdateInputModel   {
  private String complianceReportingAdministrativePlanInstanceReference = null;

  private String consolidationInstanceReference = null;

  private String consolidationPreconditions = null;

  private String consolidationBusinessUnitEmployeeReference = null;

  private String consolidationWorkSchedule = null;

  private String businessService = null;

  private String consolidationPostconditions = null;

  private String consolidationServiceType = null;

  private String consolidationServiceDescription = null;

  private String consolidationServiceInputsandOuputs = null;

  private String consolidationServiceWorkProduct = null;

  private String consolidationServiceName = null;

  private Object consolidationUpdateActionTaskRecord = null;

  private String consolidationUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Consolidation instance 
   * @return consolidationInstanceReference
  **/

  public String getConsolidationInstanceReference() {
    return consolidationInstanceReference;
  }

  public void setConsolidationInstanceReference(String consolidationInstanceReference) {
    this.consolidationInstanceReference = consolidationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return consolidationPreconditions
  **/

  public String getConsolidationPreconditions() {
    return consolidationPreconditions;
  }

  public void setConsolidationPreconditions(String consolidationPreconditions) {
    this.consolidationPreconditions = consolidationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return consolidationBusinessUnitEmployeeReference
  **/

  public String getConsolidationBusinessUnitEmployeeReference() {
    return consolidationBusinessUnitEmployeeReference;
  }

  public void setConsolidationBusinessUnitEmployeeReference(String consolidationBusinessUnitEmployeeReference) {
    this.consolidationBusinessUnitEmployeeReference = consolidationBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return consolidationWorkSchedule
  **/

  public String getConsolidationWorkSchedule() {
    return consolidationWorkSchedule;
  }

  public void setConsolidationWorkSchedule(String consolidationWorkSchedule) {
    this.consolidationWorkSchedule = consolidationWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Compliance Reporting Administrative Plan specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return consolidationPostconditions
  **/

  public String getConsolidationPostconditions() {
    return consolidationPostconditions;
  }

  public void setConsolidationPostconditions(String consolidationPostconditions) {
    this.consolidationPostconditions = consolidationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return consolidationServiceType
  **/

  public String getConsolidationServiceType() {
    return consolidationServiceType;
  }

  public void setConsolidationServiceType(String consolidationServiceType) {
    this.consolidationServiceType = consolidationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return consolidationServiceDescription
  **/

  public String getConsolidationServiceDescription() {
    return consolidationServiceDescription;
  }

  public void setConsolidationServiceDescription(String consolidationServiceDescription) {
    this.consolidationServiceDescription = consolidationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return consolidationServiceInputsandOuputs
  **/

  public String getConsolidationServiceInputsandOuputs() {
    return consolidationServiceInputsandOuputs;
  }

  public void setConsolidationServiceInputsandOuputs(String consolidationServiceInputsandOuputs) {
    this.consolidationServiceInputsandOuputs = consolidationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return consolidationServiceWorkProduct
  **/

  public String getConsolidationServiceWorkProduct() {
    return consolidationServiceWorkProduct;
  }

  public void setConsolidationServiceWorkProduct(String consolidationServiceWorkProduct) {
    this.consolidationServiceWorkProduct = consolidationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return consolidationServiceName
  **/

  public String getConsolidationServiceName() {
    return consolidationServiceName;
  }

  public void setConsolidationServiceName(String consolidationServiceName) {
    this.consolidationServiceName = consolidationServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return consolidationUpdateActionTaskRecord
  **/

  public Object getConsolidationUpdateActionTaskRecord() {
    return consolidationUpdateActionTaskRecord;
  }

  public void setConsolidationUpdateActionTaskRecord(Object consolidationUpdateActionTaskRecord) {
    this.consolidationUpdateActionTaskRecord = consolidationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return consolidationUpdateActionRequest
  **/

  public String getConsolidationUpdateActionRequest() {
    return consolidationUpdateActionRequest;
  }

  public void setConsolidationUpdateActionRequest(String consolidationUpdateActionRequest) {
    this.consolidationUpdateActionRequest = consolidationUpdateActionRequest;
  }


}

