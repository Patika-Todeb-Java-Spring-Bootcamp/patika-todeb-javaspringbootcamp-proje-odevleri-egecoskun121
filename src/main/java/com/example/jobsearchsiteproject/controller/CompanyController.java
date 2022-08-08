package com.example.jobsearchsiteproject.controller;

import com.example.jobsearchsiteproject.dto.CompanyDTO;
import com.example.jobsearchsiteproject.dto.JobSeekerDTO;
import com.example.jobsearchsiteproject.model.Company;
import com.example.jobsearchsiteproject.model.JobSeeker;
import com.example.jobsearchsiteproject.services.CompanyService;
import com.example.jobsearchsiteproject.services.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyController {

    private CompanyService companyService;
    private JobSeekerService jobSeekerService;

    @Autowired
    public CompanyController(CompanyService companyService, JobSeekerService jobSeekerService) {
        this.companyService = companyService;
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping("/all")
    public ResponseEntity getAllCompanies(){
        List<Company> allCompanies= companyService.getALlCompanies();

        return ResponseEntity.ok(allCompanies);
    }

    @GetMapping("/{id}")
    public ResponseEntity getCompanyById(@PathVariable("id") Long id){
        Company byId = companyService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(byId);
    }

    @PostMapping("/create")
    public ResponseEntity createNewCompany(@RequestBody CompanyDTO companyDTO){
        Company company = companyService.create(companyDTO);

        if(company==null){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Company could not be created successfully");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(company);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteCompany(@RequestParam(name = "id") Long id) {
        companyService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Related company deleted successfully");
    }



}
