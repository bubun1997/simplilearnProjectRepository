package com.soumya.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.soumya.microservices.entity.PersonEntity;
import com.soumya.microservices.response.PersonResponse;
import com.soumya.microservices.service.PersonService;

@RestController
@RequestMapping(path = "/webapione")
public class PersonController{

    @Autowired
    PersonService personService;
    
    @RequestMapping("/person/{personId}")
    public PersonResponse getPerson(@PathVariable int personId){
        return personService.getPerson(personId);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/person")   
    public void addPerson(@RequestBody PersonEntity pe ) {
        personService.addPerson(pe);
    }
}


