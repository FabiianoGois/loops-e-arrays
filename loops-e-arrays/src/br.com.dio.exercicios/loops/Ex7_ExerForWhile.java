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

        boolean verdade = true;
        int count = 0;

        System.out.println("Números de 3 a 11, deixando o 7 de fora");
        for (int i = 3;i <= 11; i = i + 2) {
            if (i == 7) continue;
            System.out.print(i+" ");
        }

        System.out.println("\nNúmeros de 1 a 14, mostrando apenas os múltiplos de 2"+
                             " e encerrando ao chegar no número 12, sem mostrar ele.");
        for (int i = 1;i <= 14; i++) {
                if (i == 12) break;
                if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println("\n");
        while (verdade && count < 5){
            System.out.println("Texto aleatório!");
            count++;
        }

    }
}
