package com.jkoo.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date ldt =new Date();
		SimpleDateFormat dtformat = new SimpleDateFormat("EEEE, MMM ww, yyyy");
		model.addAttribute("datevar", dtformat.format(ldt));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date ldt2 = new Date();
		SimpleDateFormat dtformat2 = new SimpleDateFormat("hh:mm a");
		model.addAttribute("timevar", dtformat2.format(ldt2));
		return "time.jsp";
	}

}
