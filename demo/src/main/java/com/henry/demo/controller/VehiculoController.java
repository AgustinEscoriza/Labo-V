package com.henry.demo.controller;

import com.henry.demo.model.Vehiculo;
import com.henry.demo.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @PostMapping
    public void addVehiculo(@RequestBody Vehiculo vehiculo) {
        vehiculoService.addVehiculo(vehiculo);
    }
}
