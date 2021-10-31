package com.prueba.crud.service;

import com.prueba.crud.model.paisModel;
import com.prueba.crud.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    public List<paisModel> findAll() {
        return paisRepository.findAll();
    }

}
