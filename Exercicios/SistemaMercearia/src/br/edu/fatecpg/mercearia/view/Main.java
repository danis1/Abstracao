package br.edu.fatecpg.mercearia.view;
import br.edu.fatecpg.mercearia.model.Retangulo;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		Retangulo minhaMerc = new Retangulo();
		
		System.out.println("Digite a Altura: ");
		double alt = scan.nextDouble();
				
		System.out.println("Digite a Largura: ");
		double larg = scan.nextDouble();
		
	    System.out.print("==============================\n");
		
		minhaMerc.area(alt,larg);
		minhaMerc.perimetro(alt,larg);
		
		 scan.close();

	}
	
}


