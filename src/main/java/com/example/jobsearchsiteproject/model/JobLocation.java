package com.example.jobsearchsiteproject.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class JobLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String country;
    @ManyToOne
    private JobPost jobPost;

}
