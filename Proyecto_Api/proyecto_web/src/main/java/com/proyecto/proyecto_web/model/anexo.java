package com.proyecto.proyecto_web.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "anexo")
public class anexo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_documento;

    @ManyToOne
    @JoinColumn(name = "id_tramite")
    private tramite id_tramite;

    private String titulo_documento;

    private String Descripcion;

    private Date fecha_registro;

    private String ubicacion_archivo;

    public Integer getId_documento() {
        return id_documento;
    }

    public void setId_documento(Integer id_documento) {
        this.id_documento = id_documento;
    }

    public tramite getId_tramite() {
        return id_tramite;
    }

    public void setId_tramite(tramite id_tramite) {
        this.id_tramite = id_tramite;
    }

    public String getTitulo_documento() {
        return titulo_documento;
    }

    public void setTitulo_documento(String titulo_documento) {
        this.titulo_documento = titulo_documento;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getUbicacion_archivo() {
        return ubicacion_archivo;
    }

    public void setUbicacion_archivo(String ubicacion_archivo) {
        this.ubicacion_archivo = ubicacion_archivo;
    }

    

}
