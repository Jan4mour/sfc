package com.sfc.sistemaFinalizacaoContratual.service;

import com.sfc.sistemaFinalizacaoContratual.model.Company;

import java.util.List;

public interface CompanyService {
    public List<Company> retrieveCompanies();

    public Company getCompany(Long id);

    public void saveCompany(Company user);

    public void deleteCompany(Long id);

    public void updateCompany(Company company);

}
