/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ComplianceReportingApiServiceImpl implements ComplianceReportingApiService {

	public SDComplianceReportingActivateOutputModel activate(SDComplianceReportingActivateInputModel request){
		return JsonReader.read("activate-SDComplianceReportingActivateOutputModel.json",new TypeReference<SDComplianceReportingActivateOutputModel>(){});
	}
	
	public BQComplianceAssessmentCaptureOutputModel captureComplianceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQComplianceAssessmentCaptureInputModel request){
		return JsonReader.read("capture-BQComplianceAssessmentCaptureOutputModel.json",new TypeReference<BQComplianceAssessmentCaptureOutputModel>(){});
	}
	
	public BQConsolidationCaptureOutputModel captureConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConsolidationCaptureInputModel request){
		return JsonReader.read("capture-BQConsolidationCaptureOutputModel.json",new TypeReference<BQConsolidationCaptureOutputModel>(){});
	}
	
	public BQRemediationCaptureOutputModel captureRemediation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRemediationCaptureInputModel request){
		return JsonReader.read("capture-BQRemediationCaptureOutputModel.json",new TypeReference<BQRemediationCaptureOutputModel>(){});
	}
	
	public CRComplianceReportingAdministrativePlanCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRComplianceReportingAdministrativePlanCaptureInputModel request){
		return JsonReader.read("capture-CRComplianceReportingAdministrativePlanCaptureOutputModel.json",new TypeReference<CRComplianceReportingAdministrativePlanCaptureOutputModel>(){});
	}
	
	public SDComplianceReportingConfigureOutputModel configure(String sdReferenceId, SDComplianceReportingConfigureInputModel request){
		return JsonReader.read("configure-SDComplianceReportingConfigureOutputModel.json",new TypeReference<SDComplianceReportingConfigureOutputModel>(){});
	}
	
	public SDComplianceReportingFeedbackOutputModel feedback(String sdReferenceId, SDComplianceReportingFeedbackInputModel request){
		return JsonReader.read("feedback-SDComplianceReportingFeedbackOutputModel.json",new TypeReference<SDComplianceReportingFeedbackOutputModel>(){});
	}
	
	public CRComplianceReportingAdministrativePlanInitiateOutputModel initiate(String sdReferenceId, CRComplianceReportingAdministrativePlanInitiateInputModel request){
		return JsonReader.read("initiate-CRComplianceReportingAdministrativePlanInitiateOutputModel.json",new TypeReference<CRComplianceReportingAdministrativePlanInitiateOutputModel>(){});
	}
	
	public BQRemediationInitiateOutputModel initiateRemediation(String sdReferenceId, String crReferenceId, BQRemediationInitiateInputModel request){
		return JsonReader.read("initiate-BQRemediationInitiateOutputModel.json",new TypeReference<BQRemediationInitiateOutputModel>(){});
	}
	
	public BQComplianceAssessmentRequestOutputModel requestComplianceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQComplianceAssessmentRequestInputModel request){
		return JsonReader.read("request-BQComplianceAssessmentRequestOutputModel.json",new TypeReference<BQComplianceAssessmentRequestOutputModel>(){});
	}
	
	public BQConsolidationRequestOutputModel requestConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConsolidationRequestInputModel request){
		return JsonReader.read("request-BQConsolidationRequestOutputModel.json",new TypeReference<BQConsolidationRequestOutputModel>(){});
	}
	
	public BQRemediationRequestOutputModel requestRemediation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRemediationRequestInputModel request){
		return JsonReader.read("request-BQRemediationRequestOutputModel.json",new TypeReference<BQRemediationRequestOutputModel>(){});
	}
	
	public CRComplianceReportingAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRComplianceReportingAdministrativePlanRequestInputModel request){
		return JsonReader.read("request-CRComplianceReportingAdministrativePlanRequestOutputModel.json",new TypeReference<CRComplianceReportingAdministrativePlanRequestOutputModel>(){});
	}
	
	public CRComplianceReportingAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRComplianceReportingAdministrativePlanRetrieveOutputModel.json",new TypeReference<CRComplianceReportingAdministrativePlanRetrieveOutputModel>(){});
	}
	
	public BQComplianceAssessmentRetrieveOutputModel retrieveComplianceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQComplianceAssessmentRetrieveOutputModel.json",new TypeReference<BQComplianceAssessmentRetrieveOutputModel>(){});
	}
	
	public BQConsolidationRetrieveOutputModel retrieveConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQConsolidationRetrieveOutputModel.json",new TypeReference<BQConsolidationRetrieveOutputModel>(){});
	}
	
	public BQRemediationRetrieveOutputModel retrieveRemediation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRemediationRetrieveOutputModel.json",new TypeReference<BQRemediationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDComplianceReportingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDComplianceReportingRetrieveOutputModel.json",new TypeReference<SDComplianceReportingRetrieveOutputModel>(){});
	}
	
	public CRComplianceReportingAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRComplianceReportingAdministrativePlanUpdateInputModel request){
		return JsonReader.read("update-CRComplianceReportingAdministrativePlanUpdateOutputModel.json",new TypeReference<CRComplianceReportingAdministrativePlanUpdateOutputModel>(){});
	}
	
	public BQComplianceAssessmentUpdateOutputModel updateComplianceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQComplianceAssessmentUpdateInputModel request){
		return JsonReader.read("update-BQComplianceAssessmentUpdateOutputModel.json",new TypeReference<BQComplianceAssessmentUpdateOutputModel>(){});
	}
	
	public BQConsolidationUpdateOutputModel updateConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConsolidationUpdateInputModel request){
		return JsonReader.read("update-BQConsolidationUpdateOutputModel.json",new TypeReference<BQConsolidationUpdateOutputModel>(){});
	}
	
	public BQRemediationUpdateOutputModel updateRemediation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRemediationUpdateInputModel request){
		return JsonReader.read("update-BQRemediationUpdateOutputModel.json",new TypeReference<BQRemediationUpdateOutputModel>(){});
	}
	
}
