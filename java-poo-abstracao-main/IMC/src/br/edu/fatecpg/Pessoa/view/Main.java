package br.edu.fatecpg.Pessoa.view;
import br.edu.fatecpg.Pessoa.model.Pessoa;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o nome do paciente: ");
        String nome = scan.nextLine();

        System.out.print("Digite o peso em Kg: ");
        double peso = scan.nextDouble();

        System.out.print("Digite a altura em cm: ");
        double alt = scan.nextDouble();

        System.out.print("=================");
        
        pessoa.nome = nome;
        pessoa.peso = peso;
        pessoa.alt = alt;

        pessoa.mostrar();
        pessoa.imc(peso, alt);

        scan.close();

    }

}