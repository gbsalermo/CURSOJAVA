package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;
import services.CalculationService;

public class Program {
	
	public static void main(String[] ags) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		List<Product> list = new ArrayList<>();
		
		//Crio um camino
		String path = "C:\\temp\\in.txt";
		
		//Crio Exceções
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(","); // Esse split recorta cada pedaço de String antes da virgula
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				//Double.parseDouble(fields[1] Serve para converter de String para double
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Max: ");
			System.out.println(x);
		} catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
	}

}
