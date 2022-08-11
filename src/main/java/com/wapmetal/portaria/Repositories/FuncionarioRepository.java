package com.wapmetal.portaria.Repositories;

import com.wapmetal.portaria.Models.Entities.FuncionarioEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {
}
