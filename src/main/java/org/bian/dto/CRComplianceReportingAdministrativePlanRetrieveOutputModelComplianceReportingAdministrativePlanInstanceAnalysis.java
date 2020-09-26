package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRComplianceReportingAdministrativePlanRetrieveOutputModelComplianceReportingAdministrativePlanInstanceAnalysis
 */
public class CRComplianceReportingAdministrativePlanRetrieveOutputModelComplianceReportingAdministrativePlanInstanceAnalysis   {
  private String complianceReportingAdministrativePlanInstanceAnalysisData = null;

  private String complianceReportingAdministrativePlanInstanceAnalysisReportType = null;

  private Object complianceReportingAdministrativePlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return complianceReportingAdministrativePlanInstanceAnalysisData
  **/

  public String getComplianceReportingAdministrativePlanInstanceAnalysisData() {
    return complianceReportingAdministrativePlanInstanceAnalysisData;
  }

  public void setComplianceReportingAdministrativePlanInstanceAnalysisData(String complianceReportingAdministrativePlanInstanceAnalysisData) {
    this.complianceReportingAdministrativePlanInstanceAnalysisData = complianceReportingAdministrativePlanInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return complianceReportingAdministrativePlanInstanceAnalysisReport
  **/

  public Object getComplianceReportingAdministrativePlanInstanceAnalysisReport() {
    return complianceReportingAdministrativePlanInstanceAnalysisReport;
  }

  public void setComplianceReportingAdministrativePlanInstanceAnalysisReport(Object complianceReportingAdministrativePlanInstanceAnalysisReport) {
    this.complianceReportingAdministrativePlanInstanceAnalysisReport = complianceReportingAdministrativePlanInstanceAnalysisReport;
  }


}

