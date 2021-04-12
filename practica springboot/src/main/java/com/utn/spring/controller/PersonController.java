package com.utn.spring.controller;

import com.utn.spring.model.Person;
import com.utn.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{personId}")
    public Person getPersonById(@PathVariable Integer personId){
        return new Person();
    }

    @PostMapping("/")
    public void addPerson(@RequestBody Person newPerson){
        personService.addPerson(newPerson);
    }

    @GetMapping("/")
    public List<Person> getAll(@RequestParam(required = false) String name){
        return personService.getAll(name);
    }
}
