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
@Table(name="jobseekers")
public class JobSeeker extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobSeekerId;
    private double currentSalary;
    private boolean isSalaryMonthly;
    private String currency;
    @OneToMany(mappedBy = "",cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    private Set<ExperienceDetail> experienceDetailSet;
    @OneToMany()
    private Set<EducationDetail> educationDetailSet;

}
