package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Conta conta1;
        System.out.println("ENTRE COM OS DADOS BANCÁRIOS PARA CRIAÇÃO DA NOVA CONTA");
        System.out.print("Conta: ");
        int conta = input.nextInt();
        input.nextLine();

        System.out.print("Nome do titular: ");
        String titular = input.nextLine();

        System.out.println("Deseja fazer deposíto inicial?\n1-sim\n2-não");
        int simOuNao = input.nextInt();
        if (simOuNao == 1){
            System.out.print("Entre com o valor do depósito: ");
            double saldo = input.nextDouble();
            conta1 = new Conta(titular,conta,saldo);
        }else{
            conta1 = new Conta(titular,conta);
        }

        System.out.println(conta1);
        System.out.print("Entre com o valor do depósito: ");
        double deposito = input.nextDouble();
        conta1.deposita(deposito);
        System.out.println(conta1);
        System.out.print("Entre com o valor do saque: ");
        double saque = input.nextDouble();
        conta1.saque(saque);
        System.out.println(conta1);
    }
}