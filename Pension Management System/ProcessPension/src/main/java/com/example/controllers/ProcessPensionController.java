package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.PensionDetail;
import com.example.entities.ProcessPensionInput;
import com.example.services.ProcessPensionService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/ProcessPension")
public class ProcessPensionController {
	
	@Autowired
	ProcessPensionService service;
	
	@GetMapping
	PensionDetail processPension(@RequestBody ProcessPensionInput processPensionInput) {
		System.out.println("Fetching Details of the Aadhar Number:: " + processPensionInput.getAadhar_number());
		return service.processPensionDetails(processPensionInput);
	}
}
