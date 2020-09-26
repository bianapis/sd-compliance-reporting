package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQComplianceAssessmentRetrieveInputModelComplianceAssessmentInstanceReport
 */
public class BQComplianceAssessmentRetrieveInputModelComplianceAssessmentInstanceReport   {
  private String complianceAssessmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return complianceAssessmentInstanceReportReference
  **/

  public String getComplianceAssessmentInstanceReportReference() {
    return complianceAssessmentInstanceReportReference;
  }

  public void setComplianceAssessmentInstanceReportReference(String complianceAssessmentInstanceReportReference) {
    this.complianceAssessmentInstanceReportReference = complianceAssessmentInstanceReportReference;
  }


}

