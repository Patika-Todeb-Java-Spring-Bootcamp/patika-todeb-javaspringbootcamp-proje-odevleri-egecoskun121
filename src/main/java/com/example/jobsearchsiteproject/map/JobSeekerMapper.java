package com.example.jobsearchsiteproject.map;

import com.example.jobsearchsiteproject.dto.JobSeekerDTO;
import com.example.jobsearchsiteproject.model.JobSeeker;

public class JobSeekerMapper {

    public static JobSeekerDTO toDTO(JobSeeker jobSeeker){
        JobSeekerDTO jobSeekerDto = new JobSeekerDTO();
        jobSeekerDto.setCurrency(jobSeeker.getCurrency());
        jobSeekerDto.setCurrentSalary(jobSeeker.getCurrentSalary());
        jobSeekerDto.setSalaryMonthly(jobSeeker.isSalaryMonthly());
        jobSeekerDto.setFirstName(jobSeeker.getFirstName());
        jobSeekerDto.setLastName(jobSeeker.getLastName());
        jobSeekerDto.setEmail(jobSeeker.getEmail());
        jobSeekerDto.setGender(jobSeeker.getGender());

        return jobSeekerDto;
    }

    public static JobSeeker toEntity(JobSeekerDTO jobSeekerDTO){
        JobSeeker jobSeeker = new JobSeeker();
        jobSeeker.setCurrency(jobSeekerDTO.getCurrency());
        jobSeeker.setCurrentSalary(jobSeekerDTO.getCurrentSalary());
        jobSeeker.setSalaryMonthly(jobSeekerDTO.isSalaryMonthly());
        jobSeeker.setFirstName(jobSeekerDTO.getFirstName());
        jobSeeker.setLastName(jobSeekerDTO.getLastName());
        jobSeeker.setEmail(jobSeekerDTO.getEmail());
        jobSeeker.setContactNumber(jobSeekerDTO.getContactNumber());
        jobSeeker.setGender(jobSeekerDTO.getGender());
        return jobSeeker;
    }

}
