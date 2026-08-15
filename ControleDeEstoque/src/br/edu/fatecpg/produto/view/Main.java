package br.edu.fatecpg.produto.view;
import br.edu.fatecpg.produto.model.Produto;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Produto meuProduto = new Produto();
        meuProduto.nome = "Caderno";
        meuProduto.preco = 15.90;
        meuProduto.quantidade = 50;

        meuProduto.exibir();
        meuProduto.Total();
        
        
        System.out.print("==============================\n");
        
        System.out.println("Digite a opção desejada 1 - Entrada de produto 2 - Saída de produto");
        int opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a quantidade que deseja adicionar ");
            int qtd = scan.nextInt();
            meuProduto.entrada(qtd);

        } else if (opcao == 2) {
            System.out.print("Digite a quantidade que deseja retirar ");
            int qtd = scan.nextInt();
            meuProduto.saida(qtd);

        } else {
            System.out.println("Inválido");
        }

        
        System.out.print("==============================\n");
        meuProduto.Total();

        scan.close();

    }

}