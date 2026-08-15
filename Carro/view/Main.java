package br.edu.fatecpg.Carro.view;
import br.edu.fatecpg.Carro.model.Carro;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Carro carro = new Carro();

        System.out.print("Digite a marca do carro: ");
        String marc = scan.nextLine();

        System.out.print("Digite o consumo de km por L: ");
        double cons = scan.nextDouble();

        System.out.print("Digite o combustível atual litros: ");
        double comb = scan.nextDouble();

        carro.marca = marc;

        carro.mostrar();
        carro.autonomia(cons, comb);

        System.out.println("Digite a opção desejada 1 - Simular viagem 2 - Abastecer");
        int op = scan.nextInt();
        
        System.out.print("==============================\n");

        if (op == 1) {
            System.out.print("Digite a distância da viagem em km: ");
            double km = scan.nextDouble();
            carro.viajar(km, cons, comb);
            carro.autonomia(cons, comb - (km / cons));
        } else if (op == 2) {
            System.out.print("Digite a quantidade de litros: ");
            double lit = scan.nextDouble();
            carro.abastecer(comb, lit);
            carro.autonomia(cons, comb + lit);
        } else {
            System.out.println("Inválido");
        }

        scan.close();

    }

}