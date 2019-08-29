package com.sfc.sistemaFinalizacaoContratual.service;

import com.sfc.sistemaFinalizacaoContratual.model.Beneficiary;

import java.util.List;

public interface BeneficiaryService {
    List<Beneficiary> retrieveBeneficiaries();

    Beneficiary getBeneficiary(Long id);

    void saveBeneficiary(Beneficiary beneficiary);

    void updateBeneficiary(Beneficiary newBeneficiary);

    void deleteBeneficiary(Long id);
}
