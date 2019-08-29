package com.sfc.sistemaFinalizacaoContratual.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String categoria;
    private String horas;
    private String preco;

//    public Servicos() {
//    }
//
//    public Servicos(String idServico, String nome, String categoria, String horas, String preco) {
//        this.idServico = idServico;
//        this.nome = nome;
//        this.categoria = categoria;
//        this.horas = horas;
//        this.preco = preco;
//    }

//    public String getIdServico() {
//        return idServico;
//    }
//
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
