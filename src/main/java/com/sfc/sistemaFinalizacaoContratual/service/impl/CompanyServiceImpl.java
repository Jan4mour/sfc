package com.sfc.sistemaFinalizacaoContratual.service.impl;

import com.sfc.sistemaFinalizacaoContratual.model.Company;
import com.sfc.sistemaFinalizacaoContratual.repository.CompanyRepository;
import com.sfc.sistemaFinalizacaoContratual.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public List<Company> retrieveCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company getCompany(Long id) {
        Optional<Company> optCompany = companyRepository.findById(id);
        return optCompany.get();
    }

    @Override
    public void saveCompany(Company user) {
        companyRepository.save(user);
    }

    @Override
    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }

    @Override
    public void updateCompany(Company company) {
        companyRepository.save(company);
    }
}
