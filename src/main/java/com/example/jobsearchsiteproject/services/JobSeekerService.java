package com.example.jobsearchsiteproject.services;


import com.example.jobsearchsiteproject.dto.JobSeekerDTO;
import com.example.jobsearchsiteproject.exception.EntityNotFoundException;
import com.example.jobsearchsiteproject.map.JobSeekerMapper;
import com.example.jobsearchsiteproject.model.JobSeeker;
import com.example.jobsearchsiteproject.repository.JobSeekerRepository;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
@Slf4j
public class JobSeekerService {


    private final JobSeekerRepository jobSeekerRepository;

    @Autowired
    public JobSeekerService(JobSeekerRepository jobSeekerRepository) {
        this.jobSeekerRepository = jobSeekerRepository;
    }

    public List<JobSeeker> getAllJobSeekers() {
        List<JobSeeker> allJobSeekers = jobSeekerRepository.findAll();
        return allJobSeekers;
    }

    public JobSeeker getById(Long id) {
        Optional<JobSeeker> byId = jobSeekerRepository.findById(id);
        return byId.orElseThrow(() -> {
            log.error("Course not found by id : " + id);
            return new EntityNotFoundException("Course", "id : " + id);
        });
    }


    public JobSeeker create(JobSeekerDTO jobSeekerDTO) {
        JobSeeker jobSeeker = JobSeekerMapper.toEntity(jobSeekerDTO);
        return jobSeekerRepository.save(jobSeeker);
    }

    public void delete(Long id) {
        getById(id);
        jobSeekerRepository.deleteById(id);
    }



}
