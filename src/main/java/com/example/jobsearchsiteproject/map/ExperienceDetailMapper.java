package com.example.jobsearchsiteproject.map;

import com.example.jobsearchsiteproject.dto.ExperienceDetailDTO;

import com.example.jobsearchsiteproject.model.ExperienceDetail;
import org.springframework.stereotype.Component;

@Component
public class ExperienceDetailMapper {

    public static ExperienceDetailDTO toDTO(ExperienceDetail experienceDetail){

        ExperienceDetailDTO experienceDetailDTO= new ExperienceDetailDTO();
        experienceDetailDTO.setDescription(experienceDetail.getDescription());
        experienceDetailDTO.setCompanyName(experienceDetail.getCompanyName());
        experienceDetailDTO.setEndDate(experienceDetail.getEndDate());
        experienceDetailDTO.setCurrentJob(experienceDetail.isCurrentJob());
        experienceDetailDTO.setJobLocationCity(experienceDetail.getJobLocationCity());
        experienceDetailDTO.setJobTitle(experienceDetail.getJobTitle());
        experienceDetailDTO.setStartDate(experienceDetail.getStartDate());
        experienceDetailDTO.setJobLocationCountry(experienceDetail.getJobLocationCountry());


        return experienceDetailDTO;
    }

    public static ExperienceDetail toEntity(ExperienceDetailDTO experienceDetailDTO){

        ExperienceDetail experienceDetail= new ExperienceDetail();
        experienceDetail.setDescription(experienceDetailDTO.getDescription());
        experienceDetail.setCompanyName(experienceDetailDTO.getCompanyName());
        experienceDetail.setEndDate(experienceDetailDTO.getEndDate());
        experienceDetail.setCurrentJob(experienceDetailDTO.isCurrentJob());
        experienceDetail.setJobLocationCity(experienceDetailDTO.getJobLocationCity());
        experienceDetail.setJobTitle(experienceDetailDTO.getJobTitle());
        experienceDetail.setStartDate(experienceDetailDTO.getStartDate());
        experienceDetail.setJobLocationCountry(experienceDetailDTO.getJobLocationCountry());

        return experienceDetail;
    }
}
