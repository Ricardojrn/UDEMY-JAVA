package org.example;

public class Conta {
    private int conta;
    private String titular;
    private double saldo = 0.0;

    public Conta(String titular, int conta, double depositoInicial) {
        this.conta = conta;
        this.titular = titular;
        deposita(depositoInicial);
    }

    public Conta(String titular, int conta) {
        this.conta = conta;
        this.titular = titular;
    }

    public int getConta() {
        return conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor){
        saldo += valor;
    }
    public void saque(double valor){
        saldo -= valor + 5;
    }

    @Override
    public String toString() {
        return "|DADOS DA CONTA|\n" +
                "Número da conta: " + conta +
                " | titular: " + titular +
                " | Saldo: " + saldo;
    }
}
