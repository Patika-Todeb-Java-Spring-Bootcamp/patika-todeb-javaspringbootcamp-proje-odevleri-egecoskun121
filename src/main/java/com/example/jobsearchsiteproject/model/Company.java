package com.example.jobsearchsiteproject.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;


@Data
@RequiredArgsConstructor
public class Company {

    private Long companyId;
    private String companyName;
    private String profileDescription;
    private Date foundationYear;
    private String companyURL;

}
