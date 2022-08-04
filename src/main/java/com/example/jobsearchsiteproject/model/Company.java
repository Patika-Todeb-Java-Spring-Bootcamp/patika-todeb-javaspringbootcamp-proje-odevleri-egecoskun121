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
public class Company {

    @Id
    private Long id;
    private String companyName;
    private String profileDescription;
    private Date foundationYear;
    private String companyURL;

}
