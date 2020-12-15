package com.unab.clase.DAO;

import org.springframework.data.repository.CrudRepository;

import com.unab.clase.Entidades.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Long>{

}
