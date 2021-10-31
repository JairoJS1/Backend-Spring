package com.prueba.crud.repository;

import com.prueba.crud.model.paisModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaisRepository extends JpaRepository<paisModel, Long>{
    
}
