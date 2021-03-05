package com.comunidad.simpleperfilmaven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController (value="/")
public class TestController {
	
	@Autowired
	CommonProperties properties;
	
	@RequestMapping (value="/Test/{nombre}", method=RequestMethod.GET)
	public String consultaCanalValidacion(@PathVariable String nombre) throws Exception{
		return "hola " + nombre + " estas son las variables "+properties.getUrlWebService()+" - " + properties.getNombreCatalgo()+" - " + properties.getNombreBd();
	}
}
