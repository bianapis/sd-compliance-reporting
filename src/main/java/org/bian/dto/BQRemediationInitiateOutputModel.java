package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRemediationInitiateOutputModel
 */
public class BQRemediationInitiateOutputModel   {
  private String remediationInstanceReference = null;

  private String remediationInitiateActionReference = null;

  private Object remediationInitiateActionRecord = null;

  private String remediationInstanceStatus = null;

  private String remediationPreconditions = null;

  private String remediationBusinessUnitEmployeeReference = null;

  private String remediationWorkSchedule = null;

  private String remediationAssurance = null;

  private String remediationPostconditions = null;

  private String remediationRemediationAssuranceServiceType = null;

  private String remediationRemediationAssuranceServiceDescription = null;

  private String remediationRemediationAssuranceServiceInputsandOuputs = null;

  private String remediationRemediationAssuranceServiceWorkProduct = null;

  private String remediationRemediationAssuranceServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Remediation instance 
   * @return remediationInstanceReference
  **/

  public String getRemediationInstanceReference() {
    return remediationInstanceReference;
  }

  public void setRemediationInstanceReference(String remediationInstanceReference) {
    this.remediationInstanceReference = remediationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return remediationInitiateActionReference
  **/

  public String getRemediationInitiateActionReference() {
    return remediationInitiateActionReference;
  }

  public void setRemediationInitiateActionReference(String remediationInitiateActionReference) {
    this.remediationInitiateActionReference = remediationInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return remediationInitiateActionRecord
  **/

  public Object getRemediationInitiateActionRecord() {
    return remediationInitiateActionRecord;
  }

  public void setRemediationInitiateActionRecord(Object remediationInitiateActionRecord) {
    this.remediationInitiateActionRecord = remediationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Remediation instance (e.g. initialised, pending, active) 
   * @return remediationInstanceStatus
  **/

  public String getRemediationInstanceStatus() {
    return remediationInstanceStatus;
  }

  public void setRemediationInstanceStatus(String remediationInstanceStatus) {
    this.remediationInstanceStatus = remediationInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return remediationPreconditions
  **/

  public String getRemediationPreconditions() {
    return remediationPreconditions;
  }

  public void setRemediationPreconditions(String remediationPreconditions) {
    this.remediationPreconditions = remediationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return remediationBusinessUnitEmployeeReference
  **/

  public String getRemediationBusinessUnitEmployeeReference() {
    return remediationBusinessUnitEmployeeReference;
  }

  public void setRemediationBusinessUnitEmployeeReference(String remediationBusinessUnitEmployeeReference) {
    this.remediationBusinessUnitEmployeeReference = remediationBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return remediationWorkSchedule
  **/

  public String getRemediationWorkSchedule() {
    return remediationWorkSchedule;
  }

  public void setRemediationWorkSchedule(String remediationWorkSchedule) {
    this.remediationWorkSchedule = remediationWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Compliance Reporting Administrative Plan specific Business Service 
   * @return remediationAssurance
  **/

  public String getRemediationAssurance() {
    return remediationAssurance;
  }

  public void setRemediationAssurance(String remediationAssurance) {
    this.remediationAssurance = remediationAssurance;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return remediationPostconditions
  **/

  public String getRemediationPostconditions() {
    return remediationPostconditions;
  }

  public void setRemediationPostconditions(String remediationPostconditions) {
    this.remediationPostconditions = remediationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return remediationRemediationAssuranceServiceType
  **/

  public String getRemediationRemediationAssuranceServiceType() {
    return remediationRemediationAssuranceServiceType;
  }

  public void setRemediationRemediationAssuranceServiceType(String remediationRemediationAssuranceServiceType) {
    this.remediationRemediationAssuranceServiceType = remediationRemediationAssuranceServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return remediationRemediationAssuranceServiceDescription
  **/

  public String getRemediationRemediationAssuranceServiceDescription() {
    return remediationRemediationAssuranceServiceDescription;
  }

  public void setRemediationRemediationAssuranceServiceDescription(String remediationRemediationAssuranceServiceDescription) {
    this.remediationRemediationAssuranceServiceDescription = remediationRemediationAssuranceServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return remediationRemediationAssuranceServiceInputsandOuputs
  **/

  public String getRemediationRemediationAssuranceServiceInputsandOuputs() {
    return remediationRemediationAssuranceServiceInputsandOuputs;
  }

  public void setRemediationRemediationAssuranceServiceInputsandOuputs(String remediationRemediationAssuranceServiceInputsandOuputs) {
    this.remediationRemediationAssuranceServiceInputsandOuputs = remediationRemediationAssuranceServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return remediationRemediationAssuranceServiceWorkProduct
  **/

  public String getRemediationRemediationAssuranceServiceWorkProduct() {
    return remediationRemediationAssuranceServiceWorkProduct;
  }

  public void setRemediationRemediationAssuranceServiceWorkProduct(String remediationRemediationAssuranceServiceWorkProduct) {
    this.remediationRemediationAssuranceServiceWorkProduct = remediationRemediationAssuranceServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return remediationRemediationAssuranceServiceName
  **/

  public String getRemediationRemediationAssuranceServiceName() {
    return remediationRemediationAssuranceServiceName;
  }

  public void setRemediationRemediationAssuranceServiceName(String remediationRemediationAssuranceServiceName) {
    this.remediationRemediationAssuranceServiceName = remediationRemediationAssuranceServiceName;
  }


}

