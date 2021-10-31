
package com.prueba.crud.rest;

import com.prueba.crud.model.estadoModel;
import com.prueba.crud.service.EstadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estado/")
public class EstadoRest {
    @Autowired
    private EstadoService estadoService;
    
    @GetMapping("{id}")
    private ResponseEntity<List<estadoModel>> getAllEstadosByPais(@PathVariable("id") Long idPais){
        return ResponseEntity.ok(estadoService.findAllByCountry(idPais));
    }
}
