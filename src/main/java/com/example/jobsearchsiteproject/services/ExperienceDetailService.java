package com.example.jobsearchsiteproject.services;

import com.example.jobsearchsiteproject.dto.EducationDetailDTO;
import com.example.jobsearchsiteproject.dto.ExperienceDetailDTO;
import com.example.jobsearchsiteproject.exception.EntityNotFoundException;
import com.example.jobsearchsiteproject.map.EducationDetailMapper;
import com.example.jobsearchsiteproject.map.ExperienceDetailMapper;
import com.example.jobsearchsiteproject.model.EducationDetail;
import com.example.jobsearchsiteproject.model.ExperienceDetail;
import com.example.jobsearchsiteproject.repository.ExperienceDetailRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ExperienceDetailService {

    private final ExperienceDetailRepository experienceDetailRepository;

    public ExperienceDetailService(ExperienceDetailRepository experienceDetailRepository){
        this.experienceDetailRepository=experienceDetailRepository;
    }

    public List<ExperienceDetail> getAllExperienceDetails() {
        List<ExperienceDetail> allEducationalDetails = experienceDetailRepository.findAll();
        return allEducationalDetails;
    }

    public ExperienceDetail getById(Long id) {
        Optional<ExperienceDetail> byId = experienceDetailRepository.findById(id);
        return byId.orElseThrow(() -> {
            log.error("Experience detail not found by id : " + id);
            return new EntityNotFoundException("Experience detail", "id : " + id);
        });
    }

    public ExperienceDetail create(ExperienceDetailDTO experienceDetailDTO) {
        ExperienceDetail experienceDetail = ExperienceDetailMapper.toEntity(experienceDetailDTO);
        return experienceDetailRepository.save(experienceDetail);
    }

    public void delete(Long id) {
        getById(id);
        experienceDetailRepository.deleteById(id);
    }
}
