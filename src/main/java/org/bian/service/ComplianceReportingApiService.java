/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ComplianceReportingApiService {

	SDComplianceReportingActivateOutputModel activate(SDComplianceReportingActivateInputModel request);
	
	BQComplianceAssessmentCaptureOutputModel captureComplianceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQComplianceAssessmentCaptureInputModel request);
	
	BQConsolidationCaptureOutputModel captureConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConsolidationCaptureInputModel request);
	
	BQRemediationCaptureOutputModel captureRemediation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRemediationCaptureInputModel request);
	
	CRComplianceReportingAdministrativePlanCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRComplianceReportingAdministrativePlanCaptureInputModel request);
	
	SDComplianceReportingConfigureOutputModel configure(String sdReferenceId, SDComplianceReportingConfigureInputModel request);
	
	SDComplianceReportingFeedbackOutputModel feedback(String sdReferenceId, SDComplianceReportingFeedbackInputModel request);
	
	CRComplianceReportingAdministrativePlanInitiateOutputModel initiate(String sdReferenceId, CRComplianceReportingAdministrativePlanInitiateInputModel request);
	
	BQRemediationInitiateOutputModel initiateRemediation(String sdReferenceId, String crReferenceId, BQRemediationInitiateInputModel request);
	
	BQComplianceAssessmentRequestOutputModel requestComplianceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQComplianceAssessmentRequestInputModel request);
	
	BQConsolidationRequestOutputModel requestConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConsolidationRequestInputModel request);
	
	BQRemediationRequestOutputModel requestRemediation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRemediationRequestInputModel request);
	
	CRComplianceReportingAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRComplianceReportingAdministrativePlanRequestInputModel request);
	
	CRComplianceReportingAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	BQComplianceAssessmentRetrieveOutputModel retrieveComplianceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQConsolidationRetrieveOutputModel retrieveConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRemediationRetrieveOutputModel retrieveRemediation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDComplianceReportingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRComplianceReportingAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRComplianceReportingAdministrativePlanUpdateInputModel request);
	
	BQComplianceAssessmentUpdateOutputModel updateComplianceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQComplianceAssessmentUpdateInputModel request);
	
	BQConsolidationUpdateOutputModel updateConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConsolidationUpdateInputModel request);
	
	BQRemediationUpdateOutputModel updateRemediation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRemediationUpdateInputModel request);
	
}
