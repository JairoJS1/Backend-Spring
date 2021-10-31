package com.prueba.crud.rest;

import com.prueba.crud.model.paisModel;
import com.prueba.crud.service.PaisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pais/")
public class PaisRest {

    @Autowired
    private PaisService paisService;

    @GetMapping
    private ResponseEntity<List<paisModel>> getAllPaises() {
        return ResponseEntity.ok(paisService.findAll());
    }
}
