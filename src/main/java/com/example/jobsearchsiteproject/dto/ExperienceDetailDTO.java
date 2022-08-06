package com.example.jobsearchsiteproject.dto;


import lombok.Data;

@Data
public class ExperienceDetailDTO {

    private boolean isCurrentJob;
    private String startDate;
    private String endDate;
    private String jobTitle;
    private String companyName;
    private String jobLocationCity;
    private String jobLocationCountry;
    private String description;
}
