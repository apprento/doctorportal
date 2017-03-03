package com.raja.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
	
	@RequestMapping(path= "/getDocList", consumes= MediaType.APPLICATION_JSON_VALUE, produces=  MediaType.APPLICATION_JSON_VALUE,method= RequestMethod.GET)
	public ResponseEntity<List<String>> getDocList() {
		List<String> list= new ArrayList<>();
		list.add("dfd");
		return new ResponseEntity<List<String>>(list, HttpStatus.OK);
	}

}
