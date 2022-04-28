package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.example.entities.PensionDetail;
import com.example.entities.PensionerDetail;
import com.example.entities.ProcessPensionInput;

@Service
public class ProcessPensionService {
	
	static PensionDetail calculatedDetail = new PensionDetail();
	
	@Autowired
	RestTemplate restTemplate;
	
	public PensionDetail processPensionDetails(ProcessPensionInput processPensionInput) {
		
		String restTemplateUrl = "http://localhost:8081/PensionerDetailByAadhaar/" + processPensionInput.getAadhar_number();
		PensionerDetail fetchDetailFromSavedData = restTemplate.getForObject(restTemplateUrl, PensionerDetail.class);
		
		if(fetchDetailFromSavedData != null) {
			calculatePensionAmount(fetchDetailFromSavedData);
			calculateBankServiceCharge(fetchDetailFromSavedData);
			
			fetchDetailFromSavedData.setPension_detail(calculatedDetail);
			return calculatedDetail;
		}
		return null;
	}
	
	
	static void calculatePensionAmount(PensionerDetail fetchedDetail) {
		
		
		if(fetchedDetail.getPension_type().equals("SELF")) {
			Double result = (0.8 * fetchedDetail.getSalary_earned().doubleValue() ) + fetchedDetail.getAllowances().doubleValue();
			calculatedDetail.setPension_amount(result);
		}
		else {
			Double result = (0.5 * fetchedDetail.getSalary_earned().doubleValue() ) + fetchedDetail.getAllowances().doubleValue();
			calculatedDetail.setPension_amount(result);
		}
		
	}
	
	static void calculateBankServiceCharge(PensionerDetail fetchedDetail) {
		
		if(fetchedDetail.getBank_detail().getBank_type().equals("PUBLIC")) {
			calculatedDetail.setBank_service_charge(500);
		}
		else {
			calculatedDetail.setBank_service_charge(550);
		}
		
	}
}
