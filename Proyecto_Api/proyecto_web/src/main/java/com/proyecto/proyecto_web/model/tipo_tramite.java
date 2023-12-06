package com.proyecto.proyecto_web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_tramite")
public class tipo_tramite {
    
    @Id
    private String Nom_TT;

    private String Descripcion;

    public String getNom_TT() {
        return Nom_TT;
    }

    public void setNom_TT(String nom_TT) {
        Nom_TT = nom_TT;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

}
