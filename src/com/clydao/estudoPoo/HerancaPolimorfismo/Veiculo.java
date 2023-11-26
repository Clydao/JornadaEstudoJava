package com.clydao.estudoPoo.HerancaPolimorfismo;

// Classe base ou superclasse
public class Veiculo {
    private String marca;
    private int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void buzinar() {
        System.out.println("Beep!");
    }

    // Métodos getters e setters aqui
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

}