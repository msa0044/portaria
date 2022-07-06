package com.wapmetal.portaria.Models.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wapmetal.portaria.Models.Enuns.Setor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "funcionario")
    @JsonIgnore
    private List<Entrada> entradas = new ArrayList<Entrada>();

    private int cracha;
    private String nome;
    private Setor setor;
    private Calendar saldoDeHoras;

    public Funcionario(List<Entrada> entradas, int cracha, String nome, Setor setor, Calendar saldoDeHoras) {
        this.entradas = entradas;
        this.cracha = cracha;
        this.nome = nome;
        this.setor = setor;
        this.saldoDeHoras = saldoDeHoras;
    }
}
