package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
	
	public static void main(String[] ags) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		//dados
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.println("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Initial Balance: ");
		Double balance = sc.nextDouble();
		System.out.println("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		//Instancio a classe
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f%n", acc.getBalance() );
		}
		catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		sc.close();
	}

}
