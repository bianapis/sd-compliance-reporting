package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedServiceComplianceReportingServiceRecord;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedService
 */
public class SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedService   {
  private String complianceReportingServiceReference = null;

  private SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedServiceComplianceReportingServiceRecord complianceReportingServiceRecord = null;


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

  public SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedServiceComplianceReportingServiceRecord getComplianceReportingServiceRecord() {
    return complianceReportingServiceRecord;
  }

  public void setComplianceReportingServiceRecord(SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedServiceComplianceReportingServiceRecord complianceReportingServiceRecord) {
    this.complianceReportingServiceRecord = complianceReportingServiceRecord;
  }


}

