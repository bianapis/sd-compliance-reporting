package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRemediationRetrieveInputModelRemediationInstanceAnalysis
 */
public class BQRemediationRetrieveInputModelRemediationInstanceAnalysis   {
  private String remediationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return remediationInstanceAnalysisReference
  **/

  public String getRemediationInstanceAnalysisReference() {
    return remediationInstanceAnalysisReference;
  }

  public void setRemediationInstanceAnalysisReference(String remediationInstanceAnalysisReference) {
    this.remediationInstanceAnalysisReference = remediationInstanceAnalysisReference;
  }


}

