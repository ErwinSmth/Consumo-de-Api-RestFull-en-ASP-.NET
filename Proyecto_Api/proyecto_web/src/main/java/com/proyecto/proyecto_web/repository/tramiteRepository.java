package com.proyecto.proyecto_web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.proyecto_web.model.tramite;

public interface tramiteRepository extends JpaRepository<tramite, Integer> {
    
    @Query("SELECT t FROM tramite t JOIN FETCH t.id_persona JOIN FETCH t.Nom_TT")
    List<tramite> findAllTramites();

}
