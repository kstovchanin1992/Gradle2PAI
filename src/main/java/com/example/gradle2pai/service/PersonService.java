package com.example.gradle2pai.service;


import com.example.gradle2pai.dto.PersonDto;
import com.example.gradle2pai.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PersonService {
    void savePerson(PersonDto personDTO);

    List<Person> getPersons(int page, int size);

}

