package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDComplianceReportingFeedbackOutputModelComplianceReportingFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingFeedbackOutputModel
 */
public class SDComplianceReportingFeedbackOutputModel   {
  private String complianceReportingFeedbackActionTaskReference = null;

  private Object complianceReportingFeedbackActionTaskRecord = null;

  private SDComplianceReportingFeedbackOutputModelComplianceReportingFeedbackActionRecord complianceReportingFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return complianceReportingFeedbackActionTaskReference
  **/

  public String getComplianceReportingFeedbackActionTaskReference() {
    return complianceReportingFeedbackActionTaskReference;
  }

  public void setComplianceReportingFeedbackActionTaskReference(String complianceReportingFeedbackActionTaskReference) {
    this.complianceReportingFeedbackActionTaskReference = complianceReportingFeedbackActionTaskReference;
  }


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

  public SDComplianceReportingFeedbackOutputModelComplianceReportingFeedbackActionRecord getComplianceReportingFeedbackActionRecord() {
    return complianceReportingFeedbackActionRecord;
  }

  public void setComplianceReportingFeedbackActionRecord(SDComplianceReportingFeedbackOutputModelComplianceReportingFeedbackActionRecord complianceReportingFeedbackActionRecord) {
    this.complianceReportingFeedbackActionRecord = complianceReportingFeedbackActionRecord;
  }


}

