package com.clydao.estudoPoo.classeObjetos;

public class Carro {
    // Atributos de classe (variáveis de instância)
    String marca;
    String modelo;
    int ano;

    // Construtor da classe
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos de acesso 'get' e 'set'
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Métodos da classe
    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}

