package com.proyecto.proyecto_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.proyecto_web.model.tramite;
import com.proyecto.proyecto_web.repository.tramiteRepository;

@RestController
@RequestMapping(path = "/tramite")
public class tramiteController {
 
    @Autowired
    private tramiteRepository tramiteRepo;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<tramite> listarTramite(){
        return tramiteRepo.findAllTramites();
    }

}
