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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wapmetal.portaria.Models.Entities.FuncionarioEntity;
import com.wapmetal.portaria.Services.FuncionarioService;

@RestController
@RequestMapping(value = "/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    //pegar um
    @GetMapping(value = "/get/id/{id}")
    public ResponseEntity<FuncionarioEntity> getOneById(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.getById(id));
    }

    //pegar por nome
    @GetMapping(value = "/get/nome")
    public ResponseEntity<List<FuncionarioEntity>> getByNome(@RequestParam (value = "nome", defaultValue = "") String txt) {
    	txt = Decoder.convert(txt);
        return ResponseEntity.ok().body(service.getByNome(txt));
    }

    //pegar por setor
    @GetMapping(value = "/get/setor")
    public ResponseEntity<List<FuncionarioEntity>> getBySetor(@RequestParam (value = "setor", defaultValue = "") String txt) {
    	txt = Decoder.convert(txt);
        return ResponseEntity.ok().body(service.getBySetor(txt));
    }

    //pegar todos
    @GetMapping(value = "/get/all")
    public ResponseEntity<List<FuncionarioEntity>> getAll() {
    	System.out.println("----------------------->"+service.getAll()+"<---------------------------");
        return ResponseEntity.ok().body(service.getAll());
    }

    //salvar
    @PostMapping(consumes = "application/json")
    public ResponseEntity<FuncionarioEntity> save(@RequestBody FuncionarioEntity entity) {
        return ResponseEntity.ok().body(service.save(entity));
    }

    //excluir
    @DeleteMapping(value = "delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id){
    	return ResponseEntity.noContent().build();
    }
}
