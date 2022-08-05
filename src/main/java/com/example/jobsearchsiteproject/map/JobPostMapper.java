package com.example.jobsearchsiteproject.map;

import com.example.jobsearchsiteproject.dto.JobPostDTO;
import com.example.jobsearchsiteproject.dto.JobSeekerDTO;
import com.example.jobsearchsiteproject.model.JobPost;
import com.example.jobsearchsiteproject.model.JobSeeker;

public class JobPostMapper {

    public static JobPostDTO toDTO(JobPost jobPost){

        JobPostDTO jobPostDTO= new JobPostDTO();
        jobPostDTO.setJobDescription(jobPost.getJobDescription());
        jobPostDTO.setActive(jobPost.isActive());
        jobPostDTO.setCompany(jobPost.getCompany());
        jobPostDTO.setCreatedDate(jobPost.getCreatedDate());

        return jobPostDTO;
    }

    public static JobPost toEntity(JobPostDTO jobPostDTO){

        JobPost jobPost= new JobPost();
        jobPost.setJobDescription(jobPostDTO.getJobDescription());
        jobPost.setActive(jobPostDTO.isActive());
        jobPost.setCompany(jobPostDTO.getCompany());
        jobPost.setCreatedDate(jobPostDTO.getCreatedDate());

        return jobPost;
    }
}
