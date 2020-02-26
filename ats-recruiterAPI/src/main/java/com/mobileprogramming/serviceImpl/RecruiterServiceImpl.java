package com.mobileprogramming.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mobileprogramming.model.Recruiter;
import com.mobileprogramming.repository.RecruiterRepository;
import com.mobileprogramming.service.RecruiterService;

@Service
public class RecruiterServiceImpl implements RecruiterService{

	@Autowired
	private RecruiterRepository recruiterRepo;
	
	@Override
	public List<Recruiter> getAllRecruiters() {
		
		return recruiterRepo.findAll();
	}

	@Override
	public Optional<Recruiter> getRecruiter(Integer id) {
		
		return recruiterRepo.findById(id);
	}

	@Override
	public String saveRecruiter(Recruiter recruiter) {
		
		recruiterRepo.save(recruiter);
		return "record added";
	}

	@Override
	public void updateRecruiter(Integer id, Recruiter recruiter) {
		recruiterRepo.save(recruiter);
		
	}

	@Override
	public void deleteRecruiter(Integer id) {
		recruiterRepo.deleteById(id);
		
	}

	@Override
	public Page<Recruiter> findAllByPage(Pageable pageable) {
		
		return recruiterRepo.findAll(pageable);
	}

}
