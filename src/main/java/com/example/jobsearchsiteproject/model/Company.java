package com.example.jobsearchsiteproject.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    private String profileDescription;
    private Integer foundationYear;
    private String companyURL;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<JobPost> jobPostSet;

}
