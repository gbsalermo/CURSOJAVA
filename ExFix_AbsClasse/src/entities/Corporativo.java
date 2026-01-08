package entities;

public class Corporativo extends Pessoa {

	//atributos
	private int numberFunc;

	//construtor

	public Corporativo(String name, double anualIncome, int numberFunc) {
		super(name, anualIncome);
		this.numberFunc = numberFunc;
	}

	public int getNumberFunc() {
		return numberFunc;
	}

	public void setNumberFunc(int numberFunc) {
		this.numberFunc = numberFunc;
	}

	@Override
	public double tax() {
		if(numberFunc > 10){
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}

	}
	
	
	
}
