package com.utn.spring.service;

import com.utn.spring.model.Pet;
import com.utn.spring.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private static PetRepository petRepository;

    @Autowired
    public PetService(PetRepository petRepository){
        this.petRepository = petRepository;
    }

    public void addPet(Pet newPet){
        petRepository.save(newPet);
    }

    public List<Pet> getAll(){
        return petRepository.findAll();
    }
}
