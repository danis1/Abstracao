package br.edu.fatecpg.rh.view;
import br.edu.fatecpg.rh.model.Funcionario;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		Funcionario rhfun = new Funcionario();
		
		System.out.println("Digite nome do funcionario: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite o salário inicial do funcionario: ");
		double num = scan.nextDouble();
		
		System.out.println("Digite o valor da porcentagem que gostaria de acrescentar, ou 0 para continuar: ");
		double perc = scan.nextDouble();
		
		System.out.println("O funcionário" + nome + " recebe: \n");
	      System.out.print("================\n");
		
		rhfun.aumento(num, perc);
        
		scan.close();
	}

}
