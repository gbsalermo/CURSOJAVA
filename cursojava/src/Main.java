import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
	//	int y = 32;
		//double x = 10.35784;
	/*	System.out.println("Ola Mundo!");
		System.out.println(y);
		System.out.println(x);
	
		Locale.setDefault(Locale.US);
		//System.out.printf("%.2f%n", x);
		System.out.println("Resultado = "+ x + " Metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		*/
		
		//#AULA24_FIXAÇÃO
		String product1 = "computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.printf(product1 + ", which price is $ %.2f %n", price1 );
		System.out.printf(product2 + ",which prince is $ %.2f %n", price2 );
		System.out.println("Record: " + age + "years old, code" + code + "and gender: " + gender);
		System.out.printf("Measue with eight decimal places: %.8f %n", measure  );
		System.out.printf("Rouded(three decimal places): %.3f %n", measure );
		Locale.setDefault(Locale.US);
		System.out.printf(" %.3f %n", measure);
}}
