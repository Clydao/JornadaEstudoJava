package com.clydao.estudoPoo.HerancaPolimorfismo;

public class Carro extends Veiculo {
    private String modelo;

    public Carro(String marca, String modelo, int ano) {
        super(marca, ano); // Chama o construtor da superclasse
        this.modelo = modelo;
    }

    // Sobrescrita do método buzinar
    @Override
    public void buzinar() {
        System.out.println("Honk!");
    }

    // Métodos específicos da classe Carro
    public void exibirInfo() {
        System.out.println("Marca: " + getMarca() + ", Modelo: " + modelo + ", Ano: " + getAno());
    }

    // Métodos getters e setters para 'modelo' aqui
}
