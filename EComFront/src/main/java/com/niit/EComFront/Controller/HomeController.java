package com.niit.EComFront.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String indexPage(Model m)
	{
		m.addAttribute("sliderpage", true);
		return "index";
	}

	@RequestMapping("/home")
	public String homePage(Model m)
	{
		m.addAttribute("sliderpage", true);
		return "index";
	}
	
	@RequestMapping("/aboutus")
	public String aboutpage(Model m)
	{
		m.addAttribute("aboutpage", true);
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(Model m)
	{
		m.addAttribute("loginpage", true);
		m.addAttribute("error", false);
		m.addAttribute("message","");
		return "index";
	}
	
	@RequestMapping("/flogin")
	public String flogin(Model m)
	{
		m.addAttribute("loginpage", true);
		m.addAttribute("error", true);
		m.addAttribute("message","user name, password incorrect");
		return "index";
	}
	
	
	@RequestMapping("/contact")
	public String contact(Model m)
	{
		m.addAttribute("contactpage", true);
		
		return "index";
		
	}
	
	
	
	
}
