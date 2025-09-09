import java.util.Scanner; //Para utilizar o Scanner
//import java.util.Locale; //para usar ponto flutuante // biblioteca de locale
public interface AULA26_27_SEÇÃO4 {
	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);	// o Localle tem de vir antes do scanner
		Scanner sc = new Scanner(System.in); //declaro sc como novo Scanner de entrada de dados
	
		/*String x; 
		x = sc.next(); // para ler uma palavra*/
		/*int x;
		x = sc.nextInt(); //para ler um número inteiro */
		
		/*double x;
		x = sc.nextDouble(); //para ler ponto flutuante*/
		
		/*char x;
		x = sc.next().charAt(0);//para ler caracter */
		
		/*	//ler varias variaveis
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		
		//System.out.printf("Você digitou: %.2f%n", x ); // o printf com %.2f%n é para imprimir com virgula
		System.out.println("Você digitou: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		*/
		
		//Para ler o texto até a quebra de linha
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); //Nextline pendente
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
		
	}
}
