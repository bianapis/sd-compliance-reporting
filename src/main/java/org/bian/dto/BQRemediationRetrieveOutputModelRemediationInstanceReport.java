package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRemediationRetrieveOutputModelRemediationInstanceReport
 */
public class BQRemediationRetrieveOutputModelRemediationInstanceReport   {
  private Object remediationInstanceReportRecord = null;

  private String remediationInstanceReportType = null;

  private String remediationInstanceReportParameters = null;

  private Object remediationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return remediationInstanceReportRecord
  **/

  public Object getRemediationInstanceReportRecord() {
    return remediationInstanceReportRecord;
  }

  public void setRemediationInstanceReportRecord(Object remediationInstanceReportRecord) {
    this.remediationInstanceReportRecord = remediationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return remediationInstanceReportType
  **/

  public String getRemediationInstanceReportType() {
    return remediationInstanceReportType;
  }

  public void setRemediationInstanceReportType(String remediationInstanceReportType) {
    this.remediationInstanceReportType = remediationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return remediationInstanceReportParameters
  **/

  public String getRemediationInstanceReportParameters() {
    return remediationInstanceReportParameters;
  }

  public void setRemediationInstanceReportParameters(String remediationInstanceReportParameters) {
    this.remediationInstanceReportParameters = remediationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return remediationInstanceReport
  **/

  public Object getRemediationInstanceReport() {
    return remediationInstanceReport;
  }

  public void setRemediationInstanceReport(Object remediationInstanceReport) {
    this.remediationInstanceReport = remediationInstanceReport;
  }


}

