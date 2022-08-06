package com.example.jobsearchsiteproject.repository;

import com.example.jobsearchsiteproject.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {

}
