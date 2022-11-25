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

import com.wapmetal.portaria.Models.FuncionarioEntity;
import com.wapmetal.portaria.Services.FuncionarioService;

@RestController
@RequestMapping(value = "/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    //pegar um
    @GetMapping(value = "/get/{id}")
    public ResponseEntity<FuncionarioEntity> getById(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.getById(id));
    }
    
    //pegar todos
    @GetMapping(value = "/get/all")
    public ResponseEntity<List<FuncionarioEntity>> getAll() {
        return ResponseEntity.ok().body(service.getAll());
    }
    
  //salvar
    @PostMapping(consumes = "application/json")
    public ResponseEntity<FuncionarioEntity> saveJson(@RequestBody FuncionarioEntity entity) {
        return ResponseEntity.ok().body(service.save(entity));
    }


    //excluir
    @DeleteMapping(value = "delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id){
    	service.delete(id);
    	return ResponseEntity.noContent().build();
    }
}
