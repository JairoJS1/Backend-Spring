package com.prueba.crud.service;

import com.prueba.crud.model.estadoModel;
import com.prueba.crud.repository.EstadoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<estadoModel> findAll() {
        return estadoRepository.findAll();
    }

    public List<estadoModel> findAllByCountry(Long id) {
        List<estadoModel> estadosRespuesta = new ArrayList<>();
        List<estadoModel> estados = estadoRepository.findAll();
        for (int i = 0; i < estados.size(); i++) {
            if (estados.get(i).getPais().getId() == id) {
                estadosRespuesta.add(estados.get(i));
            }
        }
        return estadosRespuesta;
    }

    public List<estadoModel> findAll(Sort sort) {
        return estadoRepository.findAll(sort);
    }

    public void delete(estadoModel entity) {
        estadoRepository.delete(entity);
    }

    public void deleteAll(Iterable<? extends estadoModel> entities) {
        estadoRepository.deleteAll(entities);
    }

    public void deleteAll() {
        estadoRepository.deleteAll();
    }

}
