package com.ats.service;

import java.util.List;

import com.ats.modelmapper.RecruiterDetail;

public interface RecruiterService {
	
	public Integer save(RecruiterDetail recruiterdetail) throws Throwable;

   public void delete(Integer recruiterdetail) throws Throwable;

	public void update(Integer recruiterdetail,Integer phoneNumber) throws Throwable;

	public List<RecruiterDetail> getAllRecruiter() throws Throwable;

}
