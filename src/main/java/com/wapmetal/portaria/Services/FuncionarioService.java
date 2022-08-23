package com.wapmetal.portaria.Services;

import java.util.List;
import java.util.Optional;

import com.wapmetal.portaria.Models.Entities.FuncionarioEntity;
import com.wapmetal.portaria.Repositories.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repository;
	
	/*
	public List<FuncionarioEntity> findOneByCracha(Long cracha);
	public List<FuncionarioEntity> findAllByCracha(Long cracha);
	public List<FuncionarioEntity> findOneByNome(String nome);
	public List<FuncionarioEntity> findAllByNome(String nome);
	public List<FuncionarioEntity> findOneBySetor(String setor);
	public List<FuncionarioEntity> findAllBySetor(String setor);
	*/

	public FuncionarioEntity getOneByCracha(Long cracha) {
		return repository.findOneByCracha(cracha);
	}

	public FuncionarioEntity getOneByNome(String nome) {
		return repository.findOneByNome(nome);
	}
	
	public FuncionarioEntity getOneBySetor(String setor) {
		return repository.findOneBySetor(setor);
	}

	public List<FuncionarioEntity> getAllByCracha() {
		return repository.findAllByCracha();
	}

	public List<FuncionarioEntity> getAllByNome() {
		return repository.findAllByNome();
	}

	public List<FuncionarioEntity> getAllBySetor() {
		return repository.findAllByCracha();
	}
	
	public FuncionarioEntity getById(Long id) {
		Optional<FuncionarioEntity> entity = repository.findById(id);
		return entity.get();
	}

	public List<FuncionarioEntity> getAll() {
		return repository.findAll();
	}

	public FuncionarioEntity save(FuncionarioEntity entity) {
		return repository.save(entity);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
}
