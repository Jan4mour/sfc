package com.sfc.sistemaFinalizacaoContratual.repository;

import com.sfc.sistemaFinalizacaoContratual.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
