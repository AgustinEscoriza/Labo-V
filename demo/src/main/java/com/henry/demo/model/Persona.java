package com.henry.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Persona {

    @Id
    private String dni;

    @NotNull(message = "El campo nombre es obligatorio.")
    private String nombre;

    @NotNull
    private String apellido;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "vehiculo_id")
    List<Vehiculo> vehiculoList;
}
