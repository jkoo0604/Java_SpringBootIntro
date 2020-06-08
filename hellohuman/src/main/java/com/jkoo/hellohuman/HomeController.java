package com.jkoo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String index(@RequestParam(value="first_name", required=false) String first_name, @RequestParam(value="last_name", required=false) String last_name) {
		System.out.println(first_name);
		if (first_name != null) {
			if (last_name == null) {
				return "<h1>Hello " + first_name + "!</h1><h3>Welcome to SpringBoot!</h3>";
			} else {
				return "<h1>Hello " + first_name + " " + last_name + "!</h1><h3>Welcome to SpringBoot!</h3>";
				
			}
		}
		
		return "<h1>Hello Human!</h1><h3>Welcome to SpringBoot!</h3>";
	}

}
