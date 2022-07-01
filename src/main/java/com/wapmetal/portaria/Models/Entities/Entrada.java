package com.wapmetal.portaria.Models.Entities;

import java.util.Calendar;

import javax.persistence.Entity;

import com.wapmetal.portaria.Models.Enuns.Modalidade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Entrada {
    private Funcionario funcionario;
    private Calendar data;
    private Calendar entrada;
    private Calendar saida;
    private Calendar horas;
    private Modalidade modalidade;
    private Calendar entradaValidada;
    private Calendar saidaValidada;
    private Calendar horasValidadas;
    private String observacao;
}
