package com.example.jobsearchsiteproject.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
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

    @OneToMany(mappedBy = "jobSeeker",cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    private Set<ExperienceDetail> experienceDetailSet;

    @OneToMany(mappedBy = "jobSeeker",cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    private Set<EducationDetail> educationDetailSet;

}
