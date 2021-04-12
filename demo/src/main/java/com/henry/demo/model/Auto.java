package com.henry.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
public class Auto extends Vehiculo {

    private Integer puertas;

    @Override
    public TypeVehiculo typeVehiculo() {
        return TypeVehiculo.AUTO;
    }
}
