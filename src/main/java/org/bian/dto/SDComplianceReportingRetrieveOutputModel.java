package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedService;
import org.bian.dto.SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingRetrieveOutputModel
 */
public class SDComplianceReportingRetrieveOutputModel   {
  private String complianceReportingRetrieveActionTaskReference = null;

  private Object complianceReportingRetrieveActionTaskRecord = null;

  private String complianceReportingRetrieveActionResponse = null;

  private SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecord complianceReportingRetrieveActionRecord = null;

  private SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedService complianceReportingOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return complianceReportingRetrieveActionTaskReference
  **/

  public String getComplianceReportingRetrieveActionTaskReference() {
    return complianceReportingRetrieveActionTaskReference;
  }

  public void setComplianceReportingRetrieveActionTaskReference(String complianceReportingRetrieveActionTaskReference) {
    this.complianceReportingRetrieveActionTaskReference = complianceReportingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return complianceReportingRetrieveActionTaskRecord
  **/

  public Object getComplianceReportingRetrieveActionTaskRecord() {
    return complianceReportingRetrieveActionTaskRecord;
  }

  public void setComplianceReportingRetrieveActionTaskRecord(Object complianceReportingRetrieveActionTaskRecord) {
    this.complianceReportingRetrieveActionTaskRecord = complianceReportingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return complianceReportingRetrieveActionResponse
  **/

  public String getComplianceReportingRetrieveActionResponse() {
    return complianceReportingRetrieveActionResponse;
  }

  public void setComplianceReportingRetrieveActionResponse(String complianceReportingRetrieveActionResponse) {
    this.complianceReportingRetrieveActionResponse = complianceReportingRetrieveActionResponse;
  }


  /**
   * Get complianceReportingRetrieveActionRecord
   * @return complianceReportingRetrieveActionRecord
  **/

  public SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecord getComplianceReportingRetrieveActionRecord() {
    return complianceReportingRetrieveActionRecord;
  }

  public void setComplianceReportingRetrieveActionRecord(SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecord complianceReportingRetrieveActionRecord) {
    this.complianceReportingRetrieveActionRecord = complianceReportingRetrieveActionRecord;
  }


  /**
   * Get complianceReportingOfferedService
   * @return complianceReportingOfferedService
  **/

  public SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedService getComplianceReportingOfferedService() {
    return complianceReportingOfferedService;
  }

  public void setComplianceReportingOfferedService(SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedService complianceReportingOfferedService) {
    this.complianceReportingOfferedService = complianceReportingOfferedService;
  }


}

