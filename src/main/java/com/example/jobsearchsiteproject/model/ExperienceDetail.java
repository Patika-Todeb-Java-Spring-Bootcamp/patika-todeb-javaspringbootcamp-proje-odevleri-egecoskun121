package com.example.jobsearchsiteproject.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "Experience Details")
public class ExperienceDetail {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name="jobseeker_id",nullable = false)
    private JobSeeker jobSeeker;

    private boolean isCurrentJob;
    private Date startDate;
    private Date endDate;
    private String jobTitle;
    private String companyName;
    private String jobLocationCity;
    private String jobLocationCountry;
    private String description;



}
