package com.sfc.sistemaFinalizacaoContratual.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Jana on 14/07/2017.
 */
@Entity
public class Witnesses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeTestemunha;
    private String cpfTestemunha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeTestemunha() {
        return nomeTestemunha;
    }

    public void setNomeTestemunha(String nomeTestemunha) {
        this.nomeTestemunha = nomeTestemunha;
    }

    public String getCpfTestemunha() {
        return cpfTestemunha;
    }

    public void setCpfTestemunha(String cpfTestemunha) {
        this.cpfTestemunha = cpfTestemunha;
    }
}
