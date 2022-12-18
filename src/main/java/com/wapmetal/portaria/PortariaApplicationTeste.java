package com.wapmetal.portaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.wapmetal.portaria.Models.Entities.EntradaEntity;
import com.wapmetal.portaria.Models.Entities.FuncionarioEntity;
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
	}
}
