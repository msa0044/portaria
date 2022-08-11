package com.wapmetal.portaria.Models.Entities;

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

@Entity
@Data
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

	private Calendar entrada;
	private Calendar saida;
	private Calendar horas;

	private String modalidade;

	private Calendar entradaValidada;
	private Calendar saidaValidada;
	private Calendar horasValidadas;
	private String observacao;

	public EntradaEntity(FuncionarioEntity funcionario, Calendar data,
			Calendar entrada, Calendar saida, Calendar horas, String modalidade, Calendar entradaValidada,
			Calendar saidaValidada, Calendar horasValidadas, String observacao) {
		this.funcionario = funcionario;
		this.data = data;
		this.entrada = entrada;
		this.saida = saida;
		this.horas = horas;
		this.modalidade = modalidade;
		this.entradaValidada = entradaValidada;
		this.saidaValidada = saidaValidada;
		this.horasValidadas = horasValidadas;
		this.observacao = observacao;
	}
}
