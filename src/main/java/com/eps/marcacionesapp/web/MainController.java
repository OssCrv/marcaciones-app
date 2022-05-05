package com.eps.marcacionesapp.web;

import com.eps.marcacionesapp.persistence.jpa.AfiliadoJpaRepository;
import com.eps.marcacionesapp.persistence.jpa.MarcacionJpaRepository;
import com.eps.marcacionesapp.persistence.Afiliado;
import com.eps.marcacionesapp.persistence.Marcacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {
    

    @Autowired
    private AfiliadoJpaRepository afiliadosRepo;
    

    @GetMapping("/afiliados")
    public List<Afiliado> getAfiliados(){return afiliadosRepo.findAll(); }

    @GetMapping("/afiliados/{id}")
    public List<Marcacion> getAfiliado(@PathVariable Integer id){
        Afiliado afiliado =  afiliadosRepo.findById(id)
        .orElse(new Afiliado());
    
        List<Marcacion> marcaciones = new ArrayList<>(afiliado.getMarcaciones());
        return  marcaciones;
    }

}
