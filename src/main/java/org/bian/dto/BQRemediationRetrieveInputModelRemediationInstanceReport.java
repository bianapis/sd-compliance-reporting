package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRemediationRetrieveInputModelRemediationInstanceReport
 */
public class BQRemediationRetrieveInputModelRemediationInstanceReport   {
  private String remediationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return remediationInstanceReportReference
  **/

  public String getRemediationInstanceReportReference() {
    return remediationInstanceReportReference;
  }

  public void setRemediationInstanceReportReference(String remediationInstanceReportReference) {
    this.remediationInstanceReportReference = remediationInstanceReportReference;
  }


}

