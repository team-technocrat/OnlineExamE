package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Admin;
import com.lti.services.AdminService;

@Controller
public class AdminController
{	
	@Autowired
	AdminService service;
	
	@RequestMapping(value="/addAdmin",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam String username,@RequestParam String password)
	{
		Admin incomingUser=new Admin();
	
		
		incomingUser.setEmail(username);
		incomingUser.setPassword(password);
		
		Admin a=service.login(incomingUser);
		ModelAndView model=null;
		
		if(a==null)
		{
			model= new ModelAndView("loginFailed");
		}
		else
		{
			model=new ModelAndView("loggedIn");
			model.addObject("admin",a);
			System.out.println("login successful");
		}
		return model;
		
	}
	
}
