package com.wapmetal.portaria.Repositories;

import com.wapmetal.portaria.Models.Entities.EntradaEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntradaRepository extends JpaRepository<EntradaEntity, Long> {
}
