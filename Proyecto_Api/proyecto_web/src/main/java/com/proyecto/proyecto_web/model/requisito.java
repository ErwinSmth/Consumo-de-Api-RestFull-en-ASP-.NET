package com.proyecto.proyecto_web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "requisito")
public class requisito {
    
    @Id
    private String Nom_Req;

    @ManyToOne
    @JoinColumn(name = "Nom_TT")
    private tipo_tramite Nom_TT;
    
    private String Descripcion;

    private int activo;

    public String getNom_Req() {
        return Nom_Req;
    }

    public void setNom_Req(String nom_Req) {
        Nom_Req = nom_Req;
    }

    public tipo_tramite getNom_TT() {
        return Nom_TT;
    }

    public void setNom_TT(tipo_tramite nom_TT) {
        Nom_TT = nom_TT;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    

}
