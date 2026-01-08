package entities;

public abstract class Pessoa {

	
	//atributos
	private String name;
	private double anualIncome;
	
	//Contrutores


	public Pessoa(String name, double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	//getters e setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	//metodo abstrato
	public abstract double tax();
}
