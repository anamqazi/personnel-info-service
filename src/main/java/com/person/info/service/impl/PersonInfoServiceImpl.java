package com.person.info.service.impl;

import com.person.info.dto.PersonDTO;
import com.person.info.dto.ServiceResponse;
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
        people.forEach(p -> resp.add(new PersonDTO(p)));
        return resp;
    }

    @Override
    public ServiceResponse addPerson(PersonDTO person) {
        ServiceResponse resp = new ServiceResponse();
        PersonEntity personEntity = new PersonEntity();
        personEntity.setFirstName(person.getFirstName());
        personEntity.setLastName(person.getLastName());
        personEntity.setAge(person.getAge());
        personEntity.setFavColor(person.getFavouriteColor());
        resp.setStatus("SUCCESS");
        resp.setMessage("Person added successfully");
        try {
            this.personRepository.save(personEntity);
        } catch (Exception ex) {
            resp.setStatus("ERROR");
            resp.setMessage("Error occured" + ex.getMessage());
        }
        return resp;
    }

    @Override
    public ServiceResponse deletePerson(Long id) {
        ServiceResponse resp = new ServiceResponse();
        resp.setStatus("SUCCESS");
        resp.setMessage("Person deleted successfully");
        try {
            this.personRepository.delete(this.personRepository.findById(id).orElseThrow(() -> new RuntimeException("Id does not exist")));
        } catch (Exception ex) {
            resp.setStatus("ERROR");
            resp.setMessage("Error occured" + ex.getMessage());
        }
        return resp;
    }

    @Override
    public ServiceResponse updatePerson(PersonDTO person) {
        ServiceResponse resp = new ServiceResponse();
        resp.setStatus("SUCCESS");
        resp.setMessage("Person updated successfully");
        try {
            PersonEntity personEntity = this.personRepository.findById(person.getId()).orElse(new PersonEntity());
            if(null==personEntity.getId() || 0L==personEntity.getId()){
                resp.setMessage("No person found with the requested id . Hence created new");
            }
            personEntity.setFavColor(person.getFavouriteColor());
            personEntity.setFirstName(person.getFirstName());
            personEntity.setLastName(person.getLastName());
            personEntity.setAge(person.getAge());

            this.personRepository.save(personEntity);
        } catch (Exception ex) {
            resp.setStatus("ERROR");
            resp.setMessage("Error occured" + ex.getMessage());
        }
        return resp;
    }
}
