package br.com.dio.exercicios.loops;

/* Faça um programa que calcule um fatorial de um número inteiro
* fornecido pelo usuário.
*
*  5 != 120   (5 x 4 x 3 x 2 x 1)
*
* */

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int fatorial;
        int multiplicacao = 1;

        System.out.println("Fatorial: ");
        fatorial = scan.nextInt();

        for (int i = fatorial; i >= 1; i--){
            multiplicacao = multiplicacao * i;
        }
        System.out.println(fatorial+" != "+multiplicacao);
    }
}
