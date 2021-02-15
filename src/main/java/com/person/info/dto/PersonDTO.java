package com.person.info.dto;

import com.person.info.entity.PersonEntity;
//import lombok.Data;

//@Data
public class PersonDTO {

    private String firstName;
    private String lastName;
    private int age;
    private String favouriteColor;
    private Long id;

    public PersonDTO(PersonEntity personEntity) {
        this.setFirstName(personEntity.getFirstName());
        this.setLastName(personEntity.getLastName());
        this.setAge(personEntity.getAge());
        this.setFavouriteColor(personEntity.getFavColor());
        this.setId(personEntity.getId());
    }

    public PersonDTO(){

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavouriteColor() {
        return favouriteColor;
    }

    public void setFavouriteColor(String favouriteColor) {
        this.favouriteColor = favouriteColor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
