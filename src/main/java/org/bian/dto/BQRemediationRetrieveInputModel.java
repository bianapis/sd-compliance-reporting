package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRemediationRetrieveInputModelRemediationInstanceAnalysis;
import org.bian.dto.BQRemediationRetrieveInputModelRemediationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRemediationRetrieveInputModel
 */
public class BQRemediationRetrieveInputModel   {
  private Object remediationRetrieveActionTaskRecord = null;

  private String remediationRetrieveActionRequest = null;

  private BQRemediationRetrieveInputModelRemediationInstanceReport remediationInstanceReport = null;

  private BQRemediationRetrieveInputModelRemediationInstanceAnalysis remediationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return remediationRetrieveActionTaskRecord
  **/

  public Object getRemediationRetrieveActionTaskRecord() {
    return remediationRetrieveActionTaskRecord;
  }

  public void setRemediationRetrieveActionTaskRecord(Object remediationRetrieveActionTaskRecord) {
    this.remediationRetrieveActionTaskRecord = remediationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return remediationRetrieveActionRequest
  **/

  public String getRemediationRetrieveActionRequest() {
    return remediationRetrieveActionRequest;
  }

  public void setRemediationRetrieveActionRequest(String remediationRetrieveActionRequest) {
    this.remediationRetrieveActionRequest = remediationRetrieveActionRequest;
  }


  /**
   * Get remediationInstanceReport
   * @return remediationInstanceReport
  **/

  public BQRemediationRetrieveInputModelRemediationInstanceReport getRemediationInstanceReport() {
    return remediationInstanceReport;
  }

  public void setRemediationInstanceReport(BQRemediationRetrieveInputModelRemediationInstanceReport remediationInstanceReport) {
    this.remediationInstanceReport = remediationInstanceReport;
  }


  /**
   * Get remediationInstanceAnalysis
   * @return remediationInstanceAnalysis
  **/

  public BQRemediationRetrieveInputModelRemediationInstanceAnalysis getRemediationInstanceAnalysis() {
    return remediationInstanceAnalysis;
  }

  public void setRemediationInstanceAnalysis(BQRemediationRetrieveInputModelRemediationInstanceAnalysis remediationInstanceAnalysis) {
    this.remediationInstanceAnalysis = remediationInstanceAnalysis;
  }


}

