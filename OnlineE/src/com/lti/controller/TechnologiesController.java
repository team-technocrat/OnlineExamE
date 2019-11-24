package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Technologies;
import com.lti.services.TechnologiesService;


@Controller
public class TechnologiesController
{
	@Autowired
	TechnologiesService service;
	@RequestMapping(value="/techAdd",method=RequestMethod.POST)
	public ModelAndView addTech(@RequestParam String technology_name)
	{
		Technologies incomingTechnologies = new Technologies();
		//incomingUser.setUser_id(id);
		incomingTechnologies.setTechnology_name(technology_name);
		
		
		ModelAndView model = null;
		Technologies t = service.addTechnologies(incomingTechnologies);
		if(t==null)
		{
			model = new  ModelAndView("addfailed");
		}
		else
		{
			model = new  ModelAndView("addsuccess");
			model.addObject("technologies",t);
		}
		
		return model;
	}
}
