package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQComplianceAssessmentRetrieveOutputModelComplianceAssessmentInstanceReport
 */
public class BQComplianceAssessmentRetrieveOutputModelComplianceAssessmentInstanceReport   {
  private Object complianceAssessmentInstanceReportRecord = null;

  private String complianceAssessmentInstanceReportType = null;

  private String complianceAssessmentInstanceReportParameters = null;

  private Object complianceAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return complianceAssessmentInstanceReportRecord
  **/

  public Object getComplianceAssessmentInstanceReportRecord() {
    return complianceAssessmentInstanceReportRecord;
  }

  public void setComplianceAssessmentInstanceReportRecord(Object complianceAssessmentInstanceReportRecord) {
    this.complianceAssessmentInstanceReportRecord = complianceAssessmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return complianceAssessmentInstanceReportType
  **/

  public String getComplianceAssessmentInstanceReportType() {
    return complianceAssessmentInstanceReportType;
  }

  public void setComplianceAssessmentInstanceReportType(String complianceAssessmentInstanceReportType) {
    this.complianceAssessmentInstanceReportType = complianceAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return complianceAssessmentInstanceReportParameters
  **/

  public String getComplianceAssessmentInstanceReportParameters() {
    return complianceAssessmentInstanceReportParameters;
  }

  public void setComplianceAssessmentInstanceReportParameters(String complianceAssessmentInstanceReportParameters) {
    this.complianceAssessmentInstanceReportParameters = complianceAssessmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return complianceAssessmentInstanceReport
  **/

  public Object getComplianceAssessmentInstanceReport() {
    return complianceAssessmentInstanceReport;
  }

  public void setComplianceAssessmentInstanceReport(Object complianceAssessmentInstanceReport) {
    this.complianceAssessmentInstanceReport = complianceAssessmentInstanceReport;
  }


}

