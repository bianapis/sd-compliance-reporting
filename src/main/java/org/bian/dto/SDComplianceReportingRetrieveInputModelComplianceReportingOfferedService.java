package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDComplianceReportingRetrieveInputModelComplianceReportingOfferedServiceComplianceReportingServiceRecord;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingRetrieveInputModelComplianceReportingOfferedService
 */
public class SDComplianceReportingRetrieveInputModelComplianceReportingOfferedService   {
  private String complianceReportingServiceReference = null;

  private SDComplianceReportingRetrieveInputModelComplianceReportingOfferedServiceComplianceReportingServiceRecord complianceReportingServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return complianceReportingServiceReference
  **/

  public String getComplianceReportingServiceReference() {
    return complianceReportingServiceReference;
  }

  public void setComplianceReportingServiceReference(String complianceReportingServiceReference) {
    this.complianceReportingServiceReference = complianceReportingServiceReference;
  }


  /**
   * Get complianceReportingServiceRecord
   * @return complianceReportingServiceRecord
  **/

  public SDComplianceReportingRetrieveInputModelComplianceReportingOfferedServiceComplianceReportingServiceRecord getComplianceReportingServiceRecord() {
    return complianceReportingServiceRecord;
  }

  public void setComplianceReportingServiceRecord(SDComplianceReportingRetrieveInputModelComplianceReportingOfferedServiceComplianceReportingServiceRecord complianceReportingServiceRecord) {
    this.complianceReportingServiceRecord = complianceReportingServiceRecord;
  }


}

