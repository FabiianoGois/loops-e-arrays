package br.com.dio.exercicios.loops;

/* Faça um programa que peça N números inteiros, calcule e mostre
* a quantidade de números pares e a quantidade de números ímpares.*/

import java.util.Scanner;

public class Ex4_ParEImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int quantNumeros;
        int quantImpar = 0;
        int quantPar = 0;

        System.out.println("Quantidade de números");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) {
                quantPar++;
            }else {
                quantImpar++;
            }
            count++;

        }while (count < quantNumeros);

        System.out.println("Ao todo foram digitados "+ quantImpar+" números ímpares,e "+quantPar+" números pares!");
    }
}
