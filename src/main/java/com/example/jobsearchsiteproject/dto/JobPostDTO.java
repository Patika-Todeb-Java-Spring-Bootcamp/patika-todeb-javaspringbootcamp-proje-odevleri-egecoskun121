package com.example.jobsearchsiteproject.dto;

import com.example.jobsearchsiteproject.model.Company;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Data
public class JobPostDTO {

    private Date createdDate;
    private String jobDescription;
    private boolean isActive;
    private Company company;
}
