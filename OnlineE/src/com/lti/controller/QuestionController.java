package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Questions;
import com.lti.services.AdminService;

@Controller
public class QuestionController {
	
	@Autowired
	AdminService service;
	
	public ModelAndView addQuestion(@RequestParam int question_id ,@RequestParam String question_desc,@RequestParam int technology_id,@RequestParam int level_id )
	{
		Questions q = new Questions();
		q.setLevel_id(1);
		q.setQuestion_desc("Kuch to bhi h question java wala");
		q.setQuestion_id(1);
		q.setTechnology_id(1);
		
		Questions q2 = service.addQuestion(q);
		ModelAndView model=null;
		if(q2==null)
		{
			model = new ModelAndView("addFailed");
		}else 
		{
			model = new ModelAndView("addSuccess");
			model.addObject("questions", q2);
		}
		
		return model;
	}
	
	

}
