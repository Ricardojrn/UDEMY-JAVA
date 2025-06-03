package org.example;

import java.util.Scanner;

public class Soma_vetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos números vai digitar? ");
        int n = scan.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i <n ; i++) {
            vetor[i] = scan.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.print("  "+vetor[i]);
        }
        System.out.println();

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }
        System.out.println("SOMA = "+soma);

        System.out.println("MÉDIA = "+soma/n);

        scan.close();
    }
}
