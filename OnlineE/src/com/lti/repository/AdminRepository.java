package com.lti.repository;

import com.lti.model.Admin;
import com.lti.model.Exam;
import com.lti.model.Questions;


public interface AdminRepository {
	
	public Questions addQuestion(Questions q);
	public void updateQuestion(int question_id);
	public void removeQuestion(int question_id);
//	public findAllCandidates(int _id);
	public Exam addExam(Exam exam);
	public Admin findUserByEmail(String email);
	

}
