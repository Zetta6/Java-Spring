package com.carlos.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	
    @RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String name, @RequestParam(value="lastname",required=false) String lastname) {
    	
    	if(name == null) {
    		return "Hello Human! \n\n Welcome to SpringBoot";
    	} else if (lastname == null) {
            return "Hello " + name + "\n\n Welcome to SpringBoot";
    	} else {
            return "Hello " + name + " " + lastname + "\n\n Welcome to SpringBoot";
    	}
    }
    
}