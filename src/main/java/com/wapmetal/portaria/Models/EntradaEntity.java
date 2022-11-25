package com.wapmetal.portaria.Models;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor @NoArgsConstructor
@Table(name = "entrada")
public class EntradaEntity implements Serializable {

	private static final long serialVersionUID = 7640012596490318925L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String modalidade;
	private Calendar data;

	@ManyToOne
	private FuncionarioEntity funcionario = new FuncionarioEntity();

	@Column (name = "entrada_prevista")
	private Calendar entradaPrevista;
	@Column (name = "saida_prevista")
	private Calendar saidaPrevista;
	private String observacao;
	@Column (name = "horas_previstas")
	private Calendar horasPrevistas;
	@Column (name = "entrada_validada")
	private Calendar entradaValidada;
	@Column (name = "saida_validada")
	private Calendar saidaValidada;
	@Column (name = "horas_validadas")
	private Calendar horasValidadas;
}
