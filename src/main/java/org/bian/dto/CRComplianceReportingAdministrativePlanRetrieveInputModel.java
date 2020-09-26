package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRComplianceReportingAdministrativePlanRetrieveInputModelComplianceReportingAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRComplianceReportingAdministrativePlanRetrieveInputModelComplianceReportingAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRComplianceReportingAdministrativePlanRetrieveInputModel
 */
public class CRComplianceReportingAdministrativePlanRetrieveInputModel   {
  private Object complianceReportingAdministrativePlanRetrieveActionTaskRecord = null;

  private String complianceReportingAdministrativePlanRetrieveActionRequest = null;

  private CRComplianceReportingAdministrativePlanRetrieveInputModelComplianceReportingAdministrativePlanInstanceReportRecord complianceReportingAdministrativePlanInstanceReportRecord = null;

  private CRComplianceReportingAdministrativePlanRetrieveInputModelComplianceReportingAdministrativePlanInstanceAnalysis complianceReportingAdministrativePlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return complianceReportingAdministrativePlanRetrieveActionTaskRecord
  **/

  public Object getComplianceReportingAdministrativePlanRetrieveActionTaskRecord() {
    return complianceReportingAdministrativePlanRetrieveActionTaskRecord;
  }

  public void setComplianceReportingAdministrativePlanRetrieveActionTaskRecord(Object complianceReportingAdministrativePlanRetrieveActionTaskRecord) {
    this.complianceReportingAdministrativePlanRetrieveActionTaskRecord = complianceReportingAdministrativePlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return complianceReportingAdministrativePlanRetrieveActionRequest
  **/

  public String getComplianceReportingAdministrativePlanRetrieveActionRequest() {
    return complianceReportingAdministrativePlanRetrieveActionRequest;
  }

  public void setComplianceReportingAdministrativePlanRetrieveActionRequest(String complianceReportingAdministrativePlanRetrieveActionRequest) {
    this.complianceReportingAdministrativePlanRetrieveActionRequest = complianceReportingAdministrativePlanRetrieveActionRequest;
  }


  /**
   * Get complianceReportingAdministrativePlanInstanceReportRecord
   * @return complianceReportingAdministrativePlanInstanceReportRecord
  **/

  public CRComplianceReportingAdministrativePlanRetrieveInputModelComplianceReportingAdministrativePlanInstanceReportRecord getComplianceReportingAdministrativePlanInstanceReportRecord() {
    return complianceReportingAdministrativePlanInstanceReportRecord;
  }

  public void setComplianceReportingAdministrativePlanInstanceReportRecord(CRComplianceReportingAdministrativePlanRetrieveInputModelComplianceReportingAdministrativePlanInstanceReportRecord complianceReportingAdministrativePlanInstanceReportRecord) {
    this.complianceReportingAdministrativePlanInstanceReportRecord = complianceReportingAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get complianceReportingAdministrativePlanInstanceAnalysis
   * @return complianceReportingAdministrativePlanInstanceAnalysis
  **/

  public CRComplianceReportingAdministrativePlanRetrieveInputModelComplianceReportingAdministrativePlanInstanceAnalysis getComplianceReportingAdministrativePlanInstanceAnalysis() {
    return complianceReportingAdministrativePlanInstanceAnalysis;
  }

  public void setComplianceReportingAdministrativePlanInstanceAnalysis(CRComplianceReportingAdministrativePlanRetrieveInputModelComplianceReportingAdministrativePlanInstanceAnalysis complianceReportingAdministrativePlanInstanceAnalysis) {
    this.complianceReportingAdministrativePlanInstanceAnalysis = complianceReportingAdministrativePlanInstanceAnalysis;
  }


}

