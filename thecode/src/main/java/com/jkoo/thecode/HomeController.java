package com.jkoo.thecode;

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
	
	@RequestMapping("/code")
	public String code(HttpSession session, RedirectAttributes errors) {
		if ((String) session.getAttribute("bushi") == "correct") {
			return "code.jsp";
		} else {
			errors.addFlashAttribute("error", "You have not entered the code");
			return "redirect:/";
		}
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam(value="code") String code, HttpSession session, RedirectAttributes errors) {
		if (code.equals("bushido")) {
			session.setAttribute("bushi", "correct");
			return "redirect:/code";
		} else {
			errors.addFlashAttribute("error", "You must train harder");
			return "redirect:/";
		}
	}
	
	

}
