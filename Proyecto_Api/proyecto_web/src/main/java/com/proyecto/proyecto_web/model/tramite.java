package com.proyecto.proyecto_web.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tramite")
public class tramite {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tramite;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private persona id_persona;

    @OneToOne
    @JoinColumn(name = "Nom_TT")
    private tipo_tramite Nom_TT;

    private Date fecha_inicio;

    private Date fecha_finalizo;

    private int estado_final;

    private Long cant_documentos;

    private Date fecha_limite;

    public Integer getId_tramite() {
        return id_tramite;
    }

    public void setId_tramite(Integer id_tramite) {
        this.id_tramite = id_tramite;
    }

    public persona getId_persona() {
        return id_persona;
    }

    public void setId_persona(persona id_persona) {
        this.id_persona = id_persona;
    }

    public tipo_tramite getNom_TT() {
        return Nom_TT;
    }

    public void setNom_TT(tipo_tramite nom_TT) {
        Nom_TT = nom_TT;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_finalizo() {
        return fecha_finalizo;
    }

    public void setFecha_finalizo(Date fecha_finalizo) {
        this.fecha_finalizo = fecha_finalizo;
    }

    public int getEstado_final() {
        return estado_final;
    }

    public void setEstado_final(int estado_final) {
        this.estado_final = estado_final;
    }

    public Long getCant_documentos() {
        return cant_documentos;
    }

    public void setCant_documentos(Long cant_documentos) {
        this.cant_documentos = cant_documentos;
    }

    public Date getFecha_limite() {
        return fecha_limite;
    }

    public void setFecha_limite(Date fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    

}
