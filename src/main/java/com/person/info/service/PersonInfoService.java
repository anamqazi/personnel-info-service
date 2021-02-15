package com.person.info.service;

import com.person.info.dto.PersonDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonInfoService {

     List<PersonDTO> getPeople();
     void addPerson(PersonDTO person);
     void deletePerson(Long id);
     void updatePerson(PersonDTO person);
}
