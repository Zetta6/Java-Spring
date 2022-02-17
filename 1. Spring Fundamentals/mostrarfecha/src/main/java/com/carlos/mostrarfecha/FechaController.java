package com.carlos.mostrarfecha;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FechaController {

    @RequestMapping("/")
    
    public String index() {
        return "index.jsp";
    }
    
    @RequestMapping("/date")
    
    public String fecha(Model date) {
    	
    	Date dt = Calendar.getInstance().getTime();  
    	DateFormat dateFormat = new SimpleDateFormat("E, dd MMM yyyy");  
    	String date1 = dateFormat.format(dt);  
    	date.addAttribute("date", date1);
    	
        return "date.jsp";    
        
    }
    @RequestMapping("/hour")
    public String hora(Model hour) {
    	
    	Date dt = Calendar.getInstance().getTime();  
    	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
    	String time = dateFormat.format(dt);  
    	hour.addAttribute("time", time);
    	
        return "time.jsp";
    }
}