package com.example.jobsearchsiteproject.services;

import com.example.jobsearchsiteproject.dto.CompanyDTO;
import com.example.jobsearchsiteproject.dto.EducationDetailDTO;
import com.example.jobsearchsiteproject.exception.EntityNotFoundException;
import com.example.jobsearchsiteproject.map.CompanyMapper;
import com.example.jobsearchsiteproject.map.EducationDetailMapper;
import com.example.jobsearchsiteproject.model.Company;
import com.example.jobsearchsiteproject.model.EducationDetail;
import com.example.jobsearchsiteproject.repository.CompanyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getALlCompanies() {
        List<Company> allCompanies = companyRepository.findAll();
        return allCompanies;
    }

    public Company getById(Long id) {
        Optional<Company> byId = companyRepository.findById(id);
        return byId.orElseThrow(() -> {
            log.error("Company not found by id : " + id);
            return new EntityNotFoundException("Company", "id : " + id);
        });
    }

    public Company create(CompanyDTO companyDTO) {
        Company company = CompanyMapper.toEntity(companyDTO);
        return companyRepository.save(company);
    }

    public void delete(Long id) {
        getById(id);
        companyRepository.deleteById(id);
    }
}
