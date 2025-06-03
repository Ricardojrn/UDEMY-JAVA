package org.example;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < n ; i++) {
            scan.nextLine();
            String name = scan.nextLine();
            double price = scan.nextDouble();
            vect[i] = new Product(name, price);
        }
        double sum = 0;
        for (int i=0; i<n;i++){
            sum += vect[i].getPrice();
        }
        double avg = sum/n;
        System.out.printf("Preço médio: %.2f%n",avg);

        scan.close();
    }
}
