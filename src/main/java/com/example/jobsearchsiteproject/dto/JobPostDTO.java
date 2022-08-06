package com.example.jobsearchsiteproject.dto;

import lombok.Data;

@Data
public class JobPostDTO {

    private String createdDate;
    private String jobDescription;
    private boolean isActive;
    private String jobCity;
    private String jobCountry;
}
