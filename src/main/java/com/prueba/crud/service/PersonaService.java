package com.prueba.crud.service;

import com.prueba.crud.model.personaModel;
import com.prueba.crud.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import javafx.collections.transformation.FilteredList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public Optional<personaModel> findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<personaModel> findAll() {
        return personaRepository.findAll();
    }

    public <S extends personaModel> S save(S entity) {
        return personaRepository.save(entity);
    }

    public void deleteById(Long id) {
        personaRepository.deleteById(id);
    }

    public void delete(personaModel entity) {
        personaRepository.delete(entity);
    }

}
