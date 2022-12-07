package com.wapmetal.portaria.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wapmetal.portaria.Models.Entities.EntradaEntity;
import com.wapmetal.portaria.Repositories.EntradaRepository;

@Service
public class EntradaService {

	@Autowired
	private EntradaRepository repository;

	public EntradaEntity getById(Long id) {
		Optional<EntradaEntity> entity = repository.findById(id);
		return entity.get();
	}

	public List<EntradaEntity> getAll() {
		return repository.findAll();
	}

	public EntradaEntity save(EntradaEntity entity) {
		return repository.save(entity);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
}
