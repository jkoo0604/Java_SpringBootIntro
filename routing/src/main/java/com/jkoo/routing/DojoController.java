package com.jkoo.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{urlstr}")
	public String pathvar(@PathVariable("urlstr") String urlstr) {
		
		if (urlstr.equals("dojo")) {
			return "The dojo is awesome";
		} else if (urlstr.equals("burbank-dojo")) {
			return "Burbank Dojo is located in SC";
		} else if (urlstr.equals("san-jose")) {
			return "SJ dojo is the SQ";
		}
		return "No param match for " + urlstr;
	}
}
