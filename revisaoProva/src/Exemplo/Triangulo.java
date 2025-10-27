package Exemplo;


//Usando atributos e metodos simples
public class Triangulo {

	//Crio os atributos usados na classe
	public double a; // lado a
	public double b; // lado b
	public double c; // lado c
	
	//métodos
	//Fica sem parametro pois vai receber toda a classe
	
	//Crio o metodo area
	public double area() {
		double p = (a + b + c) / 2.0;
		double result = Math.sqrt(p * ( p - a) * (p - b) * (p - c));
		return result;
		
	}
	
	
	
	
}
