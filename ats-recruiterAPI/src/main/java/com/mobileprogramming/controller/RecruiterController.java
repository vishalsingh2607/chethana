package com.mobileprogramming.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mobileprogramming.model.Recruiter;
import com.mobileprogramming.serviceImpl.RecruiterServiceImpl;




@RestController
public class RecruiterController {
	
	@Autowired
	private RecruiterServiceImpl service;
	
	@RequestMapping("/recruiters")
	public List<Recruiter> getAllRecruiters()
	{
		return service.getAllRecruiters();
	}
		
	@RequestMapping("/recruiters/{id}")
	public Optional<Recruiter> getRecruiter(Integer id)
	{
		return service.getRecruiter(id);
		
	}
	
	
	
	 @RequestMapping(method = RequestMethod.POST, value="/recruiters")
	public String addRecruiter(@RequestBody Recruiter recruiter)
	{
		 service.saveRecruiter(recruiter);
		return "Record Added Successfully";
	}
	
	
	
	  @RequestMapping(method = RequestMethod.PUT,value="/recruiters/{id}") public
	  void updateRecruiter(@RequestBody Recruiter recruiter, @PathVariable Integer
	  id) { service.saveRecruiter(recruiter); }
	 
	
	@RequestMapping(method = RequestMethod.DELETE,value="/recruiters/{id}")
	public void deleteRecruit(@PathVariable Integer id)
	{
		service.deleteRecruiter(id);
	}
	}



