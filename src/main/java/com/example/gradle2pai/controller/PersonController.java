package com.example.gradle2pai.controller;

import com.example.gradle2pai.dto.PersonDto;
import com.example.gradle2pai.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
    @Autowired
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping("/save")
    public ResponseEntity<String> savePerson(@RequestBody PersonDto personDto) {
        personService.savePerson(personDto);
        return ResponseEntity.ok("Person saved successfully");
    }

}
