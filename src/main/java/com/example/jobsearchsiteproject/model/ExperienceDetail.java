package com.example.jobsearchsiteproject.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor

public class ExperienceDetail {

    private boolean isCurrentJob;
    private Date startDate;
    private Date endDate;
    private String jobTitle;
    private String companyName;
    private String jobLocationCity;
    private String jobLocationCountry;
    private String description;

}
