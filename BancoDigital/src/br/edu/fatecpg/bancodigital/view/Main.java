package br.edu.fatecpg.bancodigital.view;
import br.edu.fatecpg.bancodigital.model.ContaBancaria;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        conta.nome = nome;

        System.out.println("Olá, " + conta.nome + ", seu saldo atual é: R$ " + conta.saldo);

        System.out.println("Digite a opção desejada: 1 - Saque  2 - Depósito");
        int op = scan.nextInt();

        if (op == 1) {
            System.out.print("Qual valor deseja sacar? ");
            double val = scan.nextDouble();
            conta.saque(val);
        } else if (op == 2) {
            System.out.print("Qual valor deseja depositar? ");
            double val = scan.nextDouble();
            conta.deposito(val);
        } else {
            System.out.println("Opção inválida");
        }

        
        System.out.print("======================================\n");
        
        
        System.out.println("Operação Realizada");
        System.out.println(conta.nome + ", seu saldo atualizado é: R$ " + conta.saldo);

        scan.close();

    }

}