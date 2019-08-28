package com.sfc.sistemaFinalizacaoContratual.controller;

import com.sfc.sistemaFinalizacaoContratual.model.Witnesses;
import com.sfc.sistemaFinalizacaoContratual.service.WitnessesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("witnesses")
public class WitnessesController {
    @Autowired
    private WitnessesService witnessesService;

    @GetMapping("/all")
    public List<Witnesses> getAllWitnesses() {
        return witnessesService.retrieveWitnesses();
    }

    @GetMapping("/{id}")
    public Witnesses getWitnesses(@PathVariable(name = "id") Long id) {
        return witnessesService.getWitness(id);
    }

    @PostMapping("/add")
    public void addNewWitnesses(Witnesses witnesses) {
        witnessesService.saveWitness(witnesses);
    }

    @PutMapping("{id}")
    public void updateWitnesses(@RequestBody Witnesses witnesses, @PathVariable(name = "id") Long id) {
        witnesses.setId(id);

        if (witnesses != null) {
            witnessesService.updateWitness(witnesses);
        }
    }

    @PatchMapping("{id}/{cpf}")
    public void updateCPFWitnesses(@PathVariable(name = "id") Long id,
                                @PathVariable(name = "cpf") String cpf) {

        Witnesses witnesses = witnessesService.getWitness(id);
        witnesses.setCpfTestemunha(cpf);

        witnessesService.updateWitness(witnesses);
    }

    @DeleteMapping("{id}")
    public void deleteWitnesses(@PathVariable(name = "id") Long id) {
        witnessesService.deleteWitness(id);
    }

}
