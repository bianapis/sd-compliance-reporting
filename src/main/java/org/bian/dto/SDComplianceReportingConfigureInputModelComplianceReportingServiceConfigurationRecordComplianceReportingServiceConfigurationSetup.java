package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup
 */
public class SDComplianceReportingConfigureInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup   {
  private String complianceReportingServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return complianceReportingServiceConfigurationParameter
  **/

  public String getComplianceReportingServiceConfigurationParameter() {
    return complianceReportingServiceConfigurationParameter;
  }

  public void setComplianceReportingServiceConfigurationParameter(String complianceReportingServiceConfigurationParameter) {
    this.complianceReportingServiceConfigurationParameter = complianceReportingServiceConfigurationParameter;
  }


}

