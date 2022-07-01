package com.wapmetal.portaria.Models.Enuns;

public enum Modalidade {
    BANCO_DE_HORAS("Banco de Horas"),
    HORA_EXTRA("Hora Extra"),
    TROCA_DE_TURNO("Troca de turno");

    private String tipo;

    Modalidade(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }
}
