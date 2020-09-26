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
 * SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecord
 */
public class SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecord   {
  private String complianceReportingServiceConfigurationSettingReference = null;

  private String complianceReportingServiceConfigurationSettingType = null;

  private SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup complianceReportingServiceConfigurationSetup = null;

  private SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceSubscription complianceReportingServiceSubscription = null;

  private SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceAgreement complianceReportingServiceAgreement = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return complianceReportingServiceConfigurationSettingType
  **/

  public String getComplianceReportingServiceConfigurationSettingType() {
    return complianceReportingServiceConfigurationSettingType;
  }

  public void setComplianceReportingServiceConfigurationSettingType(String complianceReportingServiceConfigurationSettingType) {
    this.complianceReportingServiceConfigurationSettingType = complianceReportingServiceConfigurationSettingType;
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


}

