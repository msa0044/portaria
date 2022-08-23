package com.wapmetal.portaria.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wapmetal.portaria.Models.Entities.FuncionarioEntity;
import com.wapmetal.portaria.Services.FuncionarioService;

@RestController
@RequestMapping(value = "/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @GetMapping(value = "/get/id/{id}")
    public ResponseEntity<FuncionarioEntity> getOneById(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.getById(id));
    }
    
    @GetMapping(value = "/get/cracha/{cracha}")
    public ResponseEntity<FuncionarioEntity> getOneByCracha(@PathVariable Long cracha) {
        return ResponseEntity.ok().body(service.getOneByCracha(cracha));
    }

    @GetMapping(value = "/get/cracha/all")
    public ResponseEntity<List<FuncionarioEntity>> getAllByCracha() {
        return ResponseEntity.ok().body(service.getAllByCracha());
    }

    @GetMapping(value = "/get/all")
    public ResponseEntity<List<FuncionarioEntity>> getAll() {
        return ResponseEntity.ok().body(service.getAll());
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<FuncionarioEntity> save(@RequestBody FuncionarioEntity entity) {
        return ResponseEntity.ok().body(service.save(entity));
    }

    @DeleteMapping(value = "delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id){
    	return ResponseEntity.noContent().build();
    }
}
