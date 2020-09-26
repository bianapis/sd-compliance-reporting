package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRComplianceReportingAdministrativePlanRetrieveInputModelComplianceReportingAdministrativePlanInstanceReportRecord
 */
public class CRComplianceReportingAdministrativePlanRetrieveInputModelComplianceReportingAdministrativePlanInstanceReportRecord   {
  private String complianceReportingAdministrativePlanInstanceReportReference = null;

  private String complianceReportingAdministrativePlanInstanceReportType = null;

  private String complianceReportingAdministrativePlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return complianceReportingAdministrativePlanInstanceReportReference
  **/

  public String getComplianceReportingAdministrativePlanInstanceReportReference() {
    return complianceReportingAdministrativePlanInstanceReportReference;
  }

  public void setComplianceReportingAdministrativePlanInstanceReportReference(String complianceReportingAdministrativePlanInstanceReportReference) {
    this.complianceReportingAdministrativePlanInstanceReportReference = complianceReportingAdministrativePlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return complianceReportingAdministrativePlanInstanceReportType
  **/

  public String getComplianceReportingAdministrativePlanInstanceReportType() {
    return complianceReportingAdministrativePlanInstanceReportType;
  }

  public void setComplianceReportingAdministrativePlanInstanceReportType(String complianceReportingAdministrativePlanInstanceReportType) {
    this.complianceReportingAdministrativePlanInstanceReportType = complianceReportingAdministrativePlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return complianceReportingAdministrativePlanInstanceReportParameters
  **/

  public String getComplianceReportingAdministrativePlanInstanceReportParameters() {
    return complianceReportingAdministrativePlanInstanceReportParameters;
  }

  public void setComplianceReportingAdministrativePlanInstanceReportParameters(String complianceReportingAdministrativePlanInstanceReportParameters) {
    this.complianceReportingAdministrativePlanInstanceReportParameters = complianceReportingAdministrativePlanInstanceReportParameters;
  }


}

