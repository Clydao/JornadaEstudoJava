package com.clydao.estudoPoo;

public class TesteCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2020;

        meuCarro.exibirInfo();
    }
}
