package org.example.version2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        System.out.print("Entre com o valor do raio: ");
        double raio = input.nextDouble();
        double c = calc.circunferencia(raio);

        double v = calc.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", calc.PI);
    }

}