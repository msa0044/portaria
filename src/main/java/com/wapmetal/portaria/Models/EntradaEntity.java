package com.wapmetal.portaria.Models;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Getter
@Table(name = "entradas")
public class EntradaEntity implements Serializable {

	private static final long serialVersionUID = 7640012596490318925L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JsonIgnore
	private EntradaMensalEntity entradaMensal = new EntradaMensalEntity();
	
	private Calendar data;

	@ManyToOne
	private FuncionarioEntity funcionario = new FuncionarioEntity();

	private Calendar entradaEsperada;
	private Calendar saidaEsperada;
	private Calendar horasEsperadas;

	private String modalidade;

	private Calendar entradaValidada;
	private Calendar saidaValidada;
	private Calendar horasValidadas;
	private String observacao;
	
	public EntradaEntity(FuncionarioEntity funcionario, Calendar data, Calendar entrada, Calendar saida, String modalidade) {
		this.funcionario = funcionario;
		this.data = data;
		this.entradaEsperada = entrada;
		this.saidaEsperada = saida;
		this.modalidade = modalidade;
	}

	public void validar(Calendar entradaValidada,
			Calendar saidaValidada, String observacao) {
		this.entradaValidada = entradaValidada;
		this.saidaValidada = saidaValidada;
		this.observacao = observacao;
	}
}
