package br.edu.fatecpg.Vendedor.model;

public class Vendedor {

    public String nome;
    public double vendas;
    public double perc;
    public double salBase;

    public void mostrar() {
        System.out.println("Vendedor: " + nome);
        System.out.println("Total de vendas: R$ " + vendas);
        System.out.println("Comissão: " + perc + "%");
        System.out.println("Salário base: R$ " + salBase);
    }

    public void comissao(double vendas, double perc) {
        double com = vendas * (perc / 100);
        System.out.println("Valor da comissão: R$ " + com);
    }

    public void salario(double vendas, double perc, double salBase) {
        double com = vendas * (perc / 100);
        double sal = salBase + com;
        System.out.println("Salário final: R$ " + sal);
    }

}