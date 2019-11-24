package com.lti.services;

import com.lti.model.Admin;
import com.lti.model.Exam;
import com.lti.model.Questions;
import com.lti.model.User;

public interface AdminService {
	
	public Questions addQuestion(Questions q);
	public void updateQuestion(int question_id);
	public void removeQuestion(int question_id);
	public User findAllUsers(User u);
	public Admin login(Admin a);
	public Exam addExam(Exam exam);

}


