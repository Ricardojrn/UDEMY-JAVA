package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("Quantos quartos alugar? ");
        int n = input.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Rent #" + i +":");
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.next();
            System.out.print("Room: ");
            int roomNumber = input.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }

        for (int i = 0; i < 10; i++){
            if (vect[i] != null) {
                System.out.println(i + ": "+ vect[i]);
            }
        }

        input.close();
    }
}
