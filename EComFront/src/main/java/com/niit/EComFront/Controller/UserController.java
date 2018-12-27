package com.niit.EComFront.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.niit.EComBack.DAlayer.UserDetailsDAO;
import com.niit.EComBack.Model.UserDetails;

@Controller
public class UserController {

	@Autowired
	UserDetailsDAO ud;

	@RequestMapping("/register")
	public String register(Model m) {
		m.addAttribute("registerpage", true);
		m.addAttribute("usermodel", new UserDetails());
		m.addAttribute("haserror", false);
		m.addAttribute("error", "please check your data");
		return "index";

	}

	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public String adduser(@Valid @ModelAttribute("usermodel") UserDetails UserDetails, BindingResult result,
			Model m) {

		if (result.hasErrors()) {

			m.addAttribute("usermodel", UserDetails);
			m.addAttribute("registerpage", true);
			m.addAttribute("haserror", true);
			m.addAttribute("error", "please check your data");

			return "index";
		} else {
			try {
				ud.addCustomer(UserDetails);
				

				return "redirect:/register";
			} catch (Exception e) {

				m.addAttribute("usermodel", UserDetails);
				m.addAttribute("registerpage", true);
				m.addAttribute("haserror", true);
				m.addAttribute("error", "Already in database");
				return "index";
			}
		}
	}

}
