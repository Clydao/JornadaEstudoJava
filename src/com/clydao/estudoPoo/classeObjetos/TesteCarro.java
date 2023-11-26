package com.clydao.estudoPoo.classeObjetos;

public class TesteCarro {
    public static void main(String[] args) {
        // Criando objetos da classe Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
        meuCarro.exibirInfo();
        Carro seuCarro = new Carro("Honda", "Civic", 2019);
        seuCarro.exibirInfo();

        System.out.println("marca " + meuCarro.getMarca());
        System.out.println("modelo " + meuCarro.getModelo());

        meuCarro.setMarca("xpto");
        meuCarro.setModelo("tesla");

        System.out.println("marca " + meuCarro.getMarca());
        System.out.println("modelo " + meuCarro.getModelo());

        // Chamando métodos dos objetos Carro
        meuCarro.exibirInfo();
        seuCarro.exibirInfo();
    }
}
