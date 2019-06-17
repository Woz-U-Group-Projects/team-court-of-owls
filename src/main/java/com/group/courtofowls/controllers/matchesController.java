package com.group.courtofowls.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group.courtofowls.models.personalInfo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class matchesController {
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/matches")
	public personalInfo[] getValues(){
	  return new personalInfo[] {};
	}
}
