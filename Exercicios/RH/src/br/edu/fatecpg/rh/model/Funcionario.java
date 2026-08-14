package br.edu.fatecpg.rh.model;
public class Funcionario {
	
	public void aumento(double num, double perc) {
		

			System.out.println("O salário com aumento percentual é: R$" + ((num*perc)+num) + "\n" +
							   "O salário Anual com aumento percentual é: R$" + (((num*perc)+num)*12));
	}
}
