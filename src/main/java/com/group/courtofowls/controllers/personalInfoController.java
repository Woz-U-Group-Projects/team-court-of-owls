package com.group.courtofowls.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group.courtofowls.FamilyTreeRepository;
import com.group.courtofowls.models.personalInfo;

@Controller
@RequestMapping({"/","/home"})
public class personalInfoController {
	
	@Autowired
	FamilyTreeRepository individualRepository;
	
	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	 
	/*
	@GetMapping("/info")
	public List<personalInfo> get(){
		return individualRepository.findAll();
	}*/
	
	/*@PostMapping()
	public ResponseEntity<personalInfo> addEntity(@RequestBody personalInfo info){
		if(info.validModel()) {
			individualRepository.save(info);
			return ResponseEntity.ok(info);	
		}
		return ResponseEntity.badRequest().build();		
	}*/
}
