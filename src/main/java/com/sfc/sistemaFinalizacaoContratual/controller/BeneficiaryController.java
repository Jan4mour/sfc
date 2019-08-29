package com.sfc.sistemaFinalizacaoContratual.controller;

import com.sfc.sistemaFinalizacaoContratual.model.Beneficiary;
import com.sfc.sistemaFinalizacaoContratual.service.BeneficiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beneficiaries")
public class BeneficiaryController {
    @Autowired
    BeneficiaryService beneficiaryService;

    @GetMapping("/all")
    public List<Beneficiary> getAllBeneficiaries() {
        List<Beneficiary> beneficiaries = beneficiaryService.retrieveBeneficiaries();
        return beneficiaries;
    }

    @GetMapping("/{id}")
    public Beneficiary getBeneficiary(@PathVariable(name = "id") Long id) {
        return beneficiaryService.getBeneficiary(id);
    }

    @PostMapping("/add")
    public void addNewBeneficiary(Beneficiary beneficiary) {
        beneficiaryService.saveBeneficiary(beneficiary);
    }

    @PutMapping("{id}")
    public void updateBeneficiary(@RequestBody Beneficiary newBeneficiary, @PathVariable(name = "id") Long id) {
        newBeneficiary.setId(id);

        if (newBeneficiary != null) {
            beneficiaryService.updateBeneficiary(newBeneficiary);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBeneficiary(@PathVariable(name = "id") Long id) {
        beneficiaryService.deleteBeneficiary(id);
    }

}
