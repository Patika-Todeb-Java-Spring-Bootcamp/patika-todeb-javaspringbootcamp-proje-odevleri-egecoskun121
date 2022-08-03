package com.example.jobsearchsiteproject.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class EducationDetail {

    private String major;
    private String universityName;
    private Date startDate;
    private Date endDate;
    private double gpa;

}
