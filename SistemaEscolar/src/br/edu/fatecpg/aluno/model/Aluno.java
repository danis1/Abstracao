package br.edu.fatecpg.aluno.model;

public class Aluno {


    public String nome;
    public double n1;
    public double n2;
    public double n3;


    public void mostrarNotas() {
        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " + n1);
        System.out.println("Nota 2: " + n2);
        System.out.println("Nota 3: " + n3);
    }

    public void media(double n1, double n2, double n3) {
        double media = (n1 + n2 + n3) / 3;
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno Reprovado");
        }
    }

}