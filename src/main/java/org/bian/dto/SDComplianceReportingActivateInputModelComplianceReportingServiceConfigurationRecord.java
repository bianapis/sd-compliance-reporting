package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDComplianceReportingActivateInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingActivateInputModelComplianceReportingServiceConfigurationRecord
 */
public class SDComplianceReportingActivateInputModelComplianceReportingServiceConfigurationRecord   {
  private String complianceReportingServiceConfigurationSettingReference = null;

  private String complianceReportingServiceConfigurationSettingType = null;

  private SDComplianceReportingActivateInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup complianceReportingServiceConfigurationSetup = null;


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

  public SDComplianceReportingActivateInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup getComplianceReportingServiceConfigurationSetup() {
    return complianceReportingServiceConfigurationSetup;
  }

  public void setComplianceReportingServiceConfigurationSetup(SDComplianceReportingActivateInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup complianceReportingServiceConfigurationSetup) {
    this.complianceReportingServiceConfigurationSetup = complianceReportingServiceConfigurationSetup;
  }


}

