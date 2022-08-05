package com.example.jobsearchsiteproject.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import javax.persistence.*;
import java.util.Date;

@Data
@RequiredArgsConstructor
@Entity
public class EducationDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "jobseeker_id",nullable = false)
    private JobSeeker jobSeeker;

    private String major;
    private String universityName;
    private Date startDate;
    private Date endDate;
    private double gpa;

}
