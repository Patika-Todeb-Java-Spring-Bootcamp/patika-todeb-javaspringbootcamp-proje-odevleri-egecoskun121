package com.example.jobsearchsiteproject.map;

import com.example.jobsearchsiteproject.dto.JobSeekerDTO;
import com.example.jobsearchsiteproject.model.JobSeeker;

public class JobSeekerMapper {

    public static JobSeekerDTO toDTO(JobSeeker jobSeeker){
        JobSeekerDTO jobSeekerDto = new JobSeekerDTO();
        jobSeekerDto.setCurrency(jobSeeker.getCurrency());
        jobSeekerDto.setCurrentSalary(jobSeeker.getCurrentSalary());
        jobSeekerDto.setEducationDetail(jobSeeker.getEducationDetail());
        jobSeekerDto.setExperienceDetail(jobSeeker.getExperienceDetail());
        jobSeekerDto.setSalaryMonthly(jobSeeker.isSalaryMonthly());

        return jobSeekerDto;
    }

    public static JobSeeker toEntity(JobSeekerDTO jobSeekerDTO){
        JobSeeker jobSeeker = new JobSeeker();
        jobSeeker.setCurrency(jobSeekerDTO.getCurrency());
        jobSeeker.setCurrentSalary(jobSeekerDTO.getCurrentSalary());
        jobSeeker.setEducationDetail(jobSeekerDTO.getEducationDetail());
        jobSeeker.setExperienceDetail(jobSeekerDTO.getExperienceDetail());
        jobSeeker.setSalaryMonthly(jobSeekerDTO.isSalaryMonthly());

        return jobSeeker;
    }

}
