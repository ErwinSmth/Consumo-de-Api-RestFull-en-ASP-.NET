package com.proyecto.proyecto_web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.proyecto_web.model.persona;

public interface personaRepository extends JpaRepository <persona, Long> {
    
    @Query("SELECT p FROM persona p JOIN FETCH p.login JOIN FETCH p.nom_TD JOIN FETCH p.login.idrol")
    List<persona> findAllPersonas();

    List<persona> findAll();

}
