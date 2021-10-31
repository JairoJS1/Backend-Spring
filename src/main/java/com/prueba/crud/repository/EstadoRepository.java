package com.prueba.crud.repository;

import com.prueba.crud.model.estadoModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EstadoRepository extends JpaRepository<estadoModel, Long>{
    
}
