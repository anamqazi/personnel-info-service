package com.person.info.controller;

import com.person.info.dto.PersonDTO;
import com.person.info.dto.ServiceResponse;
import com.person.info.service.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
Controller for CRUD operations
 */
@RestController
@RequestMapping("infoservice")
public class PersonInfoController {

    @Autowired
    private PersonInfoService personInfoService;

    @GetMapping("/people")
    public List retrievePeople() {
        return personInfoService.getPeople();
    }

    @PostMapping("/addPerson")
    public ResponseEntity<ServiceResponse> addPerson(@RequestBody PersonDTO person) {
         return new ResponseEntity<>(personInfoService.addPerson(person), HttpStatus.ACCEPTED);
    }

    @PostMapping("/updatePerson")
    public ResponseEntity<ServiceResponse> updatePerson(@RequestBody PersonDTO person) {

        return new ResponseEntity<>(personInfoService.updatePerson(person), HttpStatus.ACCEPTED);
    }

    @PostMapping("/deletePerson/{id}")
    public ResponseEntity<ServiceResponse> deletePerson(@PathVariable Long id) {

        return new ResponseEntity<>(personInfoService.deletePerson(id), HttpStatus.ACCEPTED);
    }
}
