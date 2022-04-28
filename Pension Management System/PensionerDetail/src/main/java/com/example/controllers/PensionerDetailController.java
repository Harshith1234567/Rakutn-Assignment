package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.PensionerDetail;
import com.example.services.PensionerDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/PensionerDetailByAadhaar")
public class PensionerDetailController {
	
	@Autowired
	PensionerDetailService service;
	
	@GetMapping("/{aadhar_number}")
	PensionerDetail getPensionerDetail(@PathVariable String aadhar_number) {
		return service.fetchPensionerDetailFromAadhar(aadhar_number);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void savePensionerDetail(@RequestBody PensionerDetail pensioner_detail) {
		service.addPensionerDetail(pensioner_detail);
	}
}
