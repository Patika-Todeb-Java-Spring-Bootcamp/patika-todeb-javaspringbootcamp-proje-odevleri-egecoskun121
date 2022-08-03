package com.example.jobsearchsiteproject.model;

public class JobSeeker extends Person{


    private Long currentSalary;
    private boolean isSalaryMonthly;
    private String currency;
    private ExperienceDetail experienceDetail;
    private EducationDetail educationDetail;

    public JobSeeker(Long currentSalary, boolean isSalaryMonthly, String currency, ExperienceDetail experienceDetail, EducationDetail educationDetail) {
        this.currentSalary = currentSalary;
        this.isSalaryMonthly = isSalaryMonthly;
        this.currency = currency;
        this.experienceDetail = experienceDetail;
        this.educationDetail = educationDetail;
    }

    public Long getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(Long currentSalary) {
        this.currentSalary = currentSalary;
    }

    public boolean isSalaryMonthly() {
        return isSalaryMonthly;
    }

    public void setSalaryMonthly(boolean salaryMonthly) {
        isSalaryMonthly = salaryMonthly;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ExperienceDetail getExperienceDetail() {
        return experienceDetail;
    }

    public void setExperienceDetail(ExperienceDetail experienceDetail) {
        this.experienceDetail = experienceDetail;
    }

    public EducationDetail getEducationDetail() {
        return educationDetail;
    }

    public void setEducationDetail(EducationDetail educationDetail) {
        this.educationDetail = educationDetail;
    }

    @Override
    public String toString() {
        return "JobSeeker{" +
                "currentSalary=" + currentSalary +
                ", isSalaryMonthly=" + isSalaryMonthly +
                ", currency='" + currency + '\'' +
                ", experienceDetail=" + experienceDetail +
                ", educationDetail=" + educationDetail +
                '}';
    }
}
