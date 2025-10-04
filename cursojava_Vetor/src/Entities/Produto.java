package Entities;

public class Produto {
	
	//variaveis
	private String name;
	private double price;
	
	//construtor
	public Produto(String name, double price) {
		this.name = name;
		this.price = price;
	}
	//gets e sets
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

}
