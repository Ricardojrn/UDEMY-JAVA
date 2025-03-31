package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual a cotação atual do dollar? ");
        double cotacao = input.nextDouble();
        System.out.print("Quantos dolares deseja comprar? ");
        double dollar = input.nextDouble();
        System.out.print("O valor pago em reais será "+Conversor.converter(cotacao, dollar)+"!");
    }
}