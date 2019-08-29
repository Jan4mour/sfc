package com.sfc.sistemaFinalizacaoContratual.controller;

import com.sfc.sistemaFinalizacaoContratual.model.Company;
import com.sfc.sistemaFinalizacaoContratual.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/all")
    public List<Company> getAllCompanies() {
        return companyService.retrieveCompanies();
    }

    @GetMapping("/{id}")
    public Company getCompany(@PathVariable(name = "id") Long id) {
        return companyService.getCompany(id);
    }

    @PostMapping("/add")
    public void addNewCompany(Company company) {
        companyService.saveCompany(company);
    }

    @PutMapping("{id}")
    public void updateWitnesses(@RequestBody Company company, @PathVariable(name = "id") Long id) {
        company.setId(id);

        if (company != null) {
            companyService.updateCompany(company);
        }
    }

    @DeleteMapping("{id}")
    public void deleteCompany(@PathVariable(name = "id") Long id) {
        companyService.deleteCompany(id);
    }
}
