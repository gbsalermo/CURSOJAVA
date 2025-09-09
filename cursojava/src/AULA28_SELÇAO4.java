
public interface AULA28_SELÇAO4 {
	public static void main(String[] args) {
		
		//USO DOUBLE PARA PEGAR PONTO FLUTUANTE E DECLARO AS VARIAVEIS
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		//Math.sqrt(x) para as variaveis receberem Raiz quadrada
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		// Math.pow() para as variaveis receber o valor x elevado ao valor y
		A = Math.pow(x, y);
		B = Math.pow(x,  2.0);
		C = Math.pow(5.0,  2.0);
		System.out.println(x + "elevado a " + y + " = " + A);
		System.out.println(x + "elevado ao quadrado = " + C);
		System.out.println("5 elevado ao quadrado = " + C);
		
		//Math.abs variavel recebe o valor absoluto de x
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de" + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		
		
	}

}
