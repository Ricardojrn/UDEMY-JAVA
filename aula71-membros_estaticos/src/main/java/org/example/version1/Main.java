package org.example.version1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com o valor do raio: ");
        double raio = input.nextDouble();
        double c = Calculadora.circunferencia(raio);

        double v = Calculadora.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", Calculadora.PI);
    }

}