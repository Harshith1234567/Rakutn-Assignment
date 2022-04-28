package com.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.entities.PensionerDetail;

@Service
public class PensionerDetailService {
	
	List<PensionerDetail> pensioners = new ArrayList<>();
	public void addPensionerDetail(PensionerDetail pensioner_detail) {
		pensioners.add(pensioner_detail);
		
	}
	public PensionerDetail fetchPensionerDetailFromAadhar(String aadhar) {
		List<PensionerDetail> search_result = pensioners.stream().filter(saved_pensioner -> String.valueOf(saved_pensioner.getAadhar_number()).equals(aadhar)).collect(Collectors.toList());
		if(search_result.size() != 0) {
			return search_result.get(0);
		}
		return null;
	}
	
}
