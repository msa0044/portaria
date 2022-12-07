package com.wapmetal.portaria.Models.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode
@Table(name = "funcionario")
public class FuncionarioEntity implements Serializable {

	private static final long serialVersionUID = 2148591701000377991L;

    @Id
    private Long cracha;
    private String nome;
    private String setor;
}
