package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class Program {

	public static void main(String[] ags) throws ParseException {
		
		
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY"); //Formatação da data
		
		System.out.println("Enter cliente data: ");
		System.out.println("name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("Birth date (DD/MM/YYYY): " );
		Date birthDate = sdf.parse(sc.next()); //Pego o valor digitado e uso a formatação
		
		Cliente cliente = new Cliente(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, cliente);
		
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
		
		//Crio o for para pegar os dados do produto
		for(int i = 1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.println("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			
			//Instancio a classe Product
			Product product = new Product(productName, productPrice);
			
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			
			//Adiciono orderItem ao order
			order.addItem(orderItem);
			
		}
		
		System.out.println();
		System.out.println("Order Summary: ");
		System.out.println(order);
		
		
		
		sc.close();
		
	}
}
