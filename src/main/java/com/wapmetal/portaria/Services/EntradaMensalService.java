package com.wapmetal.portaria.Services;

import java.util.List;
import java.util.Optional;

import com.wapmetal.portaria.Models.Entities.EntradaMensalEntity;
import com.wapmetal.portaria.Repositories.EntradaMensalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntradaMensalService {

	@Autowired
	private EntradaMensalRepository repository;

	public EntradaMensalEntity getOne(Long id) {
		Optional<EntradaMensalEntity> entity = repository.findById(id);
		System.out.println(entity.get().toString());
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
