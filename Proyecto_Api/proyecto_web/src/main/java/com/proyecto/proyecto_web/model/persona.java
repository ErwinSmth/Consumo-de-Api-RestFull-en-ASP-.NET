package com.proyecto.proyecto_web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;

    private String prim_nomb;
    private String seg_nomb;
    private String ape_pater;
    private String ape_mater;

    @OneToOne
    @JoinColumn(name = "nom_TD")
    private tipo_documento nom_TD;

    private String num_doc;
    private String correo;

    @OneToOne
    @JoinColumn(name = "login")
    private usuario login;

    public long getId_persona() {
        return id_persona;
    }

    public void setId_persona(long id_persona) {
        this.id_persona = id_persona;
    }

    public String getPrim_nomb() {
        return prim_nomb;
    }

    public void setPrim_nomb(String prim_nomb) {
        this.prim_nomb = prim_nomb;
    }

    public String getSeg_nomb() {
        return seg_nomb;
    }

    public void setSeg_nomb(String seg_nomb) {
        this.seg_nomb = seg_nomb;
    }

    public String getApe_pater() {
        return ape_pater;
    }

    public void setApe_pater(String ape_pater) {
        this.ape_pater = ape_pater;
    }

    public String getApe_mater() {
        return ape_mater;
    }

    public void setApe_mater(String ape_mater) {
        this.ape_mater = ape_mater;
    }

    public tipo_documento getNom_TD() {
        return nom_TD;
    }

    public void setNom_TD(tipo_documento nom_TD) {
        this.nom_TD = nom_TD;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public usuario getLogin() {
        return login;
    }

    public void setLogin(usuario login) {
        this.login = login;
    }

    

}
