package com.example.demojpaintegrationtest.entities;

public enum Status {
        ATIVO(1),
        INATIVO(0);

        private int codigo;

        Status(int codigo) {
                this.codigo = codigo;
        }
        public int getCodigo() {
                return codigo;
        }
}
