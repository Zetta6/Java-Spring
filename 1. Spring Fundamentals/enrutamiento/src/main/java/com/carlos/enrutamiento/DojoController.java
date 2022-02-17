package com.carlos.enrutamiento;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

    @RequestMapping("/dojo/{dojo}")
    public String dojo(@PathVariable("dojo") String dojo) {
    	return "¡El Dojo " + dojo + " es increible!";
    }
    
    @RequestMapping("/burbank-dojo/{burbank}")
    public String burbank(@PathVariable("burbank") String burbank) {
    	return "El Dojo Burbank " + burbank + " está localizado al sur de California";
    }
    
    @RequestMapping("/san-jose/{sanjose}")
    public String sanjose(@PathVariable("sanjose") String sanjose) {
    	return "El Dojo SJ " + sanjose + " es el cuartel general";
    }

}