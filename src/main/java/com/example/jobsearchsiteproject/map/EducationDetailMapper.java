package com.example.jobsearchsiteproject.map;

import com.example.jobsearchsiteproject.dto.EducationDetailDTO;
import com.example.jobsearchsiteproject.dto.JobPostDTO;
import com.example.jobsearchsiteproject.model.EducationDetail;
import com.example.jobsearchsiteproject.model.JobPost;
import org.springframework.stereotype.Component;

@Component
public class EducationDetailMapper {


    public static EducationDetailDTO toDTO(EducationDetail educationDetail){

        EducationDetailDTO educationDetailDTO= new EducationDetailDTO();
        educationDetailDTO.setMajor(educationDetail.getMajor());
        educationDetailDTO.setGpa(educationDetail.getGpa());
        educationDetailDTO.setEndDate(educationDetail.getEndDate());
        educationDetailDTO.setStartDate(educationDetail.getStartDate());
        educationDetailDTO.setUniversityName(educationDetail.getUniversityName());


        return educationDetailDTO;
    }

    public static EducationDetail toEntity(EducationDetailDTO educationDetailDTO){

        EducationDetail educationDetail= new EducationDetail();
        educationDetail.setMajor(educationDetailDTO.getMajor());
        educationDetail.setGpa(educationDetailDTO.getGpa());
        educationDetail.setEndDate(educationDetailDTO.getEndDate());
        educationDetail.setStartDate(educationDetailDTO.getStartDate());
        educationDetail.setUniversityName(educationDetailDTO.getUniversityName());

        return educationDetail;
    }
}
