package com.example.jobsearchsiteproject.model;


import lombok.Data;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;


@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@MappedSuperclass
public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;
    private String gender;

}
