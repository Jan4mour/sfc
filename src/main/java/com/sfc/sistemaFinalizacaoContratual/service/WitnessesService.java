package com.sfc.sistemaFinalizacaoContratual.service;

import com.sfc.sistemaFinalizacaoContratual.model.Witnesses;

import java.util.List;

public interface WitnessesService {
    List<Witnesses> retrieveWitnesses();

    Witnesses getWitness(Long id);

    void saveWitness(Witnesses user);

    void updateWitness( Witnesses userModel);

    void deleteWitness(Long id);
}
