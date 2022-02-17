package com.carlos.enrutamiento;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("coding")

public class CodingController {

	
	@RequestMapping(value="", method=RequestMethod.GET)
    public String hello(){
		
      return "¡Hola Coding Dojo!";
      
    }

	
	@RequestMapping(value="/python", method=RequestMethod.GET)
    public String amazing(){
		
      return "¡Python/Django fue increíble!";
    
	}

	
	@RequestMapping(value="/java", method=RequestMethod.GET)
    public String java(){
		
      return "¡Java/Spring es mejor!";
      
    }

}