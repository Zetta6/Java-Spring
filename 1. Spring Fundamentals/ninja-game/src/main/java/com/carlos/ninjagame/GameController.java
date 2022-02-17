package com.carlos.ninjagame;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {
	
	private int gold = 0;
	ArrayList <String> historial = new ArrayList <String>();

	@RequestMapping("/Gold")
	public String index(Model model) {
		
		model.addAttribute("gold",gold);
		
		return "index.jsp";
	}
	
	@RequestMapping (value="/Gold", method=RequestMethod.POST)
	public String game(@RequestParam(value="min") int min, @RequestParam(value="name") String name, @RequestParam(value="max") int max, Model model) {
	
		int random = (int) Math.floor(Math.random()*(max-min+1)+min);
		gold = gold + random;
		model.addAttribute("gold", gold);
		
		Date dt = Calendar.getInstance().getTime();  
    	DateFormat dateFormat = new SimpleDateFormat("E, dd MMM yyyy");  
    	String date1 = dateFormat.format(dt);
		String frase = "You entered a " + name + " and earned " + random + " gold. (" + date1 + ")";
		historial.add(frase);
		model.addAttribute("historial", historial);

		return "index.jsp";
		
	}
	
	@RequestMapping (value="/Golds", method=RequestMethod.POST)
	public String casino(@RequestParam(value="casino-min") int min, @RequestParam(value="casino-name") String name, @RequestParam(value="casino-max") int max, Model model) {
	
		int random = (int) Math.floor(Math.random()*(max-min+1)+min);
		int signo = (int) Math.floor(Math.random()*(2-1+1)+1);
		if (signo == 1) {
			gold = gold + random;
			model.addAttribute("gold", gold);
			
			Date dt = Calendar.getInstance().getTime();  
			DateFormat dateFormat = new SimpleDateFormat("E, dd MMM yyyy");  
			String date1 = dateFormat.format(dt);
			String frase = "You entered a " + name + " and earned " + random + " gold. (" + date1 + ")";
			historial.add(frase);
			model.addAttribute("historial", historial);
		} else {
			gold = gold - random;
			model.addAttribute("gold", gold);
			
			Date dt = Calendar.getInstance().getTime();  
			DateFormat dateFormat = new SimpleDateFormat("E, dd MMM yyyy");  
			String date1 = dateFormat.format(dt);
			String frase = "You entered a " + name + " and lost " + random + " gold... Ouch. (" + date1 + ")";
			historial.add(frase);
			model.addAttribute("historial", historial);
		}
		
		return "index.jsp";
		
	}

}
