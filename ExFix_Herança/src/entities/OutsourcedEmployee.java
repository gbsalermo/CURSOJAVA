package entities;

public class OutsourcedEmployee extends Employee {
	
	private double additionalCharge;

	
	public OutsourcedEmployee() {
		super();
	}
	
	
	//Construtor da superclasse
	public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}


	public double getAdditionalCharge() {
		return additionalCharge;
	}


	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	//Aplico o override usando o super.
	@Override
	public double payment() {
		return super.payment() +  additionalCharge * 1.1;
	}
	
	
	

}
