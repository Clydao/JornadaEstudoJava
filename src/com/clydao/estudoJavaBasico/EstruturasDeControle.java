package com.clydao.estudoJavaBasico;

public class EstruturasDeControle {
    public static void main(String[] args) {

        System.out.println("Exemplo de if-else");
        // Exemplo de if-else
        int numero = 5;

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        System.out.println("Exemplo de if-else numero par ou impar");
        // Usa o operador módulo para verificar o resto da divisão por 2
        if (numero % 2 == 0) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }

        System.out.println("Exemplo de switch");

        // Exemplo de switch
        int dia = 6;
        String nomeDoDia;

        switch (dia) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda-feira";
                break;
            case 3:
                nomeDoDia = "Terça-feira";
                break;
            case 4:
                nomeDoDia = "Quarta-feira";
                break;
            case 5:
                nomeDoDia = "Quinta-feira";
                break;
            case 6:
                nomeDoDia = "Sextou!!!";
                break;
            case 7:
                nomeDoDia = "Sábado";
                break;
            // Adicione os casos restantes...
            default:
                nomeDoDia = "Dia inválido";
                break;
        }

        System.out.println(nomeDoDia);


        System.out.println("Exemplo de loop for");

        // Exemplo de loop for
        for (int i = 0; i < 5; i++) {
            System.out.println("i é: " + i);
        }
        System.out.println("Exemplo de loop while");

        // Exemplo de loop while
        int contador = 0;

        while (contador < 5) {
            System.out.println("contador é: " + contador);
            contador++;
        }
        System.out.println("Exemplo de loop do while");

        // Exemplo de loop do while
        contador = 0;

        do {
            System.out.println("contador é: " + contador);
            contador++;
        } while (contador < 5);


        System.out.println("Exemplo de break e continue");

        // Exemplo de break e continue
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break; // Sai do loop quando i é 4
            }
            if (i == 2) {
                continue; // Pula a iteração quando i é 2
            }
            System.out.println(i);
        }


    }
}

