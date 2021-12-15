package br.com.dio.exercicios.arrays;

/*Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int [] vetor = {-4, -14, 5, 44, 9, 12};
        int count = 0;

        System.out.println("Vetor: ");
        while (count < (vetor.length)){
            System.out.print(vetor[count]+ " ");
            count++;
        }

        System.out.println("\nVetor (Ordem inversa):");
        for (int i = (vetor.length - 1); i >= 0; i -- ){
            System.out.print(vetor[i]+ " ");
        }

    }
}
