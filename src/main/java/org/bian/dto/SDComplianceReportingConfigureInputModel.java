package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingConfigureInputModel
 */
public class SDComplianceReportingConfigureInputModel   {
  private Object complianceReportingConfigurationActionTaskRecord = null;

  private String complianceReportingServicingSessionReference = null;

  private String complianceReportingServiceReference = null;

  private SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecord complianceReportingServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return complianceReportingServicingSessionReference
  **/

  public String getComplianceReportingServicingSessionReference() {
    return complianceReportingServicingSessionReference;
  }

  public void setComplianceReportingServicingSessionReference(String complianceReportingServicingSessionReference) {
    this.complianceReportingServicingSessionReference = complianceReportingServicingSessionReference;
  }


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
   * Get complianceReportingServiceConfigurationRecord
   * @return complianceReportingServiceConfigurationRecord
  **/

  public SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecord getComplianceReportingServiceConfigurationRecord() {
    return complianceReportingServiceConfigurationRecord;
  }

  public void setComplianceReportingServiceConfigurationRecord(SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecord complianceReportingServiceConfigurationRecord) {
    this.complianceReportingServiceConfigurationRecord = complianceReportingServiceConfigurationRecord;
  }


}

