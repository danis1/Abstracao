package br.edu.fatecpg.ContaEnergia.view;
import br.edu.fatecpg.ContaEnergia.model.ContaEnergia;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ContaEnergia conta = new ContaEnergia();

        System.out.print("Digite o consumo em kWh: ");
        double kwh = scan.nextDouble();

        System.out.print("Digite o valor por kWh: R$ ");
        double valorKwh = scan.nextDouble();

        conta.kwh = kwh;
        conta.valorKwh = valorKwh;

        conta.mostrar();
        conta.total(kwh, valorKwh);

        System.out.print("==============================\n");
        
        System.out.println("Deseja aplicar desconto? 1 - Sim  2 - Não");
        int op = scan.nextInt();

        if (op == 1) {
            System.out.print("Digite o percentual de desconto: ");
            double desc = scan.nextDouble();
            conta.desconto(kwh, valorKwh, desc);
        } else if (op == 2) {
            System.out.println("Nenhum desconto");
        } else {
            System.out.println("Tente denovo");
        }

        scan.close();

    }

}