package com.example.jobsearchsiteproject.services;

import com.example.jobsearchsiteproject.model.Company;
import com.example.jobsearchsiteproject.model.JobPost;
import com.example.jobsearchsiteproject.repository.CompanyRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CompanyServiceTest {

    @Mock
    private CompanyRepository companyRepository;

    @InjectMocks CompanyService companyService;



    @Test
    void getALlCompanies() {

        List<Company> companyDB = new ArrayList<>();

        Company company = new Company(1L,"Univera","Software Company",1984,"univera.com", null);
        Company company2 = new Company(2L,"Univerlist","Software Company",1985,"univerList.com", null);
        Company company3 = new Company(3L,"UniverKa","Software Company",1986,"univerKa.com", null);

        companyDB.add(company);
        companyDB.add(company2);
        companyDB.add(company3);

        Mockito.when(companyRepository.findAll()).thenReturn(companyDB);

        List<Company> actualCompanyList = companyService.getALlCompanies();

        Assert.assertEquals(actualCompanyList.size(),companyDB.size());
        companyDB=companyDB.stream().sorted(getCompanyComparator()).collect(Collectors.toList());
        actualCompanyList=actualCompanyList.stream().sorted(getCompanyComparator()).collect(Collectors.toList());

        for(int i=0;i<companyDB.size();i++){
            Company expectedCompany = companyDB.get(i);
            Company actualCompany = actualCompanyList.get(i);
            Assert.assertEquals(actualCompany.getId(),expectedCompany.getId());
            Assert.assertEquals(actualCompany.getCompanyName(),expectedCompany.getCompanyName());
            Assert.assertEquals(actualCompany.getCompanyURL(),expectedCompany.getCompanyURL());
            Assert.assertEquals(actualCompany.getFoundationYear(),expectedCompany.getFoundationYear());
            Assert.assertEquals(actualCompany.getProfileDescription(),expectedCompany.getProfileDescription());
        }

    }

    private Comparator<Company> getCompanyComparator() {
        return (o1, o2) -> {
            if (o1.getId() - o2.getId() < 0)
                return -1;

            if (o1.getId() - o2.getId() == 0)
                return 0;
            return -1;
        };
    }

    @Test
    void getById() {
        Company expectedCompany = getExpectedCompany().get(1);
        Optional<Company> optExpectedCompany = Optional.of(expectedCompany);

        Mockito.when(companyRepository.findById(Mockito.any())).thenReturn(optExpectedCompany);

        Company actualCompany = companyService.getById(1L);

        Assert.assertEquals(actualCompany.getId(),expectedCompany.getId());
        Assert.assertEquals(actualCompany.getCompanyName(),expectedCompany.getCompanyName());
    }

    private List<Company> getExpectedCompany(){

        List<Company> companyDB = new ArrayList<>();

        Company company = new Company(1L,"Univera","Software Company",1984,"univera.com", null);
        Company company2 = new Company(2L,"Univerlist","Software Company",1985,"univerList.com", null);
        Company company3 = new Company(3L,"UniverKa","Software Company",1986,"univerKa.com", null);

        companyDB.add(company);
        companyDB.add(company2);
        companyDB.add(company3);

        return companyDB;
    }

    @Test
    void create() {
    }

    @Test
    void delete() {
    }
}