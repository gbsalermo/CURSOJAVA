package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Corporativo;
import entities.Individual;
import entities.Pessoa;

public class Program {
	
	public static void main(String[] ags) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		List <Pessoa> list = new ArrayList<>();

		
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Taxa payer #" + i + " data: ");
			System.out.println();
			System.out.println("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			if(ch == 'i') {
				System.out.print("Name: ");
				String name = sc.next();	
				System.out.println("Anual Income: ");
				Double anualIncome = sc.nextDouble();
				System.out.println("Health expenditures: ");
				Double healthCusto = sc.nextDouble();
				Pessoa pessoa = new Individual(name,anualIncome, healthCusto );			
			}
			else {
				System.out.print("Name: ");
				String name = sc.next();	
				System.out.println("Anual Income: ");
				Double anualIncome = sc.nextDouble();
				System.out.println("Number of employee ");
				int NumberFunc = sc.nextInt();
				Pessoa pessoa = new Corporativo(name, anualIncome, NumberFunc);	
			}
			
		}
		
		double sum = 0;
		System.out.println();
		System.out.println("Taxes Paid: ");
		for(Pessoa pessoa : list) {
			double tax = pessoa.tax();
			System.out.println(pessoa.getName() + " $ " + String.format("%.2f", tax));
			sum += tax;
			}
		System.out.println();
		System.out.println("Total: " + " $ " + String.format("%.2f", sum));
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
