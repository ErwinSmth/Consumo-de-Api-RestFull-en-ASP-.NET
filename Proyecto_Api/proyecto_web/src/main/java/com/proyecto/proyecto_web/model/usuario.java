package com.proyecto.proyecto_web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class usuario {
    
    @Id
    private String login;

    private String clave;

    private String estado;

    @OneToOne
    @JoinColumn(name = "idrol")
    private rol idrol;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public rol getIdrol() {
        return idrol;
    }

    public void setIdrol(rol idrol) {
        this.idrol = idrol;
    }

    

}
