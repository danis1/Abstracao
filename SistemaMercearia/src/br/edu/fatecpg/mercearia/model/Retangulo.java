package br.edu.fatecpg.mercearia.model;

public class Retangulo {
	
	public void area (double alt, double larg) {
		System.out.println( "A área é: " + (alt*larg) + " cm²");
	}
	
	public void  perimetro (double alt, double larg)
	{
		System.out.println("O perímetro é: " + ((alt + larg)*2) + " cm");
	}
}
