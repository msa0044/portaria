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

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class EntradasMensais implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Calendar data;

    @OneToMany(mappedBy = "entradaMensal")
    private List<Entrada> entradas = new ArrayList<Entrada>();

    public EntradasMensais(Calendar data, List<Entrada> entradas) {
        this.data = data;
        this.entradas = entradas;
    }
}
