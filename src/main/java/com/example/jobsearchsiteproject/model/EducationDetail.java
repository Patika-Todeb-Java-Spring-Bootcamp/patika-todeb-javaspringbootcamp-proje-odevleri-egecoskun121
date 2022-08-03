package com.example.jobsearchsiteproject.model;

import java.util.Date;

public class EducationDetail {

    private String major;
    private String universityName;
    private Date startDate;
    private Date endDate;
    private double gpa;

    public EducationDetail(String major, String universityName, Date startDate, Date endDate, double gpa) {
        this.major = major;
        this.universityName = universityName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "EducationDetail{" +
                "major='" + major + '\'' +
                ", universityName='" + universityName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", gpa=" + gpa +
                '}';
    }
}
