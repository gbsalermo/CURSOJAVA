package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalServices;

public class Program {
	public static void main(String[] ags) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		
		System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		//Explicando essa linha, crio a variavel start, ponho ela para receber um localDateTime
		//o .parse serve para o dado que eu vou pegar do teclado com o sc.nextLine() e o , fmt é a formatação do dado adicionada la em cima
		
		System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Entre com preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.println("Entre com preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalServices rentalService = new RentalServices(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + cr.getInvoice().getTax());
		System.out.println("Pagamento total:  " + cr.getInvoice().getTotalPayment());

		
		sc.close();
		
		
		
	}
}
