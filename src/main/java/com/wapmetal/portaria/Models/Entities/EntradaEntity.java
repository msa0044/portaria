package com.wapmetal.portaria.Models.Entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wapmetal.portaria.Models.Enuns.Modalidade;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "entradas")
@NoArgsConstructor
public class EntradaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private FuncionarioEntity funcionario;

    @ManyToOne
    @JsonIgnore
    private EntradasMensaisEntity entradaMensal = new EntradasMensaisEntity();

    private Calendar data;
    private Calendar entrada;
    private Calendar saida;
    private Calendar horas;

    @OneToOne
    private Modalidade modalidade;

    private Calendar entradaValidada;
    private Calendar saidaValidada;
    private Calendar horasValidadas;
    private String observacao;
    
    public EntradaEntity(FuncionarioEntity funcionario, EntradasMensaisEntity entradaMensal, Calendar data, Calendar entrada,
            Calendar saida, Calendar horas, Modalidade modalidade, Calendar entradaValidada, Calendar saidaValidada,
            Calendar horasValidadas, String observacao) {
        this.funcionario = funcionario;
        this.entradaMensal = entradaMensal;
        this.data = data;
        this.entrada = entrada;
        this.saida = saida;
        this.horas = horas;
        this.modalidade = modalidade;
        this.entradaValidada = entradaValidada;
        this.saidaValidada = saidaValidada;
        this.horasValidadas = horasValidadas;
        this.observacao = observacao;
    }
}
