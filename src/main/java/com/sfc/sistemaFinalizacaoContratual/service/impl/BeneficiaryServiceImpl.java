package com.sfc.sistemaFinalizacaoContratual.service.impl;

import com.sfc.sistemaFinalizacaoContratual.model.Beneficiary;
import com.sfc.sistemaFinalizacaoContratual.repository.BeneficiaryRepository;
import com.sfc.sistemaFinalizacaoContratual.service.BeneficiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeneficiaryServiceImpl implements BeneficiaryService {

    @Autowired
    BeneficiaryRepository beneficiaryRepository;

    @Override
    public List<Beneficiary> retrieveBeneficiaries() {
        return beneficiaryRepository.findAll();
    }

    @Override
    public Beneficiary getBeneficiary(Long id) {
        return beneficiaryRepository.findById(id).get();
    }

    @Override
    public void saveBeneficiary(Beneficiary beneficiary) {
        beneficiaryRepository.save(beneficiary);
    }

    @Override
    public void updateBeneficiary(Beneficiary newBeneficiary) {
        beneficiaryRepository.save(newBeneficiary);
    }

    @Override
    public void deleteBeneficiary(Long id) {
        beneficiaryRepository.deleteById(id);
    }
}
