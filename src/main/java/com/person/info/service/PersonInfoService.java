package com.person.info.service;

import com.person.info.dto.PersonDTO;
import com.person.info.dto.ServiceResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonInfoService {

    /*
        Get list of people
     */
    List<PersonDTO> getPeople();

    /*
        Add a person
     */
    ServiceResponse addPerson(PersonDTO person);

    /*
        Delete a person by ID
     */
    ServiceResponse deletePerson(Long id);

    /*
        Update person details if id exists or else create new
     */
    ServiceResponse updatePerson(PersonDTO person);
}
