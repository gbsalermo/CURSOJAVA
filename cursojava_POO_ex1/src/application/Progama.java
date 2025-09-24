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
		
		//ATUALIZAÇÃO PARA AULA DE CONTRUSTORES
		Locale.setDefault(Locale.US);
		//Quando executamos o comando abaixo, instaciamos um produto com seus atributos "vazios"
		//Produto produto = new Produto(); //OBJETO EXEMPLO
		
		/*abaixo eu printo como o construtor produto tem valores nullo
		System.out.println(produto.name);
		System.out.println(produto.price);
		System.out.println(produto.quantity);
		*/
		//É POSSIVEL FAZER COM QUE SEJA OBRIGADO O OBJETO RECEBER DADOS
		
		
		Produto p = new Produto();//Construtor padrão
		
		System.out.println("Dados do produto: ");
		System.out.println("Nome: ");
		String name = sc.nextLine(); //Peço o name
		System.out.println("Preço: ");
		double price = sc.nextDouble(); // peço o preço
	/*	System.out.println("Quantidade em Estoque: ");
		int quantity = sc.nextInt(); //peço a quantidade*/ //Coloquei suspenso para teste de sobrecarga
		//Produto produto = new Produto(name, price, quantity); //Aqui instancio o produto já com o construtor e assim os valores sao atribuidos de automaticamente
		Produto produto = new Produto(name, price); //chamo o construtor com dois argumentos apenas(TESTE DE SOBRECARGA)

		//System.out.println(produto.name + "," + produto.price + "," + produto.quantity); // print exemplo
		System.out.println();
		System.out.println(produto); //teste do toString dentro da classe
		System.out.println(); // pulando linha
		System.out.println("Qual o numero de produtos para ser adicionado ao estoque: ");
		int quantity = sc.nextInt(); //declaro o quantity como int para o teste de sobrecarga
		//quantity = sc.nextInt(); // adiciono o valor digitado em quantity
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
