package com.unab.edu.DAO;

import org.springframework.data.repository.CrudRepository;

import com.unab.edu.Entidad.Persona;

public interface PersonaDAO extends CrudRepository<Persona, Long>{

}
