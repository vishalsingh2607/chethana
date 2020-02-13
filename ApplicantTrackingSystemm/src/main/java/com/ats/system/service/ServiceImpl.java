package com.ats.system.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ats.system.dao.RecruiterRepository;
import com.ats.system.model.Recruiter;
@Primary
@Component
@Service
public class ServiceImpl  {

	@Autowired(required = true)
	RecruiterRepository rep;
	

	public Recruiter save(Recruiter recruiter) 
	{
		Recruiter recruiterde=rep.save(recruiter); 
     return recruiterde;
     }


	public Iterable<Recruiter> findAll() {
		Iterable<Recruiter> List=rep.findAll();
		return List;
	}

	public void delete(int id) {
		rep.deleteById(id);
		
	}


	public Optional<Recruiter> update(Integer id) {
		Optional<Recruiter> recruiter=rep.findById(id);
		
		return recruiter;
	}

}
