package com.wapmetal.portaria.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wapmetal.portaria.Models.EntradaEntity;

@Repository
public interface EntradaRepository extends JpaRepository<EntradaEntity, Long> {
}
