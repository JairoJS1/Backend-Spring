package com.prueba.crud.rest;

import com.prueba.crud.model.personaModel;
import com.prueba.crud.service.PersonaService;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JairoJS
 */
@RestController
@RequestMapping("/persona/")
public class PersonaRest {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    private ResponseEntity<List<personaModel>> getAllPersonas() {
        return ResponseEntity.ok(personaService.findAll());
    }

    @PostMapping
    private ResponseEntity<personaModel> savePersona(@RequestBody personaModel persona) {
        try {
            personaModel personaGuardada = personaService.save(persona);
            return ResponseEntity.created(new URI("/persona/" + personaGuardada.getId())).body(personaGuardada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping(value = "delete/{id}")
    private ResponseEntity<Boolean> deletePersona(@PathVariable("id") Long id) {
        personaService.deleteById(id);
        return ResponseEntity.ok(!(personaService.findById(id) != null));
    }
}
