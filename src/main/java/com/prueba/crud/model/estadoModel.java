package com.prueba.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="estado")
public class estadoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//id automatico
    private Long id;
    private String nombre;
    
    @ManyToOne
    @JoinColumn (name="id_pais")
    private paisModel pais;

    public estadoModel() {
    }

    public estadoModel(String nombre, paisModel pais) {
       super();
        this.nombre = nombre;
        this.pais = pais;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public paisModel getPais() {
        return pais;
    }

    public void setPais(paisModel pais) {
        this.pais = pais;
    }

   
    
}
