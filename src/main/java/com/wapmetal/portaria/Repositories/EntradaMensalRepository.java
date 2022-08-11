package com.wapmetal.portaria.Repositories;

import com.wapmetal.portaria.Models.Entities.EntradaMensalEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntradaMensalRepository extends JpaRepository<EntradaMensalEntity, Long> {
}
