package com.example.jobsearchsiteproject.model;

import java.util.Date;

public class ExperienceDetail {

    private boolean isCurrentJob;
    private Date startDate;
    private Date endDate;
    private String jobTitle;
    private String companyName;
    private String jobLocationCity;
    private String jobLocationCountry;
    private String description;

    public ExperienceDetail(boolean isCurrentJob, Date startDate, Date endDate, String jobTitle, String companyName, String jobLocationCity, String jobLocationCountry, String description) {
        this.isCurrentJob = isCurrentJob;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.jobLocationCity = jobLocationCity;
        this.jobLocationCountry = jobLocationCountry;
        this.description = description;
    }

    public boolean isCurrentJob() {
        return isCurrentJob;
    }

    public void setCurrentJob(boolean currentJob) {
        isCurrentJob = currentJob;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobLocationCity() {
        return jobLocationCity;
    }

    public void setJobLocationCity(String jobLocationCity) {
        this.jobLocationCity = jobLocationCity;
    }

    public String getJobLocationCountry() {
        return jobLocationCountry;
    }

    public void setJobLocationCountry(String jobLocationCountry) {
        this.jobLocationCountry = jobLocationCountry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ExperienceDetail{" +
                "isCurrentJob=" + isCurrentJob +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobLocationCity='" + jobLocationCity + '\'' +
                ", jobLocationCountry='" + jobLocationCountry + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
