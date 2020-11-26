package com.unab.edu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.unab.edu.DAO.PersonaDAO;

public class ControllerPersona {

	@Autowired
	private PersonaDAO personadao;
	
	@GetMapping("/")
	public String Inicio() {
		
		var personas = personadao.findAll();
		
		for(var consulta : personas) {
			
			System.out.println(consulta.getNombre());
		}
		
		return "index";
	}
}
