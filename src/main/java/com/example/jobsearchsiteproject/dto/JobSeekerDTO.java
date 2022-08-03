package com.example.jobsearchsiteproject.dto;

import com.example.jobsearchsiteproject.model.EducationDetail;
import com.example.jobsearchsiteproject.model.ExperienceDetail;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobSeekerDTO {

    private double currentSalary;
    private boolean isSalaryMonthly;
    private String currency;
    private ExperienceDetail experienceDetail;
    private EducationDetail educationDetail;

}
