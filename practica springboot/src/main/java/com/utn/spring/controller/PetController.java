package com.utn.spring.controller;

import com.utn.spring.model.Pet;
import com.utn.spring.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {

    private static PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @PostMapping("/")
    public void addPet(@RequestBody Pet newPet){
        petService.addPet(newPet);
    }

    @GetMapping("/")
    public List<Pet> getAll(){
        return petService.getAll();
    }

}
