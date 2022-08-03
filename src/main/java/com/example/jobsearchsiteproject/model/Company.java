package com.example.jobsearchsiteproject.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;


@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Company extends BaseEntity {

    private String companyName;
    private String profileDescription;
    private Date foundationYear;
    private String companyURL;

}
