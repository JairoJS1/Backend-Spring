package com.prueba.crud.repository;

import com.prueba.crud.model.personaModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaRepository extends JpaRepository<personaModel, Long>{
    
}
