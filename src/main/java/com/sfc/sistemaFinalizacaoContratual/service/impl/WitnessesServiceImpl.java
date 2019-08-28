package com.sfc.sistemaFinalizacaoContratual.service.impl;

import com.sfc.sistemaFinalizacaoContratual.model.Witnesses;
import com.sfc.sistemaFinalizacaoContratual.repository.WitnessesRepository;
import com.sfc.sistemaFinalizacaoContratual.service.WitnessesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WitnessesServiceImpl implements WitnessesService {

    @Autowired
    WitnessesRepository witnessesRepository;

    @Override
    public List<Witnesses> retrieveWitnesses() {
        return witnessesRepository.findAll();
    }

    @Override
    public Witnesses getWitness(Long id) {
        return witnessesRepository.findById(id).get();
    }

    @Override
    public void saveWitness(Witnesses witnesses) {
        witnessesRepository.save(witnesses);
    }

    @Override
    public void updateWitness(Witnesses witnesses) {
        witnessesRepository.save(witnesses);
    }

    @Override
    public void deleteWitness(Long id) {
        witnessesRepository.deleteById(id);
    }
}
