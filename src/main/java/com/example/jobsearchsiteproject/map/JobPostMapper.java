package com.example.jobsearchsiteproject.map;

import com.example.jobsearchsiteproject.dto.JobPostDTO;
import com.example.jobsearchsiteproject.model.JobPost;
import org.springframework.stereotype.Component;

@Component
public class JobPostMapper {

    public static JobPostDTO toDTO(JobPost jobPost){

        JobPostDTO jobPostDTO= new JobPostDTO();
        jobPostDTO.setJobDescription(jobPost.getJobDescription());
        jobPostDTO.setActive(jobPost.isActive());
        jobPostDTO.setJobCity(jobPost.getJobCity());
        jobPostDTO.setJobCountry(jobPost.getJobCountry());
        jobPostDTO.setCreatedDate(jobPost.getCreatedDate());

        return jobPostDTO;
    }

    public static JobPost toEntity(JobPostDTO jobPostDTO){

        JobPost jobPost= new JobPost();
        jobPost.setJobDescription(jobPostDTO.getJobDescription());
        jobPost.setActive(jobPostDTO.isActive());
        jobPost.setJobCity(jobPostDTO.getJobCity());
        jobPost.setCreatedDate(jobPostDTO.getCreatedDate());
        jobPost.setJobCountry(jobPostDTO.getJobCountry());

        return jobPost;
    }
}
