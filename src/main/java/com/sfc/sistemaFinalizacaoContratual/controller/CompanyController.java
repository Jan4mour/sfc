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

    @PutMapping("update/{id}")
    public void updateCompany(@RequestBody Company company, @PathVariable(name = "id") Long id) {
        Company comp = companyService.getCompany(id);
        if (comp!=null){
            companyService.updateCompany(company);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCompany(@PathVariable(name = "id") Long id) {
        companyService.deleteCompany(id);
    }
}
