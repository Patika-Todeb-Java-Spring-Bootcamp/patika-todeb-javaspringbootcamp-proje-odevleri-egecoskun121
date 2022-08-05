package com.example.jobsearchsiteproject.repository;

import com.example.jobsearchsiteproject.model.JobPost;
import com.example.jobsearchsiteproject.model.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostRepository  extends JpaRepository<JobPost,Long> {
}
