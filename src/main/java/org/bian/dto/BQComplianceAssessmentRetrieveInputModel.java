package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQComplianceAssessmentRetrieveInputModelComplianceAssessmentInstanceAnalysis;
import org.bian.dto.BQComplianceAssessmentRetrieveInputModelComplianceAssessmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQComplianceAssessmentRetrieveInputModel
 */
public class BQComplianceAssessmentRetrieveInputModel   {
  private Object complianceAssessmentRetrieveActionTaskRecord = null;

  private String complianceAssessmentRetrieveActionRequest = null;

  private BQComplianceAssessmentRetrieveInputModelComplianceAssessmentInstanceReport complianceAssessmentInstanceReport = null;

  private BQComplianceAssessmentRetrieveInputModelComplianceAssessmentInstanceAnalysis complianceAssessmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return complianceAssessmentRetrieveActionTaskRecord
  **/

  public Object getComplianceAssessmentRetrieveActionTaskRecord() {
    return complianceAssessmentRetrieveActionTaskRecord;
  }

  public void setComplianceAssessmentRetrieveActionTaskRecord(Object complianceAssessmentRetrieveActionTaskRecord) {
    this.complianceAssessmentRetrieveActionTaskRecord = complianceAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return complianceAssessmentRetrieveActionRequest
  **/

  public String getComplianceAssessmentRetrieveActionRequest() {
    return complianceAssessmentRetrieveActionRequest;
  }

  public void setComplianceAssessmentRetrieveActionRequest(String complianceAssessmentRetrieveActionRequest) {
    this.complianceAssessmentRetrieveActionRequest = complianceAssessmentRetrieveActionRequest;
  }


  /**
   * Get complianceAssessmentInstanceReport
   * @return complianceAssessmentInstanceReport
  **/

  public BQComplianceAssessmentRetrieveInputModelComplianceAssessmentInstanceReport getComplianceAssessmentInstanceReport() {
    return complianceAssessmentInstanceReport;
  }

  public void setComplianceAssessmentInstanceReport(BQComplianceAssessmentRetrieveInputModelComplianceAssessmentInstanceReport complianceAssessmentInstanceReport) {
    this.complianceAssessmentInstanceReport = complianceAssessmentInstanceReport;
  }


  /**
   * Get complianceAssessmentInstanceAnalysis
   * @return complianceAssessmentInstanceAnalysis
  **/

  public BQComplianceAssessmentRetrieveInputModelComplianceAssessmentInstanceAnalysis getComplianceAssessmentInstanceAnalysis() {
    return complianceAssessmentInstanceAnalysis;
  }

  public void setComplianceAssessmentInstanceAnalysis(BQComplianceAssessmentRetrieveInputModelComplianceAssessmentInstanceAnalysis complianceAssessmentInstanceAnalysis) {
    this.complianceAssessmentInstanceAnalysis = complianceAssessmentInstanceAnalysis;
  }


}

