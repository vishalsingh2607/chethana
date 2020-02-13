package com.ats.system.service;

import java.util.Optional;

import com.ats.system.model.Recruiter;
@org.springframework.stereotype.Service

public interface Service {
	
Recruiter save(Recruiter recruiter);
	

	Iterable<Recruiter> findAll();

	void delete(int id);


	Optional<Recruiter> update(Integer id);



}
