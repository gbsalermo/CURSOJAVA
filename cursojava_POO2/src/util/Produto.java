package util;

public class Produto {

	//PRODUTO ENCAPSULAMENTO

	
		private String name; 
		private double price;
		private int quantity;
		
		//construtor padrão
		public Produto() {
			
		}
		
		public Produto(String name, double price, int quantity) { 
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		//EXEMPLO DE SOBRECARGA
		public Produto(String name, double price) { //A diferença está nos parametros
			
			this.name = name;
			this.price = price;
			
		}
		
		//Por convenção os metodos gets e sets são colocados após os construtores
		public String getName() {
			return name;
		}
		
		public void setName(String name) { //Crio com o setName para alterar o valor de Name
			this.name = name;
		}
		public double getPrice() { //get para impressao do valor de price
			return price;
		}
		public void setPrice(Double price) { //set para mudança do valor de price
			this.price = price;
		}
		public double getQuantity() { //Crio apenas um get para proteger a integridade do estoque, ja que a quantidade depende da adição e exclusão de itens
			return quantity;
		}
		
		public double totalValueInStock() {
			return price * quantity;
		}
		public void addProducts(int quantity) { 
			this.quantity += quantity; 
		}
		public void removeProducts(int quantity) { 
			
			this.quantity -= quantity; 
		}
		
		public String toString() { //Uma sobreposição ao objeto Produto, o toString() Serve para transformar os valores em String
			return name
					+ ", $ "
					+ String.format("%."
							+ "2f", price)
					+ ", "
					+ quantity
					+ " unit, Total: $"
					+ String.format("%.2f", totalValueInStock()); //String.format serve para as casas decimais
			
		}
	}


