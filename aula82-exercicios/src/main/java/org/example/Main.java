package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTRE COM OS DADOS BANCÁRIOS PARA CRIAÇÃO DA NOVA CONTA");
        System.out.print("Conta: ");
        int conta = input.nextInt();
        System.out.print("Nome do titular: ");
        String titular = input.next();
        System.out.println("Deseja fazer deposíto inicial?\n1-sim\n2-não");
        int simOuNao = input.nextInt();
        if (simOuNao == 1){
            System.out.print("Entre com o valor do depósito: ");
            double saldo = input.nextDouble();
            Conta conta1 = new Conta(titular,conta,saldo);
            System.out.println(conta1);
        }else if (simOuNao == 2){
            Conta conta1 = new Conta(titular,conta);
            System.out.println(conta1);
        }

        System.out.print("Entre com um valor para o depósito: ");
        double deposito = input.nextDouble();

    }
}