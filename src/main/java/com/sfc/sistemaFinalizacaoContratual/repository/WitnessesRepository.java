package com.sfc.sistemaFinalizacaoContratual.repository;

import com.sfc.sistemaFinalizacaoContratual.model.Witnesses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WitnessesRepository extends JpaRepository<Witnesses, Long> {
}
