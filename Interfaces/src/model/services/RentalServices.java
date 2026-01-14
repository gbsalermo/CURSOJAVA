package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalServices {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	//Association
	private BrazilTaxService  taxService;

	public RentalServices(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		//Uso o duration.between para achar a diferença entre a entrada e o final em minutos
		
		Double minutes = (double) Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60;
		
		double basicPayment;
		if(hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours); //Uso o Math.ceil para arrendondar o valor de horas para cima
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0); 
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
	

}
