package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	
	public static void main(String[] ags) throws ParseException {
		
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		
		List <Product> list = new ArrayList<>();
		
		for ( int i = 1; i <= n; i++) {
			
			System.out.println("Product #" + i + "data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			if(ch == 'i') {
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println();
				System.out.println("Price: ");
				Double price = sc.nextDouble();
				System.out.println("Customs fee: ");
				Double customsFee = sc.nextDouble();
				Product pd = new ImportedProduct(name, price, customsFee);
				list.add(pd);
			}
			else if(ch == 'u') {
				System.out.println();
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Price: ");
				Double price = sc.nextDouble();
				System.out.println("Manufacture Date (DD/MM/YYYY): ");
				Date ManufactureDate = sdf.parse(sc.next());
				Product pd = new UsedProduct(name, price, ManufactureDate);
				list.add(pd);
			}
			else {
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				Product pd = new Product(name, price);
				list.add(pd);
			}
		}
		
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Product pd : list) {
			System.out.println(pd.priceTag());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
