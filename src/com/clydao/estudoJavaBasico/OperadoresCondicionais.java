package com.clydao.estudoJavaBasico;

public class OperadoresCondicionais {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        // E lógico
        if (a && b) {
            System.out.println("Ambas as variáveis são verdadeiras.");
        } else {
            System.out.println("Uma ou ambas as variáveis são falsas.");
        }

       // OU lógico
        if (a || b) {
            System.out.println("Pelo menos uma das variáveis é verdadeira.");
        }
        // NÃO lógico
        if (!b) {
            System.out.println("B é falso.");
        }

        int x = 20;
        int y = 10;

        if (x < y) {
            System.out.println("X é menor que Y.");
        }

        if (x != y) {
            System.out.println("X é diferente de Y.");
        }

        // Sintaxe do operador ternário: condição ? expressão1 : expressão2;
        String resultado = (x > y) ? "X maior que Y" : "X não é maior que Y";
        System.out.println(resultado);


    }
}

