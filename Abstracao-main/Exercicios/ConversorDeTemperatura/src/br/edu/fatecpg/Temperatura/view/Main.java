package br.edu.fatecpg.Temperatura.view;
import br.edu.fatecpg.Temperatura.model.Temperatura;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Temperatura temp = new Temperatura();

        System.out.print("Digite a temperatura em Celsius: ");
        double cel = scan.nextDouble();
        
        System.out.print("==============================\n");

        temp.fahrenheit(cel);
        temp.kelvin(cel);

        scan.close();

    }

}