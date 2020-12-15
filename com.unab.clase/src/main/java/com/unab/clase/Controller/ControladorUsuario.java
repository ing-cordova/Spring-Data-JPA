package com.unab.clase.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.unab.clase.DAO.UsuarioDAO;

@Controller
public class ControladorUsuario {

	@Autowired
	private UsuarioDAO usuariodao;
	
	@GetMapping("/verusuario")
	public String CargarUsuario(Model m) {
		
		var ListadoUsuarios = usuariodao.findAll();
		m.addAttribute("usuario", ListadoUsuarios);
		return "Usuario";
	}
}
