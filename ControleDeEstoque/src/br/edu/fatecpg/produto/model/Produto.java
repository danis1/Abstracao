package br.edu.fatecpg.produto.model;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;;



	public void exibir() {
	    System.out.println("Produto: " + nome);
	    System.out.println("Preço: R$ " + preco);
	    System.out.println("Quantidade em estoque: " + quantidade);
	}

    public void Total() {
        System.out.println("Valor total em estoque: R$ " + (preco * quantidade));
    }

    public void entrada(int qtd) {
        quantidade = quantidade + qtd;
        System.out.println("Houve entrada de: " + qtd + " un ----- o estoque atual é: " + quantidade + "un");
    }

    public void saida(int qtd) {
        if (qtd > quantidade) {
            System.out.println("Estoque insuficiente! Disponível: " + quantidade);
        } else {
            quantidade = quantidade - qtd;
            System.out.println("Houve saída de " + qtd + " un -----1 o estoque atual é: " + quantidade + "un");
        }
    }

}