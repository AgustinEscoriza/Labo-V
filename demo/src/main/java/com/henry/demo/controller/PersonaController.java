package com.henry.demo.controller;

import com.henry.demo.model.Persona;
import com.henry.demo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping
    public List<Persona> getAll() {
        return personaService.getAll();
    }

    @GetMapping("/{id}")
    public Persona getPersonById(@PathVariable String id) {
        return personaService.getByID(id);
    }

    @PostMapping
    public void addPersona(@RequestBody Persona persona) {
        personaService.add(persona);
    }

    @PutMapping("/{id}/vehiculos/{idVehiculo}")
    public void addVehiculoToPerson(@PathVariable String id, @PathVariable Integer idVehiculo) {
        personaService.addVehiculoToPerson(id,idVehiculo);
    }

}
