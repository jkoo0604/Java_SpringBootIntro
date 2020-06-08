package com.jkoo.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		
		if (session.getAttribute("counter") == null) {			
			session.setAttribute("counter", 0);
		} else {
			int counter = (int) session.getAttribute("counter");
			counter++;
			session.setAttribute("counter",counter);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(Model model, HttpSession session) {
		int displaycounter;
		if (session.getAttribute("counter") == null) {			
			displaycounter = 0;
		} else {
			displaycounter = (int) session.getAttribute("counter");
		}
		model.addAttribute("counter", displaycounter);
		return "counter.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.removeAttribute("counter");
		return "redirect:/";
	}

}
