package entities;

public class Produto { // crio a classe produto
	
	//crio os atributos de acordo o problema
	public String name; // atributos e metodos tem nome com inicial minuscula
	public double price;
	public int quantity;
	
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
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " unit, Total: $"
				+ String.format("%.2f", totalValueInStock()); //String.format serve para as casas decimais
		
	}
}
