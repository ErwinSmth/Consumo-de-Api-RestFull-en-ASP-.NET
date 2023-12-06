package com.proyecto.proyecto_web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_documento")
public class tipo_documento {
    
    @Id
    private String nom_TD;

    public String getNom_TD() {
        return nom_TD;
    }

    public void setNom_TD(String nom_TD) {
        this.nom_TD = nom_TD;
    }

}
