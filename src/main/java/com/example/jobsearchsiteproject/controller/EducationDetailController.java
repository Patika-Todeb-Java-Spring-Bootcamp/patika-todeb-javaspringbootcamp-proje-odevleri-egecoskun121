package com.example.jobsearchsiteproject.controller;

import com.example.jobsearchsiteproject.dto.EducationDetailDTO;
import com.example.jobsearchsiteproject.map.EducationDetailMapper;
import com.example.jobsearchsiteproject.model.EducationDetail;
import com.example.jobsearchsiteproject.model.JobSeeker;
import com.example.jobsearchsiteproject.services.EducationDetailService;
import com.example.jobsearchsiteproject.services.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1/education")
public class EducationDetailController {

    private JobSeekerService jobSeekerService;
    private EducationDetailService educationDetailService;
    private EducationDetailMapper educationDetailMapper;

    @Autowired
    public EducationDetailController(EducationDetailService educationDetailService,JobSeekerService jobSeekerService,EducationDetailMapper educationDetailMapper){
        this.educationDetailService=educationDetailService;
        this.jobSeekerService=jobSeekerService;
        this.educationDetailMapper=educationDetailMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity getEducationalDetailById(@PathVariable("id") Long id){
        EducationDetail byId = educationDetailService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(byId);
    }

    @RequestMapping(value="/create/{id}",method = RequestMethod.POST)
    public ResponseEntity createEducationDetail(@RequestBody EducationDetailDTO educationDetailDTO,@PathVariable("id") Long id){

        EducationDetail educationDetail = educationDetailMapper.toEntity(educationDetailDTO);
        JobSeeker jobSeeker=jobSeekerService.getById(id);

       jobSeeker.getEducationDetailSet().add(educationDetail);
       jobSeeker.setEducationDetailSet(jobSeeker.getEducationDetailSet());

        educationDetail = educationDetailService.create(educationDetailDTO);


        if(educationDetail==null){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Education detail could not be created successfully");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(educationDetail);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteEducationDetail(@RequestParam(name = "id") Long id) {
        educationDetailService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Related educational detail deleted successfully");
    }

}
