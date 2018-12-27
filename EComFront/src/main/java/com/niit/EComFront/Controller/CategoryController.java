package com.niit.EComFront.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.EComBack.DAlayer.CategoryDAO;
import com.niit.EComBack.Model.Category;

@Controller
public class CategoryController {
	@Autowired
	CategoryDAO cd;

	@RequestMapping("/category")
	public String category(Model m) {
		m.addAttribute("editmode", false);
		m.addAttribute("category", new Category());
		m.addAttribute("catlist", cd.ViewAllCategory());
		m.addAttribute("categorypage", true);
		m.addAttribute("haserror", false);
		m.addAttribute("error", "");
		return "index";
	}

	@RequestMapping(value = "/categoryadd", method = RequestMethod.POST)
	public String AddCategory(@Valid @ModelAttribute("category") Category category, BindingResult result, Model m) {

		if (result.hasErrors()) {
			m.addAttribute("editmode", false);
			m.addAttribute("category", category);
			m.addAttribute("categorypage", true);
			m.addAttribute("catlist", cd.ViewAllCategory());
			m.addAttribute("catlist", cd.ViewAllCategory());

			return "index";
		} else {
			try {
				cd.CreateCategory(category);

				return "redirect:/category";
			} catch (Exception e) {
				m.addAttribute("editmode", false);
				m.addAttribute("category", category);
				m.addAttribute("categorypage", true);
				m.addAttribute("catlist", cd.ViewAllCategory());
				return "index";
			}
		}
	}


	@RequestMapping(value = "/updatecategory", method = RequestMethod.POST)
	public String updatecategory(@Valid @ModelAttribute("category") Category category, BindingResult result, Model m) {

		if (result.hasErrors()) {
			m.addAttribute("editmode", false);
			m.addAttribute("category", category);
			m.addAttribute("categorypage", true);
			m.addAttribute("catlist", cd.ViewAllCategory());
			m.addAttribute("catlist", cd.ViewAllCategory());

			return "index";
		} else {
			try {
				cd.UpdateCategory(category);

				return "redirect:/category";
			} catch (Exception e) {
				m.addAttribute("editmode", false);
				m.addAttribute("category", category);
				m.addAttribute("categorypage", true);
				m.addAttribute("catlist", cd.ViewAllCategory());
				return "index";
			}
		}
	}
	@RequestMapping("/deletecategory")
	public String deleteCategory(@RequestParam("catname") String catname, Model m) {
		cd.DeleteCategory(catname);
		return "redirect:/category";

	}

	@RequestMapping("/editcategory")
	public String editCategory(@RequestParam("catname") String catname, Model m) {
		m.addAttribute("editmode", true);
		m.addAttribute("category", cd.ViewOneCategory(catname));
		m.addAttribute("catlist", cd.ViewAllCategory());
		m.addAttribute("categorypage", true);
		m.addAttribute("haserror", false);
		m.addAttribute("error", "");
		return "index";

	}

}
