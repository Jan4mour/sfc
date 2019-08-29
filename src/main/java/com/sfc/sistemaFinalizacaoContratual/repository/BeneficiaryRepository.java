package com.sfc.sistemaFinalizacaoContratual.repository;

import com.sfc.sistemaFinalizacaoContratual.model.Beneficiary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {
}
