package com.example.jobsearchsiteproject.dto;


import com.example.jobsearchsiteproject.model.Person;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class JobSeekerDTO extends Person {

    private double currentSalary;
    private boolean isSalaryMonthly;
    private String currency;

}
