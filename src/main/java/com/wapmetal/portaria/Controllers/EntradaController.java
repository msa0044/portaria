package com.wapmetal.portaria.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/entrada")
public class EntradaController {

    /*
    @Autowired
    private EntradaService service;

    //pegar um
    @GetMapping(value = "/get/id/{id}")
    public ResponseEntity<EntradaEntity> getById(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.getById(id));
    }
    
    //pegar todos
    @GetMapping(value = "/get/all")
    public ResponseEntity<List<EntradaEntity>> getAll() {
        return ResponseEntity.ok().body(service.getAll());
    }

    //salvar
    @PostMapping(value = "txt",consumes = "application/x-www-form-urlencoded")
    public ResponseEntity<EntradaEntity> saveTxt(EntradaEntity entity) {
        return ResponseEntity.ok().body(service.save(entity));
    }
    
    //salvar
    @PostMapping(value = "json",consumes = "application/json")
    public ResponseEntity<EntradaEntity> saveJson(@RequestBody EntradaEntity entity) {
        return ResponseEntity.ok().body(service.save(entity));
    }
    
    //CRIAR METODO PUT


    //excluir
    @DeleteMapping(value = "delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id){
    	service.delete(id);
    	return ResponseEntity.noContent().build();
    }
    */
}
