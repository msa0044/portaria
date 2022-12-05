package com.wapmetal.portaria.Models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "entrada")
public class EntradaEntity implements Serializable {

	
	private static final long serialVersionUID = 7640012596490318925L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne //(cascade = CascadeType.PERSIST)
	private FuncionarioEntity funcionario = new FuncionarioEntity();

	private String modalidade;
	
	private Date data;

	@Column (name = "entrada_prevista")
	private Date entradaPrevista;
	@Column (name = "saida_prevista")
	private Date saidaPrevista;

	private String observacao;

	@Column (name = "horas_previstas")
	private Date horasPrevistas;
	@Column (name = "entrada_validada")
	private Date entradaValidada;
	@Column (name = "saida_validada")
	private Date saidaValidada;
	@Column (name = "horas_validadas")
	private Date horasValidadas;

	public EntradaEntity(FuncionarioEntity funcionario, String modalidade, Date data, Date entradaPrevista,
			Date saidaPrevista, String observacao) {
		this.funcionario = funcionario;
		this.modalidade = modalidade;
		this.data = data;
		this.entradaPrevista = entradaPrevista;
		this.saidaPrevista = saidaPrevista;
		this.observacao = observacao;
	}
}
