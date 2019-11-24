package com.lti.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Exam;
import com.lti.services.AdminService;

@Controller
public class ExamController {

	@Autowired
	AdminService service;
	
	public ModelAndView addExam(@RequestParam int technology_id , @RequestParam int level_id , @RequestParam LocalDate appearing_date,@RequestParam String status,@RequestParam String remarks,@RequestParam int noOfQuestions,@RequestParam int passingPercentage)
	{
		
		Exam exam = new Exam();
		exam.setExam_id(1);
		exam.setLevel_id(1);
		exam.setNo_of_questions(50);
		//exam.setAppearing_date();
		exam.setPassing_percentage(65);
		exam.setRemarks("KuchNai");
		exam.setStatus("OK");
		
		
		ModelAndView model = null;
		return model;
	}
}
