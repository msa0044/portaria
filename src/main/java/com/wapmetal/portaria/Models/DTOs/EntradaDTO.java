package com.wapmetal.portaria.Models.DTOs;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.wapmetal.portaria.Models.Entities.EntradaEntity;
import com.wapmetal.portaria.Models.Entities.FuncionarioEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @ToString @EqualsAndHashCode @AllArgsConstructor @NoArgsConstructor
public class EntradaDTO {

	private FuncionarioEntity funcionario = new FuncionarioEntity();
	private String modalidade;
	private String data;
	private String entradaPrevista;
	private String saidaPrevista;
	private String observacao;

	public EntradaEntity gerarEntradaEntity() throws ParseException{
		EntradaEntity entradaEntity = new EntradaEntity();
		entradaEntity.setFuncionario(funcionario);
		entradaEntity.setModalidade(modalidade);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");	
		entradaEntity.setData(sdf.parse(data));

		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		entradaEntity.setEntradaPrevista(sdf.parse(data + " " + entradaPrevista));
		entradaEntity.setSaidaPrevista(sdf.parse(data + " " + saidaPrevista));

		entradaEntity.setObservacao(observacao);
		
		return entradaEntity;
	}
}