package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sspractice {

	@RequestMapping( "/sspractice")
	public String sspractice(){
	System.out.println("/sspracticespring/ssparctice");
	return "/WEB-INF/views/index.jsp";
	}
	
}
