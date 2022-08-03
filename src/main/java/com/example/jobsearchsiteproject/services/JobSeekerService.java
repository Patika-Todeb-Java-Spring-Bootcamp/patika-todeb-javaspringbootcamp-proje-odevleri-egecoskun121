package com.example.jobsearchsiteproject.services;


import com.example.jobsearchsiteproject.dto.JobSeekerDTO;
import com.example.jobsearchsiteproject.exception.EntityNotFoundException;
import com.example.jobsearchsiteproject.map.JobSeekerMapper;
import com.example.jobsearchsiteproject.model.JobSeeker;
import com.example.jobsearchsiteproject.repo.JobSeekerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class JobSeekerService {

    private final JobSeekerRepository jobSeekerRepository;


    public List<JobSeeker> getAllJobSeekers() {
        List<JobSeeker> allCourses = jobSeekerRepository.findAll();
        return allCourses;
    }

    public JobSeeker getById(Long id) {
        Optional<JobSeeker> byId = jobSeekerRepository.findById(id);
        return byId.orElseThrow(() -> {
            log.error("Course not found by id : " + id);
            return new EntityNotFoundException("Course", "id : " + id);
        });
    }

    public JobSeeker getByFirstName(String firstName) {
        Optional<JobSeeker> byId = jobSeekerRepository.findByFirstName(firstName);
        return byId.orElseThrow(() -> {
            log.error("Course not found by id : " + firstName);
            return new EntityNotFoundException("Course", "id : " + firstName);
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
