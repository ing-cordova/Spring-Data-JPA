package com.unab.clase.Entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="usuario")
@Data
public class Usuario implements Serializable{

	
	public Long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Rol getId_rol() {
		return id_rol;
	}
	public void setId_rol(Rol id_rol) {
		this.id_rol = id_rol;
	}
	public Persona getId_persona() {
		return id_persona;
	}
	public void setId_persona(Persona id_persona) {
		this.id_persona = id_persona;
	}
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	private String username;
	private String password;
	@ManyToOne()
	@JoinColumn(name = "id_rol")
	private Rol id_rol;
	@ManyToOne()
	@JoinColumn(name = "id_persona")
	private Persona id_persona;
}
