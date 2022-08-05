package com.example.jobsearchsiteproject.services;

import com.example.jobsearchsiteproject.dto.JobPostDTO;
import com.example.jobsearchsiteproject.dto.JobSeekerDTO;
import com.example.jobsearchsiteproject.exception.EntityNotFoundException;
import com.example.jobsearchsiteproject.map.JobPostMapper;
import com.example.jobsearchsiteproject.map.JobSeekerMapper;
import com.example.jobsearchsiteproject.model.JobPost;
import com.example.jobsearchsiteproject.model.JobSeeker;
import com.example.jobsearchsiteproject.repository.JobPostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class JobPostService {

    private final JobPostRepository jobPostRepository;

    @Autowired
    public JobPostService(JobPostRepository jobPostRepository) {
        this.jobPostRepository = jobPostRepository;
    }

    public List<JobPost> getAllJobPosts() {
        List<JobPost> allPosts = jobPostRepository.findAll();
        return allPosts;
    }

    public JobPost getById(Long id) {
        Optional<JobPost> byId = jobPostRepository.findById(id);
        return byId.orElseThrow(() -> {
            log.error("Course not found by id : " + id);
            return new EntityNotFoundException("Job post ", "id : " + id);
        });
    }

    public JobPost create(JobPostDTO jobPostDTO) {
        JobPost jobPost = JobPostMapper.toEntity(jobPostDTO);
        return jobPostRepository.save(jobPost);
    }

    public void delete(Long id) {
        getById(id);
        jobPostRepository.deleteById(id);
    }
}
