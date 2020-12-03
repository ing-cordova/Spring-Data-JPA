package com.unab.clase.DAO;

import org.springframework.data.repository.CrudRepository;

import com.unab.clase.Entidades.Persona;

public interface PersonaDAO extends CrudRepository<Persona, Long>{

}
