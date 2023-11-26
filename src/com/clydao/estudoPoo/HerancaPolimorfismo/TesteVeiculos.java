package com.clydao.estudoPoo.HerancaPolimorfismo;

// Classe para testar
public class TesteVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020);
        carro.buzinar(); // Isso vai chamar o método sobrescrito na classe Carro
        carro.exibirInfo(); // Isso vai chamar o método específico da classe Carro
    }
}
