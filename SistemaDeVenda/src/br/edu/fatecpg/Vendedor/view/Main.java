package br.edu.fatecpg.Vendedor.view;
import br.edu.fatecpg.Vendedor.model.Vendedor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Vendedor vend = new Vendedor();

        System.out.print("Digite o nome do vendedor: ");
        String nome = scan.nextLine();

        System.out.print("Digite o valor total de vendas: R$ ");
        double vendas = scan.nextDouble();

        System.out.print("Digite o percentual de comissão: ");
        double perc = scan.nextDouble();

        System.out.print("Digite o salário base: R$ ");
        double salBase = scan.nextDouble();
        
        System.out.print("==============================\n");

        vend.nome = nome;
        vend.vendas = vendas;
        vend.perc = perc;
        vend.salBase = salBase;

        vend.mostrar();
        vend.comissao(vendas, perc);
        vend.salario(vendas, perc, salBase);

        scan.close();

    }

}