package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDComplianceReportingActivateInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup;
import org.bian.dto.SDComplianceReportingActivateOutputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceAgreement;
import org.bian.dto.SDComplianceReportingActivateOutputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingActivateOutputModelComplianceReportingServiceConfigurationRecord
 */
public class SDComplianceReportingActivateOutputModelComplianceReportingServiceConfigurationRecord   {
  private String complianceReportingServiceConfigurationSettingReference = null;

  private String complianceReportingServiceConfigurationSettingDescription = null;

  private SDComplianceReportingActivateInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup complianceReportingServiceConfigurationSetup = null;

  private SDComplianceReportingActivateOutputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceSubscription complianceReportingServiceSubscription = null;

  private SDComplianceReportingActivateOutputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceAgreement complianceReportingServiceAgreement = null;

  private String complianceReportingServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return complianceReportingServiceConfigurationSettingReference
  **/

  public String getComplianceReportingServiceConfigurationSettingReference() {
    return complianceReportingServiceConfigurationSettingReference;
  }

  public void setComplianceReportingServiceConfigurationSettingReference(String complianceReportingServiceConfigurationSettingReference) {
    this.complianceReportingServiceConfigurationSettingReference = complianceReportingServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return complianceReportingServiceConfigurationSettingDescription
  **/

  public String getComplianceReportingServiceConfigurationSettingDescription() {
    return complianceReportingServiceConfigurationSettingDescription;
  }

  public void setComplianceReportingServiceConfigurationSettingDescription(String complianceReportingServiceConfigurationSettingDescription) {
    this.complianceReportingServiceConfigurationSettingDescription = complianceReportingServiceConfigurationSettingDescription;
  }


  /**
   * Get complianceReportingServiceConfigurationSetup
   * @return complianceReportingServiceConfigurationSetup
  **/

  public SDComplianceReportingActivateInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup getComplianceReportingServiceConfigurationSetup() {
    return complianceReportingServiceConfigurationSetup;
  }

  public void setComplianceReportingServiceConfigurationSetup(SDComplianceReportingActivateInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup complianceReportingServiceConfigurationSetup) {
    this.complianceReportingServiceConfigurationSetup = complianceReportingServiceConfigurationSetup;
  }


  /**
   * Get complianceReportingServiceSubscription
   * @return complianceReportingServiceSubscription
  **/

  public SDComplianceReportingActivateOutputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceSubscription getComplianceReportingServiceSubscription() {
    return complianceReportingServiceSubscription;
  }

  public void setComplianceReportingServiceSubscription(SDComplianceReportingActivateOutputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceSubscription complianceReportingServiceSubscription) {
    this.complianceReportingServiceSubscription = complianceReportingServiceSubscription;
  }


  /**
   * Get complianceReportingServiceAgreement
   * @return complianceReportingServiceAgreement
  **/

  public SDComplianceReportingActivateOutputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceAgreement getComplianceReportingServiceAgreement() {
    return complianceReportingServiceAgreement;
  }

  public void setComplianceReportingServiceAgreement(SDComplianceReportingActivateOutputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceAgreement complianceReportingServiceAgreement) {
    this.complianceReportingServiceAgreement = complianceReportingServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return complianceReportingServiceStatus
  **/

  public String getComplianceReportingServiceStatus() {
    return complianceReportingServiceStatus;
  }

  public void setComplianceReportingServiceStatus(String complianceReportingServiceStatus) {
    this.complianceReportingServiceStatus = complianceReportingServiceStatus;
  }


}

