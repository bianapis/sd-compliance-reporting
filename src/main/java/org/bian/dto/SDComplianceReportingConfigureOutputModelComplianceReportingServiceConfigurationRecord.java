package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceAgreement;
import org.bian.dto.SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup;
import org.bian.dto.SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingConfigureOutputModelComplianceReportingServiceConfigurationRecord
 */
public class SDComplianceReportingConfigureOutputModelComplianceReportingServiceConfigurationRecord   {
  private String complianceReportingServiceConfigurationSettingDescription = null;

  private SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup complianceReportingServiceConfigurationSetup = null;

  private SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceSubscription complianceReportingServiceSubscription = null;

  private SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceAgreement complianceReportingServiceAgreement = null;

  private String complianceReportingServiceStatus = null;


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

  public SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup getComplianceReportingServiceConfigurationSetup() {
    return complianceReportingServiceConfigurationSetup;
  }

  public void setComplianceReportingServiceConfigurationSetup(SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup complianceReportingServiceConfigurationSetup) {
    this.complianceReportingServiceConfigurationSetup = complianceReportingServiceConfigurationSetup;
  }


  /**
   * Get complianceReportingServiceSubscription
   * @return complianceReportingServiceSubscription
  **/

  public SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceSubscription getComplianceReportingServiceSubscription() {
    return complianceReportingServiceSubscription;
  }

  public void setComplianceReportingServiceSubscription(SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceSubscription complianceReportingServiceSubscription) {
    this.complianceReportingServiceSubscription = complianceReportingServiceSubscription;
  }


  /**
   * Get complianceReportingServiceAgreement
   * @return complianceReportingServiceAgreement
  **/

  public SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceAgreement getComplianceReportingServiceAgreement() {
    return complianceReportingServiceAgreement;
  }

  public void setComplianceReportingServiceAgreement(SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceAgreement complianceReportingServiceAgreement) {
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

