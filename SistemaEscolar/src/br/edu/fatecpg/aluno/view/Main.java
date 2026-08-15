package br.edu.fatecpg.aluno.view;
import br.edu.fatecpg.aluno.model.Aluno;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        String nome = scan.nextLine();

        System.out.print("Digite a nota 1: ");
        double n1 = scan.nextDouble();

        System.out.print("Digite a nota 2: ");
        double n2 = scan.nextDouble();

        System.out.print("Digite a nota 3: ");
        double n3 = scan.nextDouble();
        
        System.out.print("==============================\n");

        aluno.nome = nome;

        aluno.mostrarNotas();
        aluno.media(n1, n2, n3);

        scan.close();

    }

}