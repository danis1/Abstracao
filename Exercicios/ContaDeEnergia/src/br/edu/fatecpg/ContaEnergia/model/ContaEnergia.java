package br.edu.fatecpg.ContaEnergia.model;

public class ContaEnergia {

    public double kwh;
    public double valorKwh;

    public void mostrar() {
        System.out.println("Consumo: " + kwh + " kWh");
        System.out.println("Valor por kWh: R$ " + valorKwh);
    }

    public void total(double kwh, double valorKwh) {
        double tot = kwh * valorKwh;
        System.out.println("O valor total é: R$ " + tot);
    }

    public void desconto(double kwh, double valorKwh, double desc) {
        double tot = kwh * valorKwh;
        double totDesc = tot - (tot * (desc / 100));
        System.out.println("Desconto de " + desc + "%: R$ " + (tot * (desc / 100)));
        System.out.println("Valor final com desconto é: R$ " + totDesc);
    }

}