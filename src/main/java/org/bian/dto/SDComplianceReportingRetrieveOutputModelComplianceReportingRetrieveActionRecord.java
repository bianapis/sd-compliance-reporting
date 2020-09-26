package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecordComplianceReportingActivityAnalysis;
import org.bian.dto.SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecordComplianceReportingPerformanceAnalysis;
import org.bian.dto.SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecord
 */
public class SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecord   {
  private SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecordComplianceReportingActivityAnalysis complianceReportingActivityAnalysis = null;

  private SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecordComplianceReportingPerformanceAnalysis complianceReportingPerformanceAnalysis = null;

  private SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get complianceReportingActivityAnalysis
   * @return complianceReportingActivityAnalysis
  **/

  public SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecordComplianceReportingActivityAnalysis getComplianceReportingActivityAnalysis() {
    return complianceReportingActivityAnalysis;
  }

  public void setComplianceReportingActivityAnalysis(SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecordComplianceReportingActivityAnalysis complianceReportingActivityAnalysis) {
    this.complianceReportingActivityAnalysis = complianceReportingActivityAnalysis;
  }


  /**
   * Get complianceReportingPerformanceAnalysis
   * @return complianceReportingPerformanceAnalysis
  **/

  public SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecordComplianceReportingPerformanceAnalysis getComplianceReportingPerformanceAnalysis() {
    return complianceReportingPerformanceAnalysis;
  }

  public void setComplianceReportingPerformanceAnalysis(SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecordComplianceReportingPerformanceAnalysis complianceReportingPerformanceAnalysis) {
    this.complianceReportingPerformanceAnalysis = complianceReportingPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDComplianceReportingRetrieveOutputModelComplianceReportingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

