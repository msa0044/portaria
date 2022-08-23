package com.wapmetal.portaria.Repositories;

import com.wapmetal.portaria.Models.Entities.FuncionarioEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {  
	public FuncionarioEntity findOneByCracha(Long cracha);
	public FuncionarioEntity findOneByNome(String nome);
	public FuncionarioEntity findOneBySetor(String setor);
	public List<FuncionarioEntity> findAllByCracha();
	public List<FuncionarioEntity> findAllByNome();
	public List<FuncionarioEntity> findAllBySetor();
}
