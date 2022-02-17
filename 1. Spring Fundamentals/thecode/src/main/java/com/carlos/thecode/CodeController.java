package com.carlos.thecode;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller
public class CodeController {
	
	@RequestMapping("/")
	public String index() {
		
		return "index.jsp";
	}
	
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String login(@RequestParam(value="code") String code, HttpSession session, Model model) {
		
		session.setAttribute("code", "bushido");
		String codigo = (String) session.getAttribute("code");
		if(code.equals(codigo)) {
			return "code.jsp";
		} else {
			model.addAttribute("error", "You must train harder!");
			return "index.jsp";
			
		}
	}
}
