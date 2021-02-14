package com.person.info.service.impl;

import com.person.info.dto.PersonDTO;
import com.person.info.entity.PersonEntity;
import com.person.info.repository.PersonRepository;
import com.person.info.service.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonInfoServiceImpl implements PersonInfoService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<PersonDTO> getPeople() {
        List<PersonDTO> resp = new ArrayList();
        List<PersonEntity> people = (List<PersonEntity>) personRepository.findAll();
        people.forEach(p->resp.add(new PersonDTO(p)));
        return resp;
    }

    @Override
    public void addPerson(PersonDTO person) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setFirstName(person.getFirstName());
        personEntity.setLastName(person.getLastName());
        personEntity.setAge(person.getAge());
        personEntity.setFavColor(person.getFavouriteColor());
        this.personRepository.save(personEntity);
    }
}
