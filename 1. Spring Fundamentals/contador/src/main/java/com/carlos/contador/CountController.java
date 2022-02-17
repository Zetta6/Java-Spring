package com.carlos.contador;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CountController {
	
	int num = 0;

	@RequestMapping("/you_server")
    public String index(HttpSession session, Model model){
    	
    	num ++;
        session.setAttribute("count", num);

		return "index.jsp";

    }
    
    @RequestMapping("you_server/counter")
    public String count(HttpSession session, Model model){
    	
    	model.addAttribute("count", session.getAttribute("count"));
    	

		return "counter.jsp";

    }
    
}