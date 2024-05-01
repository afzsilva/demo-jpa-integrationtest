package com.example.demojpaintegrationtest.controller;

import com.example.demojpaintegrationtest.entities.Produto;
import com.example.demojpaintegrationtest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto){
        Produto psalvo = repository.save(produto);
        return ResponseEntity.ok(psalvo);
    }

}
