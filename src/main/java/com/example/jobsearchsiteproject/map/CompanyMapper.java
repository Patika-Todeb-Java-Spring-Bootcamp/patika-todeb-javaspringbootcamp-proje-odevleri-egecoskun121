package com.example.jobsearchsiteproject.map;

import com.example.jobsearchsiteproject.dto.CompanyDTO;
import com.example.jobsearchsiteproject.model.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyMapper {
    public static CompanyDTO toDTO(Company company){

        CompanyDTO companyDTO = new CompanyDTO();
        companyDTO.setCompanyURL(company.getCompanyURL());
        companyDTO.setCompanyName(company.getCompanyName());
        companyDTO.setFoundationYear(company.getFoundationYear());
        companyDTO.setProfileDescription(company.getProfileDescription());

        return companyDTO;
    }

    public static Company toEntity(CompanyDTO companyDTO){

        Company company= new Company();
        company.setCompanyURL(companyDTO.getCompanyURL());
        company.setCompanyName(companyDTO.getCompanyName());
        company.setFoundationYear(companyDTO.getFoundationYear());
        company.setProfileDescription(companyDTO.getProfileDescription());

        return company;
    }
}
