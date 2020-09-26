package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingActivateInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup
 */
public class SDComplianceReportingActivateInputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceConfigurationSetup   {
  private String complianceReportingServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return complianceReportingServiceConfigurationParameter
  **/

  public String getComplianceReportingServiceConfigurationParameter() {
    return complianceReportingServiceConfigurationParameter;
  }

  public void setComplianceReportingServiceConfigurationParameter(String complianceReportingServiceConfigurationParameter) {
    this.complianceReportingServiceConfigurationParameter = complianceReportingServiceConfigurationParameter;
  }


}

