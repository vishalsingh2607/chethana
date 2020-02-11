package com.ats.dao;

import java.util.List;

import com.ats.model.Recruiter;

public interface RecruiterDao {

	public Integer save(Recruiter recruiter) throws Throwable;

	public Recruiter getById(Integer id) throws Throwable;

	public Recruiter getByFirstName(String firstName) throws Throwable;

	public Recruiter getByLastName(String lastName) throws Throwable;

	public Recruiter getByEmailAddress(String emailAddress) throws Throwable;

	public Recruiter getByPhoneNumber(Integer phoneNumber) throws Throwable;

	public Recruiter getByLocation(String location) throws Throwable;

	public Recruiter getByDateOfBirth(String dateOfBirth) throws Throwable;

	public Recruiter getByTeamId(Integer teamId) throws Throwable;

	public void delete(Recruiter recruiter) throws Throwable;

	public void update(Recruiter recruiter) throws Throwable;

	public List<Recruiter> getAll() throws Throwable;

}
