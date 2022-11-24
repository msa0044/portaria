package com.wapmetal.portaria.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wapmetal.portaria.Models.EntradaMensalEntity;

@Repository
public interface EntradaMensalRepository extends JpaRepository<EntradaMensalEntity, Long> {
}
