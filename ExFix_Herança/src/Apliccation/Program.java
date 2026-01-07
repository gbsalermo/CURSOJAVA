package Apliccation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] ags) {
		
		
		Scanner sc = new Scanner(System.in);
		List <Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <=n; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.println("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			
			if(ch == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				//Adicionando os dados a classe e a lista
				//Observe que uso o upcast
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp); //adiciono na lista
				//Outra forma
				//list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
			}
			else{
				//Faço o mesmo com o Employee normal
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
				//Uma outra forma de fazer
				//list.add(new Employee(name, hours, valuePerHour);
			}		
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
	}
}
