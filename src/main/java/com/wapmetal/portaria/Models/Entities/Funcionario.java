package com.wapmetal.portaria.Models.Entities;

import java.util.Calendar;

import javax.persistence.Entity;

import com.wapmetal.portaria.Models.Enuns.Setor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Funcionario {
    private int crachaId;
    private int cracha;
    private String Nome;
    private Setor setor;
    private Calendar saldoDeHoras;
}
