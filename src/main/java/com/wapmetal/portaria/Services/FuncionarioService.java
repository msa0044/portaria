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

	public FuncionarioEntity getOne(Long id) {
		Optional<FuncionarioEntity> entity = repository.findById(id);
		System.out.println(entity.get().toString());
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
