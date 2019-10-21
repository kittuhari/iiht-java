package com.springboot.studentdemo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Welcome {
	
	@RequestMapping(value="/home" )
	public String index()
	{
		return "index";
		
	}

}






