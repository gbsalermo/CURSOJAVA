package entities;

public class Produto { // crio a classe produto
	
	//crio os atributos de acordo o problema
	public String name; // atributos e metodos tem nome com inicial minuscula
	public double price;
	public int quantity;
	
	//É possivel criar um construtor padrão
	public Produto() {
		
	}
	//Construtor(ele vem normalmente antes dos metodos), ele executa no momento da instaciação do objeto
	public Produto(String name, double price, int quantity) {  // o construtor vai receber o nome, preço e quantidade
		//uso o this para referenciar o atributo do objeto
		this.name = name;//o segundo name é o parametro do construtor
		this.price = price;
		this.quantity = quantity;
	}
	//EXEMPLO DE SOBRECARGA
	//Sobre carga é disponibilizar mais de uma versão da msm opeação
	public Produto(String name, double price) { //A diferença está nos parametros
		
		this.name = name;
		this.price = price;
		
		
	}
		
	
	
	public double totalValueInStock() {//esse metodo não recebe parametros e por isso não há nada no parenteses
		//faço o retorno do valor total em estoque, ou seja, preço x quantidade
		return price * quantity;
	}
	public void addProducts(int quantity) { //esse metodo recebe parametros, que no caso é a quantidade, o void indica q ele não tem papel de retorno 
		//Nessa parte estou apenas alterando o valor de quantity
		//Aqui vou utilizar o this, ele é uma auto-referencia ao objeto, indicando que quer acessar o objeto quantity e não o parametro
		// O this permite diferenciar o atributo da classe do parametro, burlando a ambiguidade
		
		this.quantity += quantity; // aqui somo o objeto com o parametro quantity
	}
	public void removeProducts(int quantity) { //Aqui surge o mesmo papel do ultimo, porém em forma de subtração
		
		this.quantity -= quantity; //faço o uso do this para referenciar o objeto e diminuo pelo parametro
	}
	
	public String toString() { //Uma sobreposição ao objeto Produto
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
