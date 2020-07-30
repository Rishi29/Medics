package com.medics.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicsController {
	
	@GetMapping("/getpatient")
	public String getPatientRecordById() {
		return "Hello Patient";
	}

}
