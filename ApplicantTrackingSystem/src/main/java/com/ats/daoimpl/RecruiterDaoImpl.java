package com.ats.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ats.dao.RecruiterDao;
import com.ats.model.Recruiter;

@Repository
@Transactional

public class RecruiterDaoImpl  extends BaseDaoImpl implements RecruiterDao {
	
	
	@Override
	public Integer save(Recruiter recruiter) throws Throwable {
		return (Integer) getSession().save(recruiter);
	}
	
	
	@Override
	public Recruiter getById(Integer id) throws Throwable {
		try {
			Criteria criteria = getSession().createCriteria(Recruiter.class).add(Restrictions.eq("id", id));
			if (criteria.list().isEmpty()) {
				return null;
			}
			return (Recruiter) criteria.list().get(0);
		} catch (Throwable ex) {
			throw new Throwable(ex);
		}

	}


	@Override
	public Recruiter getByFirstName(String firstName) throws Throwable {

		try {
			Criteria criteria = getSession().createCriteria(Recruiter.class)
					.add(Restrictions.eq("firstName", firstName));
			if (criteria.list().isEmpty()) {
				return null;
			}
			return (Recruiter) criteria.list().get(0);
		} catch (Throwable ex) {
			throw new Throwable(ex);
		}

	}

	@Override
	public Recruiter getByLastName(String lastName) throws Throwable {
		try {
			Criteria criteria = getSession().createCriteria(Recruiter.class).add(Restrictions.eq("lastName", lastName));
			if (criteria.list().isEmpty()) {
				return null;
			}
			return (Recruiter) criteria.list().get(0);
		} catch (Throwable ex) {
			throw new Throwable(ex);
		}

	}

	@Override
	public Recruiter getByEmailAddress(String emailAddress) throws Throwable {
		try {
			Criteria criteria = getSession().createCriteria(Recruiter.class)
					.add(Restrictions.eq("emailAddress", emailAddress));
			if (criteria.list().isEmpty()) {
				return null;
			}
			return (Recruiter) criteria.list().get(0);
		} catch (Throwable ex) {
			throw new Throwable(ex);
		}

	}

	@Override
	public Recruiter getByPhoneNumber(Integer phoneNumber) throws Throwable {
		try {
			Criteria criteria = getSession().createCriteria(Recruiter.class)
					.add(Restrictions.eq("phoneNumber", phoneNumber));
			if (criteria.list().isEmpty()) {
				return null;
			}
			return (Recruiter) criteria.list().get(0);
		} catch (Throwable ex) {
			throw new Throwable(ex);
		}

	}

	@Override
	public Recruiter getByLocation(String location) throws Throwable {
		try {
			Criteria criteria = getSession().createCriteria(Recruiter.class).add(Restrictions.eq("location", location));
			if (criteria.list().isEmpty()) {
				return null;
			}
			return (Recruiter) criteria.list().get(0);
		} catch (Throwable ex) {
			throw new Throwable(ex);
		}

	}

	@Override
	public Recruiter getByDateOfBirth(String dateOfBirth) throws Throwable {
		try {
			Criteria criteria = getSession().createCriteria(Recruiter.class)
					.add(Restrictions.eq("dateOfBirth", dateOfBirth));
			if (criteria.list().isEmpty()) {
				return null;
			}
			return (Recruiter) criteria.list().get(0);
		} catch (Throwable ex) {
			throw new Throwable(ex);
		}
	}

	@Override
	public Recruiter getByTeamId(Integer teamId) throws Throwable {
		try {
			Criteria criteria = getSession().createCriteria(Recruiter.class).add(Restrictions.eq("teamId", teamId));
			if (criteria.list().isEmpty()) {
				return null;
			}
			return (Recruiter) criteria.list().get(0);
		} catch (Throwable ex) {
			throw new Throwable(ex);
		}

	}

	@Override
	public void delete(Recruiter recruiter) throws Throwable {
		getSession().delete(recruiter);
	}

	@Override
	public void update(Recruiter recruiter) throws Throwable {
		getSession().update(recruiter);

	}

	@Override
	public List<Recruiter> getAll() throws Throwable {
		try {
			Criteria criteria = getSession().createCriteria(Recruiter.class);
			List<Recruiter> list = criteria.list();
			if (criteria.list().isEmpty()) {
				return null;
			}

			return list;

		} catch (Throwable ex) {
			throw new Throwable(ex);
		}
	}
}
