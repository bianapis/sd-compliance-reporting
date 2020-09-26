package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDComplianceReportingRetrieveInputModelComplianceReportingOfferedService;
import org.bian.dto.SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingRetrieveInputModel
 */
public class SDComplianceReportingRetrieveInputModel   {
  private Object complianceReportingRetrieveActionTaskRecord = null;

  private String complianceReportingRetrieveActionRequest = null;

  private SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecord complianceReportingRetrieveActionRecord = null;

  private SDComplianceReportingRetrieveInputModelComplianceReportingOfferedService complianceReportingOfferedService = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return complianceReportingRetrieveActionRequest
  **/

  public String getComplianceReportingRetrieveActionRequest() {
    return complianceReportingRetrieveActionRequest;
  }

  public void setComplianceReportingRetrieveActionRequest(String complianceReportingRetrieveActionRequest) {
    this.complianceReportingRetrieveActionRequest = complianceReportingRetrieveActionRequest;
  }


  /**
   * Get complianceReportingRetrieveActionRecord
   * @return complianceReportingRetrieveActionRecord
  **/

  public SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecord getComplianceReportingRetrieveActionRecord() {
    return complianceReportingRetrieveActionRecord;
  }

  public void setComplianceReportingRetrieveActionRecord(SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecord complianceReportingRetrieveActionRecord) {
    this.complianceReportingRetrieveActionRecord = complianceReportingRetrieveActionRecord;
  }


  /**
   * Get complianceReportingOfferedService
   * @return complianceReportingOfferedService
  **/

  public SDComplianceReportingRetrieveInputModelComplianceReportingOfferedService getComplianceReportingOfferedService() {
    return complianceReportingOfferedService;
  }

  public void setComplianceReportingOfferedService(SDComplianceReportingRetrieveInputModelComplianceReportingOfferedService complianceReportingOfferedService) {
    this.complianceReportingOfferedService = complianceReportingOfferedService;
  }


}

