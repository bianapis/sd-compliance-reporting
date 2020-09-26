package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDComplianceReportingActivateOutputModelComplianceReportingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingActivateOutputModel
 */
public class SDComplianceReportingActivateOutputModel   {
  private String complianceReportingActivationActionTaskReference = null;

  private Object complianceReportingActivationActionTaskRecord = null;

  private String complianceReportingServicingSessionReference = null;

  private Object complianceReportingServicingSessionRecord = null;

  private SDComplianceReportingActivateOutputModelComplianceReportingServiceConfigurationRecord complianceReportingServiceConfigurationRecord = null;

  private String complianceReportingServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return complianceReportingActivationActionTaskReference
  **/

  public String getComplianceReportingActivationActionTaskReference() {
    return complianceReportingActivationActionTaskReference;
  }

  public void setComplianceReportingActivationActionTaskReference(String complianceReportingActivationActionTaskReference) {
    this.complianceReportingActivationActionTaskReference = complianceReportingActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return complianceReportingActivationActionTaskRecord
  **/

  public Object getComplianceReportingActivationActionTaskRecord() {
    return complianceReportingActivationActionTaskRecord;
  }

  public void setComplianceReportingActivationActionTaskRecord(Object complianceReportingActivationActionTaskRecord) {
    this.complianceReportingActivationActionTaskRecord = complianceReportingActivationActionTaskRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return complianceReportingServicingSessionRecord
  **/

  public Object getComplianceReportingServicingSessionRecord() {
    return complianceReportingServicingSessionRecord;
  }

  public void setComplianceReportingServicingSessionRecord(Object complianceReportingServicingSessionRecord) {
    this.complianceReportingServicingSessionRecord = complianceReportingServicingSessionRecord;
  }


  /**
   * Get complianceReportingServiceConfigurationRecord
   * @return complianceReportingServiceConfigurationRecord
  **/

  public SDComplianceReportingActivateOutputModelComplianceReportingServiceConfigurationRecord getComplianceReportingServiceConfigurationRecord() {
    return complianceReportingServiceConfigurationRecord;
  }

  public void setComplianceReportingServiceConfigurationRecord(SDComplianceReportingActivateOutputModelComplianceReportingServiceConfigurationRecord complianceReportingServiceConfigurationRecord) {
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

