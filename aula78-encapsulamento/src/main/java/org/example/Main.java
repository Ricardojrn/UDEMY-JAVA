package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.print("Enter the number of products to added in stock: ");
        quantity = input.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.print("Enter the number of products to removed from stock: ");
        quantity = input.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.println(product);
    }
}