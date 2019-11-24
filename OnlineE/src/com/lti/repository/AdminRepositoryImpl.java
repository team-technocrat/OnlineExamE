package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Admin;
import com.lti.model.Exam;
import com.lti.model.Questions;
import com.lti.model.User;
import java.util.Date;



@Repository("adminRepository")
public class AdminRepositoryImpl implements AdminRepository {

@PersistenceContext
EntityManager em;

	@Override
	public Questions addQuestion(Questions q) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateQuestion(int question_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeQuestion(int question_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Exam addExam(Exam exam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findUserByEmail(String email) 
	{
		String q="select a from Admin a where a.email=?1";
		TypedQuery<Admin> query = em.createQuery(q, Admin.class);
		query.setParameter(1, email);
		Admin a=query.getSingleResult();

		return a;
	}

	}
	
	

	

