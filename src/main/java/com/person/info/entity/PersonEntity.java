package com.person.info.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="PERSON")
public class PersonEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "personSeq")
    @SequenceGenerator(name="personSeq",sequenceName = "seq_person", initialValue = 3)
    @Column(name="ID")
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="age")
    private int age;

    @Column(name="favourite_colour")
    private String favColor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getFavColor() {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }
}
