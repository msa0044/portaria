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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wapmetal.portaria.Models.Enuns.Setor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "funcionario")
@NoArgsConstructor
public class FuncionarioEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "funcionario")
    @JsonIgnore
    private List<EntradaEntity> entradas = new ArrayList<EntradaEntity>();

    private int cracha;
    private String nome;

    @OneToOne
    private Setor setor;

    private Calendar saldoDeHoras;

    public FuncionarioEntity(int cracha, String nome, Setor setor, Calendar saldoDeHoras) {
        this.cracha = cracha;
        this.nome = nome;
        this.setor = setor;
        this.saldoDeHoras = saldoDeHoras;
    }
}
