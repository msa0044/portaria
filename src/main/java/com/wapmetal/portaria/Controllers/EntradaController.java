package com.wapmetal.portaria.Controllers;

import java.text.ParseException;
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

import com.wapmetal.portaria.Models.DTOs.EntradaDTO;
import com.wapmetal.portaria.Models.Entities.EntradaEntity;
import com.wapmetal.portaria.Services.EntradaService;

@RestController
@RequestMapping(value = "/entrada")
public class EntradaController {

    @Autowired
    private EntradaService service;

    //pegar um
    @GetMapping(value = "/get/{id}")
    public ResponseEntity<EntradaEntity> getById(@PathVariable Long id) {
        return new ResponseEntity<EntradaEntity>(service.getById(id), HttpStatus.OK);
    }
    
    //pegar todos
    @GetMapping(value = "/get/all")
    public ResponseEntity<List<EntradaEntity>> getAll() {
        return new ResponseEntity<List<EntradaEntity>>(service.getAll(), HttpStatus.OK);
    }
    
    //salvar
    @PostMapping(consumes = "application/json")
    public ResponseEntity<EntradaEntity> saveJson(@RequestBody EntradaDTO entity) throws ParseException {
        System.out.println(entity.toString());
        return new ResponseEntity<EntradaEntity>(service.save(entity.gerarEntradaEntity()), HttpStatus.CREATED);
    }

    //excluir
    @DeleteMapping(value = "delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id){
    	service.delete(id);
    	return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
    }
}
