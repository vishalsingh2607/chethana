package com.ats.system.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ats.system.model.Recruiter;

@Repository
public interface RecruiterRepository extends CrudRepository<Recruiter, Integer> {
	

}
