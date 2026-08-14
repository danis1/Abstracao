package br.edu.fatecpg.bancodigital.model;

public class ContaBancaria {

    public String nome;
    public double saldo = 1000.00;

    public void saque(double val) {
        if (val <= saldo) {
            saldo = saldo - val;
        } else {
            System.out.println("Seu saldo é insuficiente!");
        }
    }

    public void deposito(double val) {
        saldo = saldo + val;
    }

}