package br.edu.fatecpg.Temperatura.model;

public class Temperatura {

    public void fahrenheit(double cel) {
        double fah = (cel * 9 / 5) + 32;
        System.out.println("A temperatura em Fahrenheit é : " + fah);
    }

    public void kelvin(double cel) {
        double kel = cel + 273.15;
        System.out.println("A temperatura em Kelvin é: " + kel);
    }

}