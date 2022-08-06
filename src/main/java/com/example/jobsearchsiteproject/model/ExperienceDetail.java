package com.example.jobsearchsiteproject.model;

import lombok.Data;

import lombok.RequiredArgsConstructor;

import javax.persistence.*;


@Data
@RequiredArgsConstructor
@Entity
@Table(name = "experience_detail")
public class ExperienceDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private boolean isCurrentJob;
    private String startDate;
    private String endDate;
    private String jobTitle;
    private String companyName;
    private String jobLocationCity;
    private String jobLocationCountry;
    private String description;



}
