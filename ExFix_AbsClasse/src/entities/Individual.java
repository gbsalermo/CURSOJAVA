package entities;

public class Individual extends Pessoa {
	
	private double healthCusto;
	
	
	//Construtores

	public Individual(String name, double anualIncome, double healthCusto) {
		super(name, anualIncome);
		this.healthCusto = healthCusto;
	}
	//getters e setters

	public double getHealthCusto() {
		return healthCusto;
	}


	public void setHealthCusto(double healthCusto) {
		this.healthCusto = healthCusto;
	}
	

	@Override
	public double tax() {
		if(getAnualIncome() < 2000.00) {
			return getAnualIncome() * 0.15 - getHealthCusto() * 0.50;
		}
		else {
			return getAnualIncome() * 0.25 - getHealthCusto() * 0.50;
		}
	}
	

}
