package br.com.dio.exercicios.loops;

/*Faça um programa que leia 5 números, em seguida informe
* o maior número digitado e a média desses valores.*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maiorNum = 0;
        int soma = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maiorNum) maiorNum = numero;

            count++;
        }while (count < 5);

        System.out.println("O maior número digitado foi: " + maiorNum);
        System.out.println("E a média foi: " + (soma/5));
    }
}
