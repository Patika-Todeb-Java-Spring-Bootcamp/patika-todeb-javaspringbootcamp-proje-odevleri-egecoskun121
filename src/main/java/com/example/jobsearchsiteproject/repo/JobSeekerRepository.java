package com.example.jobsearchsiteproject.repo;

import com.example.jobsearchsiteproject.model.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JobSeekerRepository extends JpaRepository<JobSeeker,Long> {


    Optional<JobSeeker> findJobSeekerByUniversityName(String universityName);

    Optional<JobSeeker> findByFirstName(String firstName);
}