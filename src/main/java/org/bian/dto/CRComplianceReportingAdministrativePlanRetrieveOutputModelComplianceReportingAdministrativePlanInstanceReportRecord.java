package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRComplianceReportingAdministrativePlanRetrieveOutputModelComplianceReportingAdministrativePlanInstanceReportRecord
 */
public class CRComplianceReportingAdministrativePlanRetrieveOutputModelComplianceReportingAdministrativePlanInstanceReportRecord   {
  private String complianceReportingAdministrativePlanInstanceReportData = null;

  private String complianceReportingAdministrativePlanInstanceReportType = null;

  private Object complianceReportingAdministrativePlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return complianceReportingAdministrativePlanInstanceReportData
  **/

  public String getComplianceReportingAdministrativePlanInstanceReportData() {
    return complianceReportingAdministrativePlanInstanceReportData;
  }

  public void setComplianceReportingAdministrativePlanInstanceReportData(String complianceReportingAdministrativePlanInstanceReportData) {
    this.complianceReportingAdministrativePlanInstanceReportData = complianceReportingAdministrativePlanInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return complianceReportingAdministrativePlanInstanceReport
  **/

  public Object getComplianceReportingAdministrativePlanInstanceReport() {
    return complianceReportingAdministrativePlanInstanceReport;
  }

  public void setComplianceReportingAdministrativePlanInstanceReport(Object complianceReportingAdministrativePlanInstanceReport) {
    this.complianceReportingAdministrativePlanInstanceReport = complianceReportingAdministrativePlanInstanceReport;
  }


}

