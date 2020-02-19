package com.ats.demo.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ats.demo.system.service.RecruiterService;
import com.ats.demo.sytem.model.Recruiter;

@RestController
public class RecruiterController {
	
	@Autowired
	private RecruiterService service;
	
	@PostMapping("/addRecruiter")
	public Recruiter addRecruiter(@RequestBody Recruiter recruiter){
		return service.saveRecruiter(recruiter);
	}
	
	@PostMapping("/addRecruiters")
	public List<Recruiter> addRecruiters(@RequestBody List<Recruiter> recruiters){
		return service.saveRecruiters(recruiters);
	}
	
	@GetMapping("/recruiters")
	public List<Recruiter>findAllRecruiters(){
		return service.getRecruiters();
	}
	
	@GetMapping("/recruiter/{id}")
	public Recruiter findRecruiterById(@PathVariable int id){
		return service.getRecruiterById(id);
	}
	
	@GetMapping("/recruiter/{firstname}")
	public Recruiter findRecruiterByFirstName(@PathVariable String firstName){
		return service.getRecruiterByFirstName(firstName);
		
	}
	
	@PutMapping("/update")
	public Recruiter updateRecruiter(@RequestBody Recruiter recruiter){
		return service.updateRecruiter(recruiter);
	}
	
	@DeleteMapping("/delete{id}")
	public String deleteRecruiter(@PathVariable int id) {
	return service.deleteRecruiter(id);
	}
	
		
	}



