package com.henry.demo.service;

import com.henry.demo.model.Persona;
import com.henry.demo.model.Vehiculo;
import com.henry.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class PersonaService {


    private PersonaRepository personaRepository;
    private VehiculoService vehiculoService;

    @Autowired
    public PersonaService(PersonaRepository personaRepository, VehiculoService vehiculoService) {
        this.personaRepository = personaRepository;
        this.vehiculoService = vehiculoService;
    }

    public List<Persona> getAll() {
        return personaRepository.findAll();
    }

    public void add(Persona persona) {
        personaRepository.save(persona);
    }

    public Persona getByID(String id) {
        return personaRepository.findById(id)
                .orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }

    public void addVehiculoToPerson(String id, Integer idVehiculo) {
        Persona persona = getByID(id);
        Vehiculo vehiculo = vehiculoService.getVehiculoById(idVehiculo);
        persona.getVehiculoList().add(vehiculo);
        personaRepository.save(persona);
    }
}
