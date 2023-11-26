package com.clydao.estudoJavaBasico;
import java.util.ArrayList;

public class ArraysColecoes {
    public static void main(String[] args) {
        System.out.println("Arrays e Colecoes");
        int[] meuArray1;
        meuArray1 = new int[10];
        meuArray1[0] = 50;
        System.out.println("meuArray1[0] " + meuArray1[0]);
        int[] meuArray2 = {50, 60, 70, 80, 90};
        System.out.println("meuArray2[0] " + meuArray2[1]);

        for (int i = 0; i < meuArray2.length; i++) {
            System.out.println(meuArray2[i]);
        }

        System.out.println("Agora experimentando ArrayList");
        ArrayList<String> minhaLista = new ArrayList<String>();

        minhaLista.add("Java");
        minhaLista.add("Python");
        minhaLista.add("C++");

        String elemento = minhaLista.get(2); // Acessa o primeiro elemento
        System.out.println("elemento " + elemento );

        System.out.println("imprimir toda lista");
        for (String linguagem : minhaLista) {
            System.out.println("Linguagem de Programação: " + linguagem);
        }


    }
}
