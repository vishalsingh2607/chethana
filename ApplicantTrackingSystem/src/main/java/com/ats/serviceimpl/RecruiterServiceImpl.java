package com.ats.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.dao.RecruiterDao;
import com.ats.model.Recruiter;
import com.ats.modelmapper.RecruiterDetail;
import com.ats.service.RecruiterService;

@Service
@Transactional

public class RecruiterServiceImpl implements RecruiterService{
	
	@Autowired
	private RecruiterDao recruiterDao;
	
	@Override
	public Integer save(RecruiterDetail recruiterDetail) throws Throwable

	{
		Integer id = null;
		try {
			id = recruiterDao.save(parseRecruiterDetailToRecruiter(recruiterDetail));
		} catch (Throwable throwable) {
			throw new Throwable(throwable.getMessage());
		}
		return id;
	}
	
	private Recruiter parseRecruiterDetailToRecruiter(RecruiterDetail recruiterDetail) throws Throwable {
		Recruiter recruiter = new Recruiter();
		
		if (recruiterDetail.getId() != null) {
			 recruiter.setId( recruiterDetail.getId());
		}

		if (recruiterDetail.getFirstName() != null) {
			recruiter.setFirstName(recruiterDetail.getFirstName());
		}

		if (recruiterDetail.getLastName() != null) {
			recruiter.setLastName(recruiterDetail.getLastName());
		}

		if (recruiterDetail.getEmailAddress() != null) {
			recruiter.setEmailAddress(recruiterDetail.getEmailAddress());
		}
		if (recruiterDetail.getPhoneNumber() != null) {
			recruiter.setPhoneNumber(recruiterDetail.getPhoneNumber());
		}

		if (recruiterDetail.getLocation() != null) {
			recruiter.setLocation(recruiterDetail.getLocation());
		}
		if (recruiterDetail.getDateOfBirth() != null) {
			recruiter.setDateOfBirth(recruiterDetail.getDateOfBirth());
		}
		if (recruiterDetail.getTeamId() != null) {
			recruiter.setTeamId(recruiterDetail.getTeamId());
		}
		
		return recruiter;
	}
	
	
	
	private RecruiterDetail parseRecruiterToRecruiterDetail(Recruiter recruiter) throws Throwable {
		RecruiterDetail recruiterDetail = new RecruiterDetail();
		
		if (recruiter.getId() != null) {
			 recruiterDetail.setId( recruiter.getId());
		}

		if (recruiter.getFirstName() != null) {
			recruiterDetail.setFirstName(recruiter.getFirstName());
		}

		if (recruiter.getLastName() != null) {
			recruiterDetail.setLastName(recruiter.getLastName());
		}

		if (recruiter.getEmailAddress() != null) {
			recruiterDetail.setEmailAddress(recruiter.getEmailAddress());
		}
		if (recruiter.getPhoneNumber() != null) {
			recruiterDetail.setPhoneNumber(recruiter.getPhoneNumber());
		}

		if (recruiter.getLocation() != null) {
			recruiterDetail.setLocation(recruiter.getLocation());
		}
		if (recruiter.getDateOfBirth() != null) {
			recruiterDetail.setDateOfBirth(recruiter.getDateOfBirth());
		}
		if (recruiter.getTeamId() != null) {
			recruiterDetail.setTeamId(recruiter.getTeamId());
		}
		
		return recruiterDetail;
	}
	
	
	@Override
	public List<RecruiterDetail> getAllRecruiter() throws Throwable {

		List<Recruiter> recruiterList = recruiterDao.getAll();
		List<RecruiterDetail> recruiterDetailList = new ArrayList<RecruiterDetail>();

		for (Recruiter recruiter : recruiterList) {
			recruiterDetailList.add(parseRecruiterToRecruiterDetail(recruiter));
		}
		return recruiterDetailList;
	}

	@Override
	public void delete(Integer id) throws Throwable {
		Recruiter recruiter =(recruiterDao.getById(id));
		recruiterDao.delete(recruiter);
		
	}

	@Override
	public void update(Integer id,Integer phoneNumber) throws Throwable {
		Recruiter recruiter =(recruiterDao.getById(id));
		 recruiter.setPhoneNumber(phoneNumber);
		 recruiterDao.update(recruiter);

		
	}

	}
	
