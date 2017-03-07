package com.raja.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.raja.events.DoctorEvent;
import com.raja.model.Doctor;
import com.raja.service.DoctorService;

@RestController
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@RequestMapping(path= "/getDocList", produces=  MediaType.APPLICATION_JSON_VALUE,method= RequestMethod.GET)
	public ResponseEntity<Doctor> getDocList(@RequestParam Map<String,String> requestParams) {
		
		DoctorEvent event= DoctorEvent.builder().build();
		event.setUserName(requestParams.get("userName"));
		event.setNumber(requestParams.get("number"));
		event.setMailId(requestParams.get("mailId"));
		Doctor doctor= doctorService.findDocByFilters(event);
		return new ResponseEntity<Doctor>(doctor, HttpStatus.OK);
	}

}
