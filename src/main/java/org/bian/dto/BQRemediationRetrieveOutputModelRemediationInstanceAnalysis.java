package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRemediationRetrieveOutputModelRemediationInstanceAnalysis
 */
public class BQRemediationRetrieveOutputModelRemediationInstanceAnalysis   {
  private Object remediationInstanceAnalysisRecord = null;

  private String remediationInstanceAnalysisReportType = null;

  private String remediationInstanceAnalysisParameters = null;

  private Object remediationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return remediationInstanceAnalysisRecord
  **/

  public Object getRemediationInstanceAnalysisRecord() {
    return remediationInstanceAnalysisRecord;
  }

  public void setRemediationInstanceAnalysisRecord(Object remediationInstanceAnalysisRecord) {
    this.remediationInstanceAnalysisRecord = remediationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return remediationInstanceAnalysisReportType
  **/

  public String getRemediationInstanceAnalysisReportType() {
    return remediationInstanceAnalysisReportType;
  }

  public void setRemediationInstanceAnalysisReportType(String remediationInstanceAnalysisReportType) {
    this.remediationInstanceAnalysisReportType = remediationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return remediationInstanceAnalysisParameters
  **/

  public String getRemediationInstanceAnalysisParameters() {
    return remediationInstanceAnalysisParameters;
  }

  public void setRemediationInstanceAnalysisParameters(String remediationInstanceAnalysisParameters) {
    this.remediationInstanceAnalysisParameters = remediationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return remediationInstanceAnalysisReport
  **/

  public Object getRemediationInstanceAnalysisReport() {
    return remediationInstanceAnalysisReport;
  }

  public void setRemediationInstanceAnalysisReport(Object remediationInstanceAnalysisReport) {
    this.remediationInstanceAnalysisReport = remediationInstanceAnalysisReport;
  }


}

