package com.wapmetal.portaria.Models.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name = "funcionario")
public class FuncionarioEntity implements Serializable {

	private static final long serialVersionUID = 2148591701000377991L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "funcionario")
    @JsonIgnore
    private List<EntradaEntity> entradas = new ArrayList<EntradaEntity>();

    private int cracha;
    private String nome;

    private String setor;

    public FuncionarioEntity(int cracha, String nome, String setor) {
        this.cracha = cracha;
        this.nome = nome;
        this.setor = setor;
    }

	public FuncionarioEntity() {
	}

	@Override
	public String toString() {
		return "FuncionarioEntity [id=" + id + ", cracha=" + cracha + ", nome=" + nome
				+ ", setor=" + setor + "]";
	}
    
	
}
