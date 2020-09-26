package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDComplianceReportingConfigureOutputModelComplianceReportingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingConfigureOutputModel
 */
public class SDComplianceReportingConfigureOutputModel   {
  private String complianceReportingConfigurationActionTaskReference = null;

  private Object complianceReportingConfigurationActionTaskRecord = null;

  private SDComplianceReportingConfigureOutputModelComplianceReportingServiceConfigurationRecord complianceReportingServiceConfigurationRecord = null;

  private String complianceReportingServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return complianceReportingConfigurationActionTaskReference
  **/

  public String getComplianceReportingConfigurationActionTaskReference() {
    return complianceReportingConfigurationActionTaskReference;
  }

  public void setComplianceReportingConfigurationActionTaskReference(String complianceReportingConfigurationActionTaskReference) {
    this.complianceReportingConfigurationActionTaskReference = complianceReportingConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return complianceReportingConfigurationActionTaskRecord
  **/

  public Object getComplianceReportingConfigurationActionTaskRecord() {
    return complianceReportingConfigurationActionTaskRecord;
  }

  public void setComplianceReportingConfigurationActionTaskRecord(Object complianceReportingConfigurationActionTaskRecord) {
    this.complianceReportingConfigurationActionTaskRecord = complianceReportingConfigurationActionTaskRecord;
  }


  /**
   * Get complianceReportingServiceConfigurationRecord
   * @return complianceReportingServiceConfigurationRecord
  **/

  public SDComplianceReportingConfigureOutputModelComplianceReportingServiceConfigurationRecord getComplianceReportingServiceConfigurationRecord() {
    return complianceReportingServiceConfigurationRecord;
  }

  public void setComplianceReportingServiceConfigurationRecord(SDComplianceReportingConfigureOutputModelComplianceReportingServiceConfigurationRecord complianceReportingServiceConfigurationRecord) {
    this.complianceReportingServiceConfigurationRecord = complianceReportingServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return complianceReportingServicingSessionStatus
  **/

  public String getComplianceReportingServicingSessionStatus() {
    return complianceReportingServicingSessionStatus;
  }

  public void setComplianceReportingServicingSessionStatus(String complianceReportingServicingSessionStatus) {
    this.complianceReportingServicingSessionStatus = complianceReportingServicingSessionStatus;
  }


}

