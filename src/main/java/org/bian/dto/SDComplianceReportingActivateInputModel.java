package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDComplianceReportingActivateInputModelComplianceReportingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingActivateInputModel
 */
public class SDComplianceReportingActivateInputModel   {
  private Object complianceReportingActivationActionTaskRecord = null;

  private String complianceReportingCenterReference = null;

  private String complianceReportingServiceReference = null;

  private SDComplianceReportingActivateInputModelComplianceReportingServiceConfigurationRecord complianceReportingServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return complianceReportingCenterReference
  **/

  public String getComplianceReportingCenterReference() {
    return complianceReportingCenterReference;
  }

  public void setComplianceReportingCenterReference(String complianceReportingCenterReference) {
    this.complianceReportingCenterReference = complianceReportingCenterReference;
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

  public SDComplianceReportingActivateInputModelComplianceReportingServiceConfigurationRecord getComplianceReportingServiceConfigurationRecord() {
    return complianceReportingServiceConfigurationRecord;
  }

  public void setComplianceReportingServiceConfigurationRecord(SDComplianceReportingActivateInputModelComplianceReportingServiceConfigurationRecord complianceReportingServiceConfigurationRecord) {
    this.complianceReportingServiceConfigurationRecord = complianceReportingServiceConfigurationRecord;
  }


}

