package com.wapmetal.portaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.wapmetal.portaria.Models.EntradaEntity;
import com.wapmetal.portaria.Models.FuncionarioEntity;
import com.wapmetal.portaria.Services.EntradaService;
import com.wapmetal.portaria.Services.FuncionarioService;

@Configuration
public class PortariaApplicationTeste implements CommandLineRunner {

	@Autowired
	private FuncionarioService fs;

	@Autowired
	private EntradaService es;

	@Override
	public void run(String... args) throws Exception {
		FuncionarioEntity f = new FuncionarioEntity(1L, "Marcos", "Vendas");
		fs.save(f);
		EntradaEntity e = new EntradaEntity();
		e.setFuncionario(f);
		es.save(e);
	}
}
