package com.jkoo.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/result")
	public String code(HttpSession session) {
		if (session.getAttribute("name") == null) {
			return "redirect:/";
		} else {
			String lang = (String) session.getAttribute("language");
			if (lang.equals("Java")) {
				return "javaresult.jsp";
			} else {
				return "result.jsp";
			}
		}
	}
	
	@RequestMapping(value="/postsurvey", method=RequestMethod.POST)
	public String login(@RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="language") String language, @RequestParam(value="comments") String comments, HttpSession session, RedirectAttributes errors) {
		if (language.equals("na") | location.equals("na")) {
			errors.addFlashAttribute("error", "Select from the dropdown");
			return "redirect:/";
			
		} else {
			session.setAttribute("name", name);
			session.setAttribute("location", location);
			session.setAttribute("language", language);
			session.setAttribute("comments", comments);
			return "redirect:/result";
		}
	}

}
