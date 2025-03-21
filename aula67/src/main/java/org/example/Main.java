package org.example;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = input.nextLine();
        System.out.print("Price: ");
        product.price = input.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = input.nextInt();

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.print("Enter the number of products to added in stock: ");
        int quantity = input.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.print("Enter the number of products to removed from stock: ");
        quantity = input.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.println(product);


        input.close();
    }
}