package com.example.comrosexp.planeta.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.comrosexp.planeta.domain.Planeta;
import com.example.comrosexp.planeta.domain.PlanetaRepository;
import java.util.List;


@RestController
@RequestMapping("/planeta")
public class PlanetaController {

    @Autowired
    private PlanetaRepository planetaRepository;

    @GetMapping
    public ResponseEntity<List<Planeta>> planetas() {
        List<Planeta> planetas = planetaRepository.findAll();
        return new ResponseEntity<>(planetas, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> planeta(@RequestBody Planeta planeta) {
        planetaRepository.save(planeta);
        return ResponseEntity.status(201).body("Created");
    }
}