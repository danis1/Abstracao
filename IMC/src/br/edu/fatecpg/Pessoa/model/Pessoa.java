package br.edu.fatecpg.Pessoa.model;

public class Pessoa {

    public String nome;
    public double peso;
    public double alt;

    public void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + alt + " cm");
    }

    public void imc(double peso, double alt) {
        double altM = alt / 100;
        double imc = peso / (altM * altM);
        System.out.println("IMC: " + imc);

        if (imc < 18.5) {
            System.out.println("Resultado: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Resultado: Peso normal");
        } else if (imc < 30) {
            System.out.println("Resultado: Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Resultado: Obeso grau I");
        } else if (imc < 40) {
            System.out.println("Resultado: Obeso grau II");
        } else {
            System.out.println("Resultado: Obeso grau III");
        }
    }

}