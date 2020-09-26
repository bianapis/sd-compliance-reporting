package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingActivateOutputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceAgreement
 */
public class SDComplianceReportingActivateOutputModelComplianceReportingServiceConfigurationRecordComplianceReportingServiceAgreement   {
  private String complianceReportingServiceAgreementReference = null;

  private String complianceReportingServiceUserReference = null;

  private String complianceReportingServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return complianceReportingServiceAgreementReference
  **/

  public String getComplianceReportingServiceAgreementReference() {
    return complianceReportingServiceAgreementReference;
  }

  public void setComplianceReportingServiceAgreementReference(String complianceReportingServiceAgreementReference) {
    this.complianceReportingServiceAgreementReference = complianceReportingServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return complianceReportingServiceUserReference
  **/

  public String getComplianceReportingServiceUserReference() {
    return complianceReportingServiceUserReference;
  }

  public void setComplianceReportingServiceUserReference(String complianceReportingServiceUserReference) {
    this.complianceReportingServiceUserReference = complianceReportingServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return complianceReportingServiceAgreementTermsandConditions
  **/

  public String getComplianceReportingServiceAgreementTermsandConditions() {
    return complianceReportingServiceAgreementTermsandConditions;
  }

  public void setComplianceReportingServiceAgreementTermsandConditions(String complianceReportingServiceAgreementTermsandConditions) {
    this.complianceReportingServiceAgreementTermsandConditions = complianceReportingServiceAgreementTermsandConditions;
  }


}

