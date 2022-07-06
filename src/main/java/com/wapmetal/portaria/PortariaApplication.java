package com.wapmetal.portaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wapmetal.portaria.Models.Entities.Funcionario;

@SpringBootApplication
public class PortariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortariaApplication.class, args);

		Funcionario f = new Funcionario();
	}

}
