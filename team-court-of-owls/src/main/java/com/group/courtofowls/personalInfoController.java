package com.group.courtofowls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personalInfo")
public class personalInfoController {
	
	@Autowired
	FamilyTreeRepository individualRepository;
	
	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	
	@GetMapping("/info")
	public List<personalInfo> getFamily(){
		return individualRepository.findById(lastname)();
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
