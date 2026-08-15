package br.edu.fatecpg.Carro.model;

public class Carro {

    public String marca;
    public double cons;
    public double comb;

    public void mostrar() {
        System.out.println("Marca: " + marca);
        System.out.println("Consumo: " + cons + " km por litro");
        System.out.println("Combustível atual: " + comb + " litros");
    }

    public void autonomia(double cons, double comb) {
        double km = cons * comb;
        System.out.println("Combustivel suficiente para percorrer: " + km + " km");
    }

    public void viajar(double km, double cons, double comb) {
        double lit = km / cons;
        if (lit > comb) {
            System.out.println("Combustível insuficiente! Você só pode percorrer " + (cons * comb) + " km");
        } else {
            comb = comb - lit;
            System.out.println("Viagem de " + km + " km realizada. Combustível restante: " + comb + " litros");
        }
    }

    public void abastecer(double comb, double lit) {
        comb = comb + lit;
        System.out.println("Abastecimento realizado. \n O combustível atual: " + comb + " litros");
    }

}