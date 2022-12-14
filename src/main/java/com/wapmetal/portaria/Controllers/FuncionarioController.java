package com.wapmetal.portaria.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    //pegar um
    @GetMapping(value = "/get/{id}")
    public ResponseEntity<FuncionarioEntity> getById(@PathVariable Long id) {
        return new ResponseEntity<FuncionarioEntity>(service.getById(id), HttpStatus.OK);
    }
    
    //pegar todos
    @GetMapping(value = "/get/all")
    public ResponseEntity<List<FuncionarioEntity>> getAll() {
        return new ResponseEntity<List<FuncionarioEntity>>(service.getAll(), HttpStatus.OK);
    }
    
  //salvar
    @PostMapping(consumes = "application/json")
    public ResponseEntity<FuncionarioEntity> saveJson(@RequestBody FuncionarioEntity entity) {
        return new ResponseEntity<FuncionarioEntity>(service.save(entity), HttpStatus.CREATED);
    }

    //excluir
    @DeleteMapping(value = "delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id){
    	service.delete(id);
    	return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
    }
}
