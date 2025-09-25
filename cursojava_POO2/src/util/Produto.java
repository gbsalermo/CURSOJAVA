package util;

public class Produto {

	//PRODUTO ENCAPSULAMENTO

	
		//private String name; 
		String name; // Quando não há nada, o membro só pode ser acessado no mesmo pacote
		private double price;
		private int quantity;
		
		//construtor padrão
		public Produto() {
			
		}
		
		/* exemplo construtor, get/sets e sobrecarga
public Produto(String name, double price, int quantity) { 
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		/*EXEMPLO DE SOBRECARGA E GET/SET
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
		*/
		
		//Construtor automatico (Bot. direi. -> Source -> Generate constructor using fields)
		public Produto(String name, double price, int quantity) {
			//super(); Por ser uma classe comum, não necessita do super();
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		//sobrecarga
		public Produto(String name, double price) {
			//super(); Por ser uma classe comum, não necessita do super();
			this.name = name;
			this.price = price;
		}
		
		//get e set gerados automaticamente
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
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


