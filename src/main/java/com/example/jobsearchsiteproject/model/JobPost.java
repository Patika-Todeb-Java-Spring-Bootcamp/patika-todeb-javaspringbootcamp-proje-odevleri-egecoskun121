package com.example.jobsearchsiteproject.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name="jobpost")
@AllArgsConstructor
@NoArgsConstructor
public class JobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String createdDate;
    private String jobDescription;
    private boolean isActive;
    private String jobCity;
    private String jobCountry;


    @OneToMany(cascade = CascadeType.ALL)
    private Set<JobSeeker> jobSeekersApplied;







}
