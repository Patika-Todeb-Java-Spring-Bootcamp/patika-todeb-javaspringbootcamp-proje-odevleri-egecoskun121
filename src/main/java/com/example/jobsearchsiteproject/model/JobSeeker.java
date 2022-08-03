package com.example.jobsearchsiteproject.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class JobSeeker extends Person{

    private double currentSalary;
    private boolean isSalaryMonthly;
    private String currency;
    private ExperienceDetail experienceDetail;
    private EducationDetail educationDetail;

}
