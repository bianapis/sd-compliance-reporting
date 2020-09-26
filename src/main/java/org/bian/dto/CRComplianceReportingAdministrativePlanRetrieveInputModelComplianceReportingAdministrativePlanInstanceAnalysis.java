package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRComplianceReportingAdministrativePlanRetrieveInputModelComplianceReportingAdministrativePlanInstanceAnalysis
 */
public class CRComplianceReportingAdministrativePlanRetrieveInputModelComplianceReportingAdministrativePlanInstanceAnalysis   {
  private String complianceReportingAdministrativePlanInstanceAnalysisReference = null;

  private String complianceReportingAdministrativePlanInstanceAnalysisReportType = null;

  private String complianceReportingAdministrativePlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return complianceReportingAdministrativePlanInstanceAnalysisReference
  **/

  public String getComplianceReportingAdministrativePlanInstanceAnalysisReference() {
    return complianceReportingAdministrativePlanInstanceAnalysisReference;
  }

  public void setComplianceReportingAdministrativePlanInstanceAnalysisReference(String complianceReportingAdministrativePlanInstanceAnalysisReference) {
    this.complianceReportingAdministrativePlanInstanceAnalysisReference = complianceReportingAdministrativePlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return complianceReportingAdministrativePlanInstanceAnalysisReportType
  **/

  public String getComplianceReportingAdministrativePlanInstanceAnalysisReportType() {
    return complianceReportingAdministrativePlanInstanceAnalysisReportType;
  }

  public void setComplianceReportingAdministrativePlanInstanceAnalysisReportType(String complianceReportingAdministrativePlanInstanceAnalysisReportType) {
    this.complianceReportingAdministrativePlanInstanceAnalysisReportType = complianceReportingAdministrativePlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return complianceReportingAdministrativePlanInstanceAnalysisParameters
  **/

  public String getComplianceReportingAdministrativePlanInstanceAnalysisParameters() {
    return complianceReportingAdministrativePlanInstanceAnalysisParameters;
  }

  public void setComplianceReportingAdministrativePlanInstanceAnalysisParameters(String complianceReportingAdministrativePlanInstanceAnalysisParameters) {
    this.complianceReportingAdministrativePlanInstanceAnalysisParameters = complianceReportingAdministrativePlanInstanceAnalysisParameters;
  }


}

