package com.clydao.estudoJavaBasico;

public class EstruturasDeControle {
    public static void main(String[] args) {
        int numero = -5;

        // Exemplo de if-else
        if (numero > 0) {
            System.out.println("Número é positivo");
        } else {
            System.out.println("Número é negativo ou zero");
        }

        // Exemplo de loop for
        for (int i = 0; i < 5; i++) {
            System.out.println("Contagem: " + i);
        }

        // Exemplo de loop while
        int contador = 5;
        while (contador > 0) {
            System.out.println("Contador: " + contador);
            contador--;
        }
    }
}

