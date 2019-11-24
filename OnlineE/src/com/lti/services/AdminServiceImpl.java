package com.lti.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Admin;
import com.lti.model.Exam;
import com.lti.model.Questions;
import com.lti.model.User;
import com.lti.repository.AdminRepositoryImpl;

@Service("adminServices")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepositoryImpl repository;

	@Override
	public Questions addQuestion(Questions q) {
		// TODO Auto-generated method stub
		return repository.addQuestion(q);
		
		
	}

	@Override
	public void updateQuestion(int question_id) {
		// TODO Auto-generated method stub
		repository.updateQuestion(question_id);
		
	}

	@Override
	public void removeQuestion(int question_id) {
		// TODO Auto-generated method stub
		repository.removeQuestion(question_id);
	}

	@Override
	public User findAllUsers(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin login(Admin a)
	{
			Admin userToBeReturned= null;
			Admin uDB=repository.findUserByEmail(a.getEmail());
			
			if(uDB==null)
			{
				
			}
			else if(uDB.getEmail().equals(a.getEmail())&&(uDB.getPassword().equals(a.getPassword())))
			{
				userToBeReturned=uDB;
			}
			else
			{
				
			}
			return userToBeReturned;
	}


	@Override
	@Transactional
	public Exam addExam(Exam exam) {
		// TODO Auto-generated method stub
		return exam;
	}

}
