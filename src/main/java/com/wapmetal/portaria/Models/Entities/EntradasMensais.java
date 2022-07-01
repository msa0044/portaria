package com.wapmetal.portaria.Models.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class EntradasMensais {
    private List<Entrada> entradas = new ArrayList<Entrada>();
}
