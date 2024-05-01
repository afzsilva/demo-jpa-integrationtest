package com.example.demojpaintegrationtest.repository;

import com.example.demojpaintegrationtest.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
