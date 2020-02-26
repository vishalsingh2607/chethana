package com.mobileprogramming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mobileprogramming.model.Recruiter;

@Service
public interface RecruiterService {
	
	// Get All Recruiters
	public List<Recruiter> getAllRecruiters();

	// Get Recruiter By Id
	public Optional<Recruiter> getRecruiter(Integer id);

	// Create
	public String saveRecruiter(Recruiter recruiter);

	// Update
	public void updateRecruiter(Integer id, Recruiter recruiter);

	// Delete
	public void deleteRecruiter(Integer id);
	
   //Fetching Candidate Details Pagewise
	public Page<Recruiter> findAllByPage(Pageable pageable);

}
