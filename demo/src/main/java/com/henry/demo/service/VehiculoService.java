package com.henry.demo.service;

import com.henry.demo.model.Vehiculo;
import com.henry.demo.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class VehiculoService {

    @Autowired
    VehiculoRepository vehiculoRepository;

    public void addVehiculo(Vehiculo vehiculo) {
        vehiculoRepository.save(vehiculo);
    }

    public Vehiculo getVehiculoById(Integer id) {
        return vehiculoRepository.findById(id)
                .orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }
}
