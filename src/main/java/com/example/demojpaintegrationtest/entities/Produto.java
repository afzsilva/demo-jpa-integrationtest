package com.example.demojpaintegrationtest.entities;

import jakarta.persistence.*;
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

    private char tipo;
    private LocalDate dataFabricacao;
    private boolean ativo;
    private double preco;
    private float temperatura;
    private int quantidade;
    private Status status;

}

