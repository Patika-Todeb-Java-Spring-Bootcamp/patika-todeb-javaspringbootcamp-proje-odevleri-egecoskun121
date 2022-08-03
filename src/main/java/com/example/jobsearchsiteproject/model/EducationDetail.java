package com.example.jobsearchsiteproject.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@RequiredArgsConstructor
@Entity
public class EducationDetail {

    @Id
    private Long id;
    private String major;
    private String universityName;
    private Date startDate;
    private Date endDate;
    private double gpa;

}
