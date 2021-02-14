package com.person.info.controller;

import com.person.info.dto.PersonDTO;
import com.person.info.service.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("infoservice")
public class PersonInfoController {

    @Autowired
    private PersonInfoService personInfoService;

    @GetMapping("/people")
    public List retrievePeople() {
        return personInfoService.getPeople();
    }
    @PostMapping("/people/add")
    public void addPerson(@RequestBody PersonDTO person) {
         personInfoService.addPerson(person);
    }
}
