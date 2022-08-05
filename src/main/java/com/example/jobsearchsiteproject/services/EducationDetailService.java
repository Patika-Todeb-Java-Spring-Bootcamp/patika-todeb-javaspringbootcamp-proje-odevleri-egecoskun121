package com.example.jobsearchsiteproject.services;


import com.example.jobsearchsiteproject.dto.EducationDetailDTO;
import com.example.jobsearchsiteproject.dto.JobSeekerDTO;
import com.example.jobsearchsiteproject.exception.EntityNotFoundException;
import com.example.jobsearchsiteproject.map.EducationDetailMapper;
import com.example.jobsearchsiteproject.map.JobSeekerMapper;
import com.example.jobsearchsiteproject.model.EducationDetail;
import com.example.jobsearchsiteproject.model.JobPost;
import com.example.jobsearchsiteproject.model.JobSeeker;
import com.example.jobsearchsiteproject.repository.EducationDetailRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EducationDetailService {


    private final EducationDetailRepository educationDetailRepository;

    public EducationDetailService(EducationDetailRepository educationDetailRepository){
        this.educationDetailRepository=educationDetailRepository;
    }

    public List<EducationDetail> getAllEducationDetails() {
        //ED stands for Education Detail
        List<EducationDetail> allED = educationDetailRepository.findAll();
        return allED;
    }


    public EducationDetail getById(Long id) {
        Optional<EducationDetail> byId = educationDetailRepository.findById(id);
        return byId.orElseThrow(() -> {
            log.error("Education detail not found by id : " + id);
            return new EntityNotFoundException("Education detail", "id : " + id);
        });
    }

    public EducationDetail create(EducationDetailDTO educationDetailDTO) {
        EducationDetail educationDetail = EducationDetailMapper.toEntity(educationDetailDTO);
        return educationDetailRepository.save(educationDetail);
    }

    public void delete(Long id) {
        getById(id);
        educationDetailRepository.deleteById(id);
    }

}
