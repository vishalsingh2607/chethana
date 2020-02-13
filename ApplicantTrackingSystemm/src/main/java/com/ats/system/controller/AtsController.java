package com.ats.system.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ats.system.model.Recruiter;
import com.ats.system.service.Service;
import com.ats.system.service.ServiceImpl;

@RequestMapping("/")
@RestController

public class AtsController {


 ServiceImpl service=new ServiceImpl();
	
	@PostMapping("/saveRecruiter")
	public Recruiter save(@RequestBody Recruiter recruiter)
	{ 
		
	 Recruiter  recruiter2= service.save(recruiter);
   	 System.out.println("success");
     return recruiter2;
	}
	@GetMapping("/findAll")
	public  Iterable<Recruiter> findAll() 
	{
		Iterable<Recruiter> recruiterList =service.findAll();
		
		return recruiterList;
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable( "id")Integer id ) 
	{
		service.delete(id);
	}
	@PutMapping("/update/{id}")
	public Optional<Recruiter> update(@PathVariable( "id")Integer id) 
	{
		
		Optional<Recruiter> recruiter=service.update(id);
	
		return recruiter;
		 
		
	}
	

}

