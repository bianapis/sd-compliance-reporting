/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Administer;

@BianRestController
public class ComplianceReportingApiController {

	@Autowired
	ComplianceReportingApiService service;
	
	@Administer.Activate
	public BianResponse<SDComplianceReportingActivateOutputModel> activate(@RequestBody BianRequest<SDComplianceReportingActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("complianceassessment")
	@Administer.Capture
	public BianResponse<BQComplianceAssessmentCaptureOutputModel> captureComplianceassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQComplianceAssessmentCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureComplianceassessment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("consolidation")
	@Administer.Capture
	public BianResponse<BQConsolidationCaptureOutputModel> captureConsolidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQConsolidationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureConsolidation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("remediation")
	@Administer.Capture
	public BianResponse<BQRemediationCaptureOutputModel> captureRemediation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRemediationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureRemediation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Capture
	public BianResponse<CRComplianceReportingAdministrativePlanCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRComplianceReportingAdministrativePlanCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Configure
	public BianResponse<SDComplianceReportingConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDComplianceReportingConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Administer.Feedback
	public BianResponse<SDComplianceReportingFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDComplianceReportingFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Administer.Initiate
	public BianResponse<CRComplianceReportingAdministrativePlanInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRComplianceReportingAdministrativePlanInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("remediation")
	@Administer.Initiate
	public BianResponse<BQRemediationInitiateOutputModel> initiateRemediation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQRemediationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateRemediation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("complianceassessment")
	@Administer.Request
	public BianResponse<BQComplianceAssessmentRequestOutputModel> requestComplianceassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQComplianceAssessmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestComplianceassessment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("consolidation")
	@Administer.Request
	public BianResponse<BQConsolidationRequestOutputModel> requestConsolidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQConsolidationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestConsolidation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("remediation")
	@Administer.Request
	public BianResponse<BQRemediationRequestOutputModel> requestRemediation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRemediationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestRemediation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Request
	public BianResponse<CRComplianceReportingAdministrativePlanRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRComplianceReportingAdministrativePlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Retrieve
	public BianResponse<CRComplianceReportingAdministrativePlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@BQ("complianceassessment")
	@Administer.Retrieve
	public BianResponse<BQComplianceAssessmentRetrieveOutputModel> retrieveComplianceassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveComplianceassessment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("consolidation")
	@Administer.Retrieve
	public BianResponse<BQConsolidationRetrieveOutputModel> retrieveConsolidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveConsolidation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("remediation")
	@Administer.Retrieve
	public BianResponse<BQRemediationRetrieveOutputModel> retrieveRemediation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRemediation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Administer.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Administer.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Administer.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Administer.RetrieveSD
	public BianResponse<SDComplianceReportingRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Administer.Update
	public BianResponse<CRComplianceReportingAdministrativePlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRComplianceReportingAdministrativePlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("complianceassessment")
	@Administer.Update
	public BianResponse<BQComplianceAssessmentUpdateOutputModel> updateComplianceassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQComplianceAssessmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateComplianceassessment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("consolidation")
	@Administer.Update
	public BianResponse<BQConsolidationUpdateOutputModel> updateConsolidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQConsolidationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateConsolidation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("remediation")
	@Administer.Update
	public BianResponse<BQRemediationUpdateOutputModel> updateRemediation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRemediationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateRemediation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
