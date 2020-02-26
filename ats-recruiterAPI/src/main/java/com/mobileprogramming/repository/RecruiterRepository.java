package com.mobileprogramming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileprogramming.model.Recruiter;

@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter,Integer> {


	
	
}
