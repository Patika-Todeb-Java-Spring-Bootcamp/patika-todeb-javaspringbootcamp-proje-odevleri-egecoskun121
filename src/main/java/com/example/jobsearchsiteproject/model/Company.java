package com.example.jobsearchsiteproject.model;


import java.util.Date;

public class Company extends BaseEntity {


    private String companyName;
    private String profileDescription;
    private Date foundationYear;
    private String companyURL;

    public Company(String companyName, String profileDescription, Date foundationYear, String companyURL) {
        this.companyName = companyName;
        this.profileDescription = profileDescription;
        this.foundationYear = foundationYear;
        this.companyURL = companyURL;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProfileDescription() {
        return profileDescription;
    }

    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }

    public Date getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(Date foundationYear) {
        this.foundationYear = foundationYear;
    }

    public String getCompanyURL() {
        return companyURL;
    }

    public void setCompanyURL(String companyURL) {
        this.companyURL = companyURL;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", profileDescription='" + profileDescription + '\'' +
                ", foundationYear=" + foundationYear +
                ", companyURL='" + companyURL + '\'' +
                '}';
    }
}
