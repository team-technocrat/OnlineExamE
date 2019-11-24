package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User_Exam_Question
{   
	@Id
	int user_exam_id;
	int question_id;
	String correct_answer;
	int score;
	String ans;
	
	public User_Exam_Question() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public User_Exam_Question(int user_exam_id, int question_id, String correct_answer, int score, String ans) {
		super();
		this.user_exam_id = user_exam_id;
		this.question_id = question_id;
		this.correct_answer = correct_answer;
		this.score = score;
		this.ans = ans;
	}

	public int getUser_exam_id() {
		return user_exam_id;
	}

	public void setUser_exam_id(int user_exam_id) {
		this.user_exam_id = user_exam_id;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getCorrect_answer() {
		return correct_answer;
	}

	public void setCorrect_answer(String correct_answer) {
		this.correct_answer = correct_answer;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "User_Exam_Question [user_exam_id=" + user_exam_id + ", question_id=" + question_id + ", correct_answer="
				+ correct_answer + ", score=" + score + ", ans=" + ans + "]";
	}
	
	
}
