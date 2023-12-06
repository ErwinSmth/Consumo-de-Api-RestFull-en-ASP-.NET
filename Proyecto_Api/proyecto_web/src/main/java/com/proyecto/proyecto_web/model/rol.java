package com.proyecto.proyecto_web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol")
public class rol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idrol;

    private String nombre;

    public long getIdrol() {
        return idrol;
    }

    public void setIdrol(long idrol) {
        this.idrol = idrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

}
