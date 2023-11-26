package com.clydao.estudoJavaBasico.metodoJava;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Chamando os métodos
        calc.imprimirBoasVindas();
        int soma = calc.somar(10, 20);
        int subtracao = Calculadora.subtrair(20, 10);
        int multiplicacao = calc.multiplicar(5, 4);
        int multiplicacaoSobrecarregada = calc.multiplicar(5, 4, 3);

        // Imprimindo os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Multiplicação Sobrecarregada: " + multiplicacaoSobrecarregada);

    }
}

