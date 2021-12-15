package br.com.dio.exercicios.loops;

/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
* qualquer número inteiro de 1 a 10.
* O usuário deve informar o número no qual ele deseja ver a tabuada.
* a saída deve ser conforme o exemplo abaixo:
*
* Tabuada de 5:
*
* 5 x 1  = 5
* 5 x 2  = 10
*...
* 5 x 10 = 50
*
* */

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numDesejado;

        System.out.println("Informe um número de 1 a 10:");
        numDesejado = scan.nextInt();

        System.out.println("Tabuada de: "+ numDesejado);

        for (int i = 1; i <= 10; i++){
            System.out.println(numDesejado + " x " + i + " = "+(numDesejado * i));
        }
    }
}
