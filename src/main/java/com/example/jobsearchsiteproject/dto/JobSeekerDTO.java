package com.example.jobsearchsiteproject.dto;


import com.example.jobsearchsiteproject.model.Person;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobSeekerDTO extends Person {

    private double currentSalary;
    private boolean isSalaryMonthly;
    private String currency;

}
