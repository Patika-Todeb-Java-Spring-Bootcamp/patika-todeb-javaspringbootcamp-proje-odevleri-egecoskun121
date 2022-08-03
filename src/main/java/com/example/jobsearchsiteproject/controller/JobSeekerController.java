package com.example.jobsearchsiteproject.controller;


import com.example.jobsearchsiteproject.dto.JobSeekerDTO;
import com.example.jobsearchsiteproject.model.JobSeeker;
import com.example.jobsearchsiteproject.services.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/jobseeker")
public class JobSeekerController {

    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekerController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping("/all")
    public ResponseEntity getAllJobSeekers(){
        List<JobSeeker> allJobSeekers = jobSeekerService.getAllJobSeekers();

        return ResponseEntity.ok(allJobSeekers);
    }

    @GetMapping("/{id}")
    public ResponseEntity getJobSeekerById(@PathVariable("id") Long id){
        JobSeeker byId = jobSeekerService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(byId);
    }

    @PostMapping("/create")
    public ResponseEntity createNewJobSeeker(@RequestBody JobSeekerDTO jobSeekerDTO){
        JobSeeker jobSeeker = jobSeekerService.create(jobSeekerDTO);

        if(jobSeeker==null){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Job seeker could not be created successfully");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(jobSeeker);
    }

    @DeleteMapping
    public ResponseEntity deleteCourse(@RequestParam(name = "id") Long id) {
        jobSeekerService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Related Job seeker deleted successfully");
    }

}
