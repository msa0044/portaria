package com.wapmetal.portaria.Models.Enuns;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wapmetal.portaria.Models.Entities.FuncionarioEntity;

@Entity
public enum Setor {
    FABRICA("Fábrica"),
    VENDAS("Vendas"),
    ALMOXARIFADO("Almoxarifado"),
    COMPRAS("Compras"),
    DEPARTAMENTO_PESSOAL("Departamento Pessoal"),
    ENGENHARIA("Engenharia"),
    ESTAMPARIA("Estamparia"),
    EXPEDICAO("Expedição"),
    FERRAMENTARIA("Ferramentaria"),
    FINANCEIRO("Financeiro"),
    LOGISTICA("Logística"),
    MANUTENCAO("Manutenção"),
    MOLAS("Molas"),
    QUALIDADE("Qualidade"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    SEGURANCA_DO_TRABALHO("Segurança do Trabalho"),
    TECNOLOGIA_DA_INFORMACAO("Tecnologia da Informação");

    @Id
    private Long id;

    @OneToOne(mappedBy = "setor")
    @JsonIgnore
    private FuncionarioEntity funcionario;

    private String nome;

    Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
