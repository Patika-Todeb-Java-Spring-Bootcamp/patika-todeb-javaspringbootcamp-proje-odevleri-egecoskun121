package com.example.jobsearchsiteproject.dto;

import lombok.Data;


@Data
public class CompanyDTO {
    private String companyName;
    private String profileDescription;
    private Integer foundationYear;
    private String companyURL;
}
