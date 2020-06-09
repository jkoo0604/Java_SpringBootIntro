package com.jkoo.ninjagold.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index(Model model, HttpSession session) {
		int score =  0;
		String activitystr = "";
		if (session.getAttribute("score") != null) {
			score =  (int) session.getAttribute("score");
			activitystr = (String) session.getAttribute("activitystr");
			
		}		
		model.addAttribute("score", score);
		model.addAttribute("activitystr", activitystr);
		return "index.jsp";
	}
	
	@RequestMapping(value="/processgold", method=RequestMethod.POST)
	public String process(@RequestParam(value="location") String location, HttpSession session) {
		int tempscore = 0;
		
		if (location.equals("farm")) {
			tempscore = randInt(10, 20);			
		} else if (location.equals("cave")) {
			tempscore = randInt(5, 10);
		} else if (location.equals("house")) {
			tempscore = randInt(2, 5);
		} else if (location.equals("casino")) {
			tempscore = randInt(-50,50);
		} else {
			return "redirect:/";
		}
		
		String tempactivity = "";
		Date date = new Date();
		SimpleDateFormat dtformat = new SimpleDateFormat("MMM ww, yyyy hh:mm a");
		if (tempscore >= 0) {
			tempactivity = "<p class='green'>You entered a " + location + " and earned " + tempscore + " gold. (" + dtformat.format(date) + ")</p>";
		} else {
			int tempscoreabs = tempscore * -1;
			tempactivity = "<p class='red'>You entered a casino and lost " + tempscoreabs + " gold. (" + dtformat.format(date) + ")</p>";
		}		
		
		if (session.getAttribute("score") == null) {
			session.setAttribute("score", tempscore);
			session.setAttribute("activitystr", tempactivity);
		} else {
			int currentscore = (int) session.getAttribute("score");
			String currentactivity = (String) session.getAttribute("activitystr");
			currentscore += tempscore;
			currentactivity = tempactivity + currentactivity;
			session.setAttribute("score", currentscore);
			session.setAttribute("activitystr", currentactivity);
		}
					
		return "redirect:/";
	}
	

	
	public static int randInt(int min, int max) {
		Random random = new Random();
		return random.nextInt((max-min) + 1)+min;
	}
}
