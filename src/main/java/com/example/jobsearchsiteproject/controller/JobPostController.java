package com.example.jobsearchsiteproject.controller;


import com.example.jobsearchsiteproject.dto.JobPostDTO;
import com.example.jobsearchsiteproject.dto.JobSeekerDTO;
import com.example.jobsearchsiteproject.model.JobPost;
import com.example.jobsearchsiteproject.model.JobSeeker;
import com.example.jobsearchsiteproject.services.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/jobpost")
public class JobPostController {

    private JobPostService jobPostService;

    @Autowired
    public JobPostController(JobPostService jobPostService){
        this.jobPostService=jobPostService;
    }


    @GetMapping("/all")
    public ResponseEntity getAllJobPosts(){
        List<JobPost> allJobSeekers = jobPostService.getAllJobPosts();

        return ResponseEntity.ok(allJobSeekers);
    }

    @GetMapping("/{id}")
    public ResponseEntity getJobPostById(@PathVariable("id") Long id){
        JobPost byId = jobPostService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(byId);
    }

    @PostMapping("/create")
    public ResponseEntity createNewJobPost(@RequestBody JobPostDTO jobPostDTO){
        JobPost jobPost = jobPostService.create(jobPostDTO);

        if(jobPost==null){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Job post could not be created successfully");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(jobPost);
    }

    @DeleteMapping
    public ResponseEntity deleteJobPost(@RequestParam(name = "id") Long id) {
        jobPostService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Related Job post deleted successfully");
    }
}
