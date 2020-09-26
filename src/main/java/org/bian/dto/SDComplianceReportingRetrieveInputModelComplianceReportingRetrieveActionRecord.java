package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecordComplianceReportingActivityAnalysis;
import org.bian.dto.SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecordComplianceReportingPerformanceAnalysis;
import org.bian.dto.SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecord
 */
public class SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecord   {
  private SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecordComplianceReportingActivityAnalysis complianceReportingActivityAnalysis = null;

  private SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecordComplianceReportingPerformanceAnalysis complianceReportingPerformanceAnalysis = null;

  private SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get complianceReportingActivityAnalysis
   * @return complianceReportingActivityAnalysis
  **/

  public SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecordComplianceReportingActivityAnalysis getComplianceReportingActivityAnalysis() {
    return complianceReportingActivityAnalysis;
  }

  public void setComplianceReportingActivityAnalysis(SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecordComplianceReportingActivityAnalysis complianceReportingActivityAnalysis) {
    this.complianceReportingActivityAnalysis = complianceReportingActivityAnalysis;
  }


  /**
   * Get complianceReportingPerformanceAnalysis
   * @return complianceReportingPerformanceAnalysis
  **/

  public SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecordComplianceReportingPerformanceAnalysis getComplianceReportingPerformanceAnalysis() {
    return complianceReportingPerformanceAnalysis;
  }

  public void setComplianceReportingPerformanceAnalysis(SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecordComplianceReportingPerformanceAnalysis complianceReportingPerformanceAnalysis) {
    this.complianceReportingPerformanceAnalysis = complianceReportingPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDComplianceReportingRetrieveInputModelComplianceReportingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

