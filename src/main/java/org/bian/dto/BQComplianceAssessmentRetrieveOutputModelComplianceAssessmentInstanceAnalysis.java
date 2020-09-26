package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQComplianceAssessmentRetrieveOutputModelComplianceAssessmentInstanceAnalysis
 */
public class BQComplianceAssessmentRetrieveOutputModelComplianceAssessmentInstanceAnalysis   {
  private Object complianceAssessmentInstanceAnalysisRecord = null;

  private String complianceAssessmentInstanceAnalysisReportType = null;

  private String complianceAssessmentInstanceAnalysisParameters = null;

  private Object complianceAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return complianceAssessmentInstanceAnalysisRecord
  **/

  public Object getComplianceAssessmentInstanceAnalysisRecord() {
    return complianceAssessmentInstanceAnalysisRecord;
  }

  public void setComplianceAssessmentInstanceAnalysisRecord(Object complianceAssessmentInstanceAnalysisRecord) {
    this.complianceAssessmentInstanceAnalysisRecord = complianceAssessmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return complianceAssessmentInstanceAnalysisReportType
  **/

  public String getComplianceAssessmentInstanceAnalysisReportType() {
    return complianceAssessmentInstanceAnalysisReportType;
  }

  public void setComplianceAssessmentInstanceAnalysisReportType(String complianceAssessmentInstanceAnalysisReportType) {
    this.complianceAssessmentInstanceAnalysisReportType = complianceAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return complianceAssessmentInstanceAnalysisParameters
  **/

  public String getComplianceAssessmentInstanceAnalysisParameters() {
    return complianceAssessmentInstanceAnalysisParameters;
  }

  public void setComplianceAssessmentInstanceAnalysisParameters(String complianceAssessmentInstanceAnalysisParameters) {
    this.complianceAssessmentInstanceAnalysisParameters = complianceAssessmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return complianceAssessmentInstanceAnalysisReport
  **/

  public Object getComplianceAssessmentInstanceAnalysisReport() {
    return complianceAssessmentInstanceAnalysisReport;
  }

  public void setComplianceAssessmentInstanceAnalysisReport(Object complianceAssessmentInstanceAnalysisReport) {
    this.complianceAssessmentInstanceAnalysisReport = complianceAssessmentInstanceAnalysisReport;
  }


}

