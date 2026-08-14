package br.edu.fatecpg.Viagem.view;
import br.edu.fatecpg.Viagem.model.Viagem;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Viagem viagem = new Viagem();

        System.out.print("Digite a distância da viagem em km: ");
        double dist = scan.nextDouble();

        System.out.print("Digite o consumo do carro km por litro: ");
        double cons = scan.nextDouble();

        System.out.print("Digite o preço do combustível: R$ ");
        double preco = scan.nextDouble();
        
        System.out.print("==============================\n");

        viagem.dist = dist;
        viagem.cons = cons;
        viagem.preco = preco;

        viagem.mostrar();
        viagem.litros(dist, cons);
        viagem.custo(dist, cons, preco);

        scan.close();

    }

}