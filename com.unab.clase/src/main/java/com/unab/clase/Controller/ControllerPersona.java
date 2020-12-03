package com.unab.clase.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.unab.clase.DAO.PersonaDAO;
import com.unab.clase.Entidades.Persona;

@Controller
public class ControllerPersona {

	@Autowired
	private PersonaDAO personadao;
	
	@GetMapping("/")
	public String inicio(Model m) {
		
		var personas = personadao.findAll();
		m.addAttribute("personas", personas);
		return "index";
	}
	
	@GetMapping("/agregar")
	public String add(Persona persona) {
		
		return "agregar";
	}
	
	@PostMapping("/guardar")
	public String guardar(Persona persona) {
		
		personadao.save(persona);
		return "redirect:/";
	}
	
	@GetMapping("/editar/{id_persona}")
	public String editar(Persona persona, Model m) {
		persona = personadao.findById(persona.getId_persona()).orElse(null);
		m.addAttribute("persona", persona);
		return "agregar";
	}
	
	@GetMapping("/eliminar/{id_persona}")
	public String eliminar(Persona persona) {
		
		personadao.delete(persona);
		return "redirect:/";
	}
}
