package com.basepackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
	
	@GetMapping("/")
	public String registration()
	{
		return "index";
	}
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	
	@RequestMapping("/home")
	public String next()
	{
		return "next";
	}
	
	@GetMapping("/romantic")
	public String Romantic()
	{
		return "Romantic";
	}

	@GetMapping("/party")
	public String Party()
	{
		return "Party";
	}
	
	@GetMapping("/sad")
	public String Sad()
	{
		return "Sad";
	}
	
	@GetMapping("/spiritual")
	public String Spiritual()
	{
		return "Spiritual";
	}
}
