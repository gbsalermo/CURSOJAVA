package cursojava_POO2;

import java.util.Locale;
import java.util.Scanner;
import util.Produto;

public interface secao9 {

	public static void main(String[] ags) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		//Aula - ENCAPSULAMENTO
		/*ABAIXO O PADRÃO DE IMPLEMENTAÇÃO DE GETTERS E SETTERS
		
		//A palavra private indica que esses atributos não podem ser acessados por outras classes
		private String name; //atributo String name
		private double price; //Atributo double price
		
		//O metodo getNomedoatributo é responsavel por obter/acessar o atributo
		public String getName() {
			return name; //nesse caso ele faz só o basico, que é retornar o atributo
		}
		//o metodo setNomedoatributo é responsavel por alterar o valor do atributo
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
	
		*/

		
		
		
		
		System.out.println("Dados do produto: ");
		System.out.println("Nome: ");
		String name = sc.nextLine(); //Peço o name
		System.out.println("Preço: ");
		double price = sc.nextDouble(); 
		Produto produto = new Produto(name, price); 

		produto.setName("computer"); // uso a classe.setParametro("valor") para alterar o valor do parametro escolhido na classe
		System.out.println("Atualizar nome: " + produto.getName()); //uso a classe.getParametro() para pegar o valor do parametro
		produto.setPrice(1200.00);
		System.out.println("Valor atualizado: " + produto.getPrice());
		
		System.out.println();
		System.out.println(produto); 
		System.out.println(); 
		System.out.println("Qual o numero de produtos para ser adicionado ao estoque: ");
		int quantity = sc.nextInt(); 
		produto.addProducts(quantity);
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
