package com.example.jobsearchsiteproject.controller;


import com.example.jobsearchsiteproject.dto.EducationDetailDTO;
import com.example.jobsearchsiteproject.dto.ExperienceDetailDTO;
import com.example.jobsearchsiteproject.map.ExperienceDetailMapper;
import com.example.jobsearchsiteproject.model.EducationDetail;
import com.example.jobsearchsiteproject.model.ExperienceDetail;
import com.example.jobsearchsiteproject.model.JobSeeker;
import com.example.jobsearchsiteproject.services.ExperienceDetailService;
import com.example.jobsearchsiteproject.services.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/experience")
public class ExperienceDetailController {

    private ExperienceDetailMapper experienceDetailMapper;
    private JobSeekerService jobSeekerService;
    private ExperienceDetailService experienceDetailService;

    @Autowired
    public ExperienceDetailController(ExperienceDetailMapper experienceDetailMapper, JobSeekerService jobSeekerService, ExperienceDetailService experienceDetailService) {
        this.experienceDetailMapper = experienceDetailMapper;
        this.jobSeekerService = jobSeekerService;
        this.experienceDetailService = experienceDetailService;
    }

    @GetMapping("/{id}")
    public ResponseEntity getExperienceDetailById(@PathVariable("id") Long id){
        ExperienceDetail byId = experienceDetailService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(byId);
    }

    @RequestMapping(value="/create/{id}",method = RequestMethod.POST)
    public ResponseEntity createEducationDetail(@RequestBody ExperienceDetailDTO experienceDetailDTO, @PathVariable("id") Long id){

        ExperienceDetail experienceDetail = experienceDetailMapper.toEntity(experienceDetailDTO);
        JobSeeker jobSeeker=jobSeekerService.getById(id);

        jobSeeker.getExperienceDetailSet().add(experienceDetail);
        jobSeeker.setExperienceDetailSet(jobSeeker.getExperienceDetailSet());

        experienceDetail = experienceDetailService.create(experienceDetailDTO);


        if(experienceDetail==null){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Experience detail could not be created successfully");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(experienceDetail);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteExperienceDetail(@RequestParam(name = "id") Long id) {
        experienceDetailService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Related experience detail deleted successfully");
    }
}
