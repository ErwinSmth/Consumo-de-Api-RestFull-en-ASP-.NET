package com.proyecto.proyecto_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.proyecto_web.model.persona;
import com.proyecto.proyecto_web.repository.personaRepository;

@RestController
@RequestMapping(path = "/persona")
public class personaController {
    
    @Autowired
    private personaRepository persoRepo;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<persona> listarPersonas(){
        return persoRepo.findAllPersonas();
    }

}
