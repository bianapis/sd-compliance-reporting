package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDComplianceReportingFeedbackInputModelComplianceReportingFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingFeedbackInputModel
 */
public class SDComplianceReportingFeedbackInputModel   {
  private Object complianceReportingFeedbackActionTaskRecord = null;

  private SDComplianceReportingFeedbackInputModelComplianceReportingFeedbackActionRecord complianceReportingFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return complianceReportingFeedbackActionTaskRecord
  **/

  public Object getComplianceReportingFeedbackActionTaskRecord() {
    return complianceReportingFeedbackActionTaskRecord;
  }

  public void setComplianceReportingFeedbackActionTaskRecord(Object complianceReportingFeedbackActionTaskRecord) {
    this.complianceReportingFeedbackActionTaskRecord = complianceReportingFeedbackActionTaskRecord;
  }


  /**
   * Get complianceReportingFeedbackActionRecord
   * @return complianceReportingFeedbackActionRecord
  **/

  public SDComplianceReportingFeedbackInputModelComplianceReportingFeedbackActionRecord getComplianceReportingFeedbackActionRecord() {
    return complianceReportingFeedbackActionRecord;
  }

  public void setComplianceReportingFeedbackActionRecord(SDComplianceReportingFeedbackInputModelComplianceReportingFeedbackActionRecord complianceReportingFeedbackActionRecord) {
    this.complianceReportingFeedbackActionRecord = complianceReportingFeedbackActionRecord;
  }


}

