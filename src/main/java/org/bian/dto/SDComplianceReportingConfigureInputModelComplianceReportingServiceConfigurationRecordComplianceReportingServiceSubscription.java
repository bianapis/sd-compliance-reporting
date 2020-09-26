package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceSubscription
 */
public class SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceSubscription   {
  private String complianceReportingServiceSubscriberReference = null;

  private String complianceReportingServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return complianceReportingServiceSubscriberReference
  **/

  public String getComplianceReportingServiceSubscriberReference() {
    return complianceReportingServiceSubscriberReference;
  }

  public void setComplianceReportingServiceSubscriberReference(String complianceReportingServiceSubscriberReference) {
    this.complianceReportingServiceSubscriberReference = complianceReportingServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return complianceReportingServiceSubscriberAccessProfile
  **/

  public String getComplianceReportingServiceSubscriberAccessProfile() {
    return complianceReportingServiceSubscriberAccessProfile;
  }

  public void setComplianceReportingServiceSubscriberAccessProfile(String complianceReportingServiceSubscriberAccessProfile) {
    this.complianceReportingServiceSubscriberAccessProfile = complianceReportingServiceSubscriberAccessProfile;
  }


}

