package com.ats.demo.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.ats.demo.sytem.model.Recruiter;

@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter,Integer> {
	
	Recruiter findByFirstName(String FirstName);
}
