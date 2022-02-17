package com.carlos.encuestadojo;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller
public class EncuestaController {

	@RequestMapping ("/")
	public String index() {
		
		return "index.jsp";
	}

	@RequestMapping (value="/result", method=RequestMethod.POST)
	public String dojo(@RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="languaje") String languaje, @RequestParam(value="comment") String comment, Model result) {
		
		result.addAttribute("name", name);
		result.addAttribute("location", location);
		result.addAttribute("languaje", languaje);
		result.addAttribute("comment", comment);
		
		return "result.jsp";
	}
	
}
