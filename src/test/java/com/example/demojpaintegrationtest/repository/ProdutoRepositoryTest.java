package com.example.demojpaintegrationtest.repository;

import com.example.demojpaintegrationtest.entities.Produto;
import com.example.demojpaintegrationtest.entities.Status;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
//@ActiveProfiles("test")
class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository repository;

//    @Autowired
//    TestEntityManager testEntityManager;

    @Test
    public void testeSalvar(){

        Produto produto = new Produto();
        produto.setAtivo(true);
        produto.setDataFabricacao(LocalDate.of(2024,02,15));
        produto.setPreco(25.6);
        produto.setQuantidade(5);
        produto.setStatus(Status.ATIVO);
        produto.setTemperatura(55.23f);
        produto.setTemperatura('B');
        produto.setDescricao("Produto BCDE");

        Produto result =  repository.save(produto);
        System.out.println(result.toString());
        Assertions.assertNotNull(result);
        Assertions.assertTrue(produto.isAtivo() == result.isAtivo());

    }
}