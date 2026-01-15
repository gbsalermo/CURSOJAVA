package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.PaypalService;
import model.services.contractService;

public class Program {

	public static void main(String[] ags) {
		
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.println("Number: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.println("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract obj = new Contract(number, date, totalValue);
		
		System.out.println("Entre com o numero de parcelar: ");
		int n = sc.nextInt();
		
		contractService contractService = new contractService(new PaypalService());
		
		contractService.processContract(obj, n);
		
		System.out.println("PARCELAS: ");
		for(Installment installment : obj.getInstallments()) {
				System.out.println(installment);
		}
		
		
		
		
		
		
		
		
		sc.close();
		
	}
}
