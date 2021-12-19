package br.com.dio.exercicios.loops;

/*Faça um FOR que mostre os números de 3 a 11 sendo que itere de 2 em 2.
* Entretanto quando o loop passar pelo 7, este não deverá ser exibido.
*
* Também faça um WHILE que exiba um texto 5 vezes com uma expressão de controle
* e uma variável booleana
*
* */

public class Ex7_ExerForWhile {

    public static void main(String[] args) {

        int numeros = 0;
        boolean verdade = true;
        int count = 0;

        for (int i = 3;i <= 11; i = i + 2) {
            System.out.println(i);
        }

        while (verdade && count < 5){
            System.out.println("Texto aleatório!");
            count++;
        }

    }

}
