package com.wapmetal.portaria.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wapmetal.portaria.Models.Entities.EntradaEntity;
public interface EntradaRepository extends JpaRepository<EntradaEntity, Long> {
}
