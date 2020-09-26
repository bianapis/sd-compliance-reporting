package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedServiceComplianceReportingServiceRecordComplianceReportingServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedServiceComplianceReportingServiceRecord
 */
public class SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedServiceComplianceReportingServiceRecord   {
  private String complianceReportingServiceType = null;

  private String complianceReportingServiceVersion = null;

  private String complianceReportingServiceDescription = null;

  private SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedServiceComplianceReportingServiceRecordComplianceReportingServicePoliciesandGuidelines complianceReportingServicePoliciesandGuidelines = null;

  private String complianceReportingServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return complianceReportingServiceType
  **/

  public String getComplianceReportingServiceType() {
    return complianceReportingServiceType;
  }

  public void setComplianceReportingServiceType(String complianceReportingServiceType) {
    this.complianceReportingServiceType = complianceReportingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return complianceReportingServiceVersion
  **/

  public String getComplianceReportingServiceVersion() {
    return complianceReportingServiceVersion;
  }

  public void setComplianceReportingServiceVersion(String complianceReportingServiceVersion) {
    this.complianceReportingServiceVersion = complianceReportingServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return complianceReportingServiceDescription
  **/

  public String getComplianceReportingServiceDescription() {
    return complianceReportingServiceDescription;
  }

  public void setComplianceReportingServiceDescription(String complianceReportingServiceDescription) {
    this.complianceReportingServiceDescription = complianceReportingServiceDescription;
  }


  /**
   * Get complianceReportingServicePoliciesandGuidelines
   * @return complianceReportingServicePoliciesandGuidelines
  **/

  public SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedServiceComplianceReportingServiceRecordComplianceReportingServicePoliciesandGuidelines getComplianceReportingServicePoliciesandGuidelines() {
    return complianceReportingServicePoliciesandGuidelines;
  }

  public void setComplianceReportingServicePoliciesandGuidelines(SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedServiceComplianceReportingServiceRecordComplianceReportingServicePoliciesandGuidelines complianceReportingServicePoliciesandGuidelines) {
    this.complianceReportingServicePoliciesandGuidelines = complianceReportingServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return complianceReportingServiceSchedule
  **/

  public String getComplianceReportingServiceSchedule() {
    return complianceReportingServiceSchedule;
  }

  public void setComplianceReportingServiceSchedule(String complianceReportingServiceSchedule) {
    this.complianceReportingServiceSchedule = complianceReportingServiceSchedule;
  }


}

