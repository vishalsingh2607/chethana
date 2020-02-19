package com.ats.demo.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ats.demo.system.repository.RecruiterRepository;
import com.ats.demo.sytem.model.Recruiter;

@Service
//@Component    ------->   No need @service is a sub annotation of @component
public class RecruiterService {
	
	@Autowired
	private RecruiterRepository repository;
	
	public Recruiter saveRecruiter(Recruiter recruiter) {
		return repository.save(recruiter);
	}
	
	public List<Recruiter> saveRecruiters(List<Recruiter> recruiters) {
		return repository.saveAll(recruiters);
	}
	
	public List<Recruiter> getRecruiters(){
		return repository.findAll();
	}
	
	public Recruiter getRecruiterById(int id){
		return repository.findById(id).orElse(null);
	}
	
	public Recruiter getRecruiterByFirstName(String firstName){
		return repository.findByFirstName(firstName);
	}
	
	public String deleteRecruiter(int id){
		repository.deleteById(id);
		return "Recruiter Removed!! " +id;
	}
	
	public Recruiter updateRecruiter(Recruiter recruiter) {
		Recruiter existingRecruiter=repository.findById(recruiter.getId()).orElse(null);
		existingRecruiter.setFirstName(recruiter.getFirstName());
		existingRecruiter.setLastName(recruiter.getLastName());
		existingRecruiter.setEmailAddress(recruiter.getEmailAddress());
		existingRecruiter.setPhoneNumber(recruiter.getPhoneNumber());
		existingRecruiter.setLocation(recruiter.getLocation());
		existingRecruiter.setDateOfBirth(recruiter.getDateOfBirth());
		existingRecruiter.setTeamId(recruiter.getTeamId());
		return repository.save(existingRecruiter);
		
		
	}
	
	

}
