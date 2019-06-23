package com.group.courtofowls.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group.courtofowls.FamilyTreeRepository;
import com.group.courtofowls.models.personalInfo;

@Controller
@RequestMapping({"/","/home"})
public class personalInfoController {
	
	@Autowired
	FamilyTreeRepository individualRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/") //took out the / to check. may have to go back and add it back to code
	public String index() {
		
		return "index";
	}
	 
	@GetMapping("/result")// same here
	public Optional<personalInfo> getFamily(String lastname){
		
				return individualRepository.findById("lastname");
	}
	
	@PostMapping()
	public ResponseEntity<personalInfo> addEntity(@RequestBody personalInfo info){
		if(info.validModel()) {
			individualRepository.save(info);
			return ResponseEntity.ok(info);	
		}
		return ResponseEntity.badRequest().build();		
	}
}
