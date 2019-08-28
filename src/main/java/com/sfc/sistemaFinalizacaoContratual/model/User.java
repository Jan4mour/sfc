package com.sfc.sistemaFinalizacaoContratual.model;

import java.util.Map;

import javax.persistence.*;

/**
 * Created by Jana on 20/06/2017.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String gender;
    private String birthDate;
//    private Beneficiario beneficiario ;
//    private Testemunhas testemunha;
    private String cpf;
    private String rg;
    private String adress;
    private String number;
    private String complemento;
    private String bairro;
    private String city;
    private String uf;
    private String cep;
    private String phone;
    private String cellphone;
    private String email;
    private String password;
//    private Map<String, UserModel> user;

//    @Column(name = "USER_NAME", nullable = true, length = 255)
//    private String name;

//    @Column(name = "USER_SALARY", nullable = true, length = 10)
//    private Integer salary;

//    protected UserModel() {
//    }

//    public UserModel(String name, String rg) {
//        this.name = name;
//        this.rg = rg;
//    }

//    public void salvar() {
//        DatabaseReference referenciaFirebase = ConfiguracaoFirebase.getFirebase();
//        referenciaFirebase.child("Usuários").child(String.valueOf(getId())).setValue(this);
//    }

//    public Map<String, UserModel> getUser() {
//        return user;
//    }
//
//    public void setUser(Map<String, UserModel> user) {
//        this.user = user;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

//    public Beneficiario getBeneficiario() {
//        return beneficiario;
//    }
//
//    public void setBeneficiario(Beneficiario beneficiario) {
//        this.beneficiario = beneficiario;
//    }
//
//    public Testemunhas getTestemunha() {
//        return testemunha;
//    }
//
//    public void setTestemunha(Testemunhas testemunha) {
//        this.testemunha = testemunha;
//    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

