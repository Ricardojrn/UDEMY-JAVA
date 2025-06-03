package org.example;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números voçê vai digitar? ");
        int n = scan.nextInt();
        int[] vetor = new int[n];

        for (int i=0; i < n; i++){
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }

        scan.close();
    }
}