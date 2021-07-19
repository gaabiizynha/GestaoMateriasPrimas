package com.projeto.gestãoMP.controller;


import com.projeto.gestãoMP.model.MatériasPrimas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matériasprimas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MatériasPrimasController {

    @Autowired
    public MatériasPrimas repository;

    @GetMapping
    public ResponseEntity<Object> getAll(){
        return ResponseEntity.ok(repository.findAll());
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<MatériasPrimas> getById(@PathVariable Long id)
    {
        return ((Object) repository.findById(id)).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/nome/{nome}")
    public ResponseEntity<Object> getById(@PathVariable String nome)
    {
        return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
    }
    @PostMapping
    public ResponseEntity<Object> postAluno(@RequestBody MatériasPrimas matériasprimas){
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(matériasprimas));
    }
    @PutMapping("/edit/{id}")
    public ResponseEntity<Object> putAluno(@RequestBody MatériasPrimas matériasprimas, @PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(matériasprimas));
    }
    @DeleteMapping("/{id}")
    public void deleteMatériasPrimasId(@PathVariable Long id) {
    
    }
    
}