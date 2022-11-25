package com.wapmetal.portaria.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wapmetal.portaria.Models.EntradaMensalEntity;
import com.wapmetal.portaria.Repositories.EntradaMensalRepository;

@Service
public class EntradaMensalService {

	@Autowired
	private EntradaMensalRepository repository;

	public EntradaMensalEntity getById(Long id) {
		Optional<EntradaMensalEntity> entity = repository.findById(id);
		return entity.get();
	}

	public List<EntradaMensalEntity> getAll() {
		return repository.findAll();
	}

	public EntradaMensalEntity save(EntradaMensalEntity entity) {
		return repository.save(entity);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
}
