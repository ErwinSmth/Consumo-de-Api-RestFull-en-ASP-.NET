package com.proyecto.proyecto_web.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.proyecto_web.model.tramite;
import com.proyecto.proyecto_web.repository.tramiteRepository;

@RestController
@RequestMapping(path = "/api/tramite")
public class tramiteRest {
 
    @Autowired
    private tramiteRepository tramiteRepo;

    @GetMapping(path = "/listar")
    public @ResponseBody Iterable<tramite> listarTramite(){
        return tramiteRepo.findAllTramites();
    }

}
