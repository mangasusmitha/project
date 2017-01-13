package com.niit.ShoppingCart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home()
	{
		System.out.println("executing method homepage");
return "home";
	}
	
	@RequestMapping("/login")
	public ModelAndView showLoginPage()
	{
		System.out.println("this  login  method Starting");
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("msg","login page");
		mv.addObject("showLoginPage", "true");
		System.out.println(" this  login method  ending");
		return mv;
	}
	@RequestMapping("/registration")
	public ModelAndView showRegistrationPage()
	{
		 System.out.println("this is  registration method Staring");
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("msg","registration page");
		mv.addObject("showRegistrationPage", "true");
		 System.out.println("clsing  registeration  methods");
				 return mv;
				 
	}
		
}


	
