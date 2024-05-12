package com.example.demojpaintegrationtest.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tbl_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 1, max = 10)
    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private char tipo;

    @Column(nullable = false)
    private LocalDate dataFabricacao;

    @AssertFalse
    @Column(nullable = false)
    private boolean ativo;

    @Column(nullable = false)
    private double preco; // aconselhavel BigDecimal

    @Column(nullable = true)
    private float temperatura;

    @Column(nullable = true)
    private int quantidade;

    @Column(nullable = false)
    private Status status;


}

