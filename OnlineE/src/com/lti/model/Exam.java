package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Exam 
{
    @Id
	int exam_id;
	int level_id;
	LocalDate appearing_date;
	String status;
	String remarks;
	int no_of_questions;
	int passing_percentage;
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Exam(int exam_id, int level_id, LocalDate appearing_date, String status, String remarks, int no_of_questions,
			int passing_percentage) {
		super();
		this.exam_id = exam_id;
		this.level_id = level_id;
		this.appearing_date = appearing_date;
		this.status = status;
		this.remarks = remarks;
		this.no_of_questions = no_of_questions;
		this.passing_percentage = passing_percentage;
	}
	
	public int getExam_id() {
		return exam_id;
	}
	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}
	public int getLevel_id() {
		return level_id;
	}
	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}
	public LocalDate getAppearing_date() {
		return appearing_date;
	}
	public void setAppearing_date(LocalDate appearing_date) {
		this.appearing_date = appearing_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public int getNo_of_questions() {
		return no_of_questions;
	}
	public void setNo_of_questions(int no_of_questions) {
		this.no_of_questions = no_of_questions;
	}
	public int getPassing_percentage() {
		return passing_percentage;
	}
	public void setPassing_percentage(int passing_percentage) {
		this.passing_percentage = passing_percentage;
	}
	
	@Override
	public String toString() {
		return "Exam [exam_id=" + exam_id + ", level_id=" + level_id + ", appearing_date=" + appearing_date
				+ ", status=" + status + ", remarks=" + remarks + ", no_of_questions=" + no_of_questions
				+ ", passing_percentage=" + passing_percentage + "]";
	}
	
	

}
