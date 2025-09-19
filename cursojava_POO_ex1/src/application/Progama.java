package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public interface Progama {
	public static void main(String[] ags) {
		//Progama que ira ler os dados de um produto em estoque(nome, preço e quantidade)
		//Mostrar os dados do produto(nome, preço, quantidade no estoque, valor total no estoque)
		//Realizar uma entrada no estoque e mostrar novamente os dados do produto
		//Realizar uma saída no estoque e mostrar novamente os dados do produto
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		Produto produto = new Produto(); //crio o Scanner dessa vez para os valores irem pra produto
		System.out.println("Dados do produto: ");
		System.out.println("Nome: ");
		produto.name = sc.nextLine(); //referecio a entrada para o atributo name na classe
		System.out.println("Preço: ");
		produto.price = sc.nextDouble(); // peço o preço
		System.out.println("Quantidade em Estoque: ");
		produto.quantity = sc.nextInt(); //peço a quantidade
		

		//System.out.println(produto.name + "," + produto.price + "," + produto.quantity); // print exemplo
		System.out.println();
		System.out.println(produto); //teste do toString dentro da classe
		System.out.println(); // pulando linha
		System.out.println("Qual o numero de produtos para ser adicionado ao estoque: ");
		int quantity = sc.nextInt(); // adiciono o valor digitado em quantity
		produto.addProducts(quantity);//ponho esse valor no calculo da classe addproducts
		System.out.println();
		System.out.println("Atualização: " + produto);
		System.out.println(); // pulando linha
		System.out.println("Qual o numero de produtos para ser removido do estoque: ");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);
		System.out.println();
		System.out.println("Atualização: " + produto);
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
