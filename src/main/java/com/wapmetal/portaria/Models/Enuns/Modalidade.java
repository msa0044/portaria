package com.wapmetal.portaria.Models.Enuns;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wapmetal.portaria.Models.Entities.EntradaEntity;

@Entity
public enum Modalidade {

    BANCO_DE_HORAS("Banco de Horas"),
    HORA_EXTRA("Hora Extra"),
    TROCA_DE_TURNO("Troca de turno");

    @Id
    private Long id;

    @OneToOne(mappedBy = "modalidade")
    @JsonIgnore
    private EntradaEntity entrada;

    private String tipo;

    Modalidade(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }
}
