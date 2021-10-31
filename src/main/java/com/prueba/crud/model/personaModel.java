package com.prueba.crud.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class personaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//Colocar id automatico
    private Long id;
//    @Column (name = "nombre completo")//Cambiar el nombre de una columna 
    private String nombre;
    private String apellido;
    private int edad;

    private String genero;
    private Date fechaNacimiento;
    private String DPI;
    private String correo;
    private String telefono;
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "id_pais")
    private paisModel pais;
    @ManyToOne
    @JoinColumn(name = "id_estado")
    private estadoModel estado;

    public personaModel() {
    }

    public personaModel(String nombre, String apellido, int edad, String genero, Date fechaNacimiento, String DPI, String correo, String telefono, String direccion, paisModel pais, estadoModel estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.DPI = DPI;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.pais = pais;
        this.estado = estado;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public paisModel getPais() {
        return pais;
    }

    public void setPais(paisModel pais) {
        this.pais = pais;
    }

    public estadoModel getEstado() {
        return estado;
    }

    public void setEstado(estadoModel estado) {
        this.estado = estado;
    }

}
