package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User_Exam 
{
	@Id
	int user_exam_id;
	int user_id;
	int exam_id;
	LocalDate appeared_date;
	String status;
	String remark;
	
	public User_Exam() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public User_Exam(int user_exam_id, int user_id, int exam_id, LocalDate appeared_date, String status,
			String remark) 
	{
		super();
		this.user_exam_id = user_exam_id;
		this.user_id = user_id;
		this.exam_id = exam_id;
		this.appeared_date = appeared_date;
		this.status = status;
		this.remark = remark;
	}

	public int getUser_exam_id() {
		return user_exam_id;
	}

	public void setUser_exam_id(int user_exam_id) {
		this.user_exam_id = user_exam_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getExam_id() {
		return exam_id;
	}

	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}

	public LocalDate getAppeared_date() {
		return appeared_date;
	}

	public void setAppeared_date(LocalDate appeared_date) {
		this.appeared_date = appeared_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "User_Exam [user_exam_id=" + user_exam_id + ", user_id=" + user_id + ", exam_id=" + exam_id
				+ ", appeared_date=" + appeared_date + ", status=" + status + ", remark=" + remark + "]";
	}
	
	

}
