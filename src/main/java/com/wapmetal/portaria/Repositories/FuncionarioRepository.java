package com.wapmetal.portaria.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wapmetal.portaria.Models.Entities.FuncionarioEntity;

public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {
	
}
