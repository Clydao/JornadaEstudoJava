package com.clydao.estudoJavaBasico.MetodoJava;

public class Calculadora {

    // Método sem retorno (void) e sem parâmetros
    public void imprimirBoasVindas() {
        System.out.println("Bem-vindo à Calculadora!");
    }

    // Método com retorno (int) e com dois parâmetros (int a, int b)
    public int somar(int a, int b) {
        return a + b;
    }

    // Método estático
    public static int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Sobrecarga do método multiplicar para aceitar três parâmetros
    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }
}

