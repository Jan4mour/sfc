package com.sfc.sistemaFinalizacaoContratual.repository;

import com.sfc.sistemaFinalizacaoContratual.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
