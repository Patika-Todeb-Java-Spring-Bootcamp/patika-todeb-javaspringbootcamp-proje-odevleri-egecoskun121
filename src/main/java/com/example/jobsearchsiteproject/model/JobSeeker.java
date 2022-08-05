package com.example.jobsearchsiteproject.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="jobseeker")
public class JobSeeker extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private double currentSalary;
    private boolean isSalaryMonthly;
    private String currency;


    @OneToMany(cascade = CascadeType.ALL)
    private Set<ExperienceDetail> experienceDetailSet;


    @OneToMany(cascade = CascadeType.ALL)
    private Set<EducationDetail> educationDetailSet;

}
