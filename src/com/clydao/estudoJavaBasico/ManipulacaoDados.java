package com.clydao.estudoJavaBasico;

import java.util.ArrayList;
import java.util.Arrays;

public class ManipulacaoDados {
    public static void main(String[] args) {
        // Manipulação de Strings
        String saudacao = "Olá, Mundo!";
        System.out.println("Tamanho da string: " + saudacao.length());
        System.out.println("Letra na posição 4: " + saudacao.charAt(3));
        System.out.println("Substring: " + saudacao.substring(5, 10));

        // Uso de Arrays
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Elemento no índice 2: " + numeros[2]);
        System.out.println("Tamanho do array: " + numeros.length);

        // Uso de Listas
        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("Maçã", "Banana", "Laranja"));
        frutas.add("Manga");
        System.out.println("Frutas: " + frutas);
    }
}

