package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedServiceComplianceReportingServiceRecordComplianceReportingServicePoliciesandGuidelines
 */
public class SDComplianceReportingRetrieveOutputModelComplianceReportingOfferedServiceComplianceReportingServiceRecordComplianceReportingServicePoliciesandGuidelines   {
  private String complianceReportingServiceEligibility = null;

  private String complianceReportingServiceIntendedUses = null;

  private String complianceReportingServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return complianceReportingServiceEligibility
  **/

  public String getComplianceReportingServiceEligibility() {
    return complianceReportingServiceEligibility;
  }

  public void setComplianceReportingServiceEligibility(String complianceReportingServiceEligibility) {
    this.complianceReportingServiceEligibility = complianceReportingServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return complianceReportingServiceIntendedUses
  **/

  public String getComplianceReportingServiceIntendedUses() {
    return complianceReportingServiceIntendedUses;
  }

  public void setComplianceReportingServiceIntendedUses(String complianceReportingServiceIntendedUses) {
    this.complianceReportingServiceIntendedUses = complianceReportingServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return complianceReportingServicePricingandTerms
  **/

  public String getComplianceReportingServicePricingandTerms() {
    return complianceReportingServicePricingandTerms;
  }

  public void setComplianceReportingServicePricingandTerms(String complianceReportingServicePricingandTerms) {
    this.complianceReportingServicePricingandTerms = complianceReportingServicePricingandTerms;
  }


}

