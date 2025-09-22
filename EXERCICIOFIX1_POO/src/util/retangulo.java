package util;

public class retangulo {
	
	public double a, l; //crio as variaveis
	
	public double area() {
		
		return a * l; //calculo a area
		
	}
	public double pm() {
		
		return 2 * (a + l); // calculo de comprimento
		
	}
	public double dg() {
		return Math.sqrt(a * a + l * l); //calculo de diagonal
	}

}
