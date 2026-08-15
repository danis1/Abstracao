package br.edu.fatecpg.Viagem.model;

public class Viagem {

    public double dist;
    public double cons;
    public double preco;

    public void mostrar() {
        System.out.println("Distância: " + dist + " km");
        System.out.println("Consumo do carro: " + cons + " km/l");
        System.out.println("Preço do combustível: R$ " + preco);
    }

    public void litros(double dist, double cons) {
        double lit = dist / cons;
        System.out.println("Litros necessários: " + lit + " L");
    }

    public void custo(double dist, double cons, double preco) {
        double lit = dist / cons;
        double cust = lit * preco;
        System.out.println("O custo total da viagem é: R$ " + cust);
    }

}