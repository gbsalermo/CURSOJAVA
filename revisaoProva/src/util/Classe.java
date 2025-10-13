package util;

public class Classe {
	
	/*ex.1 triangulos
	//Atributos
	
	public double larg;
	public double alt;
	
	//Crio o construtor
	public Classe(double larg, double alt) {
		
		this.larg = larg;
		this.alt = alt;
	}
	
	//primeiro metodo Area()
	public double Area() { 
		return larg * alt;
	}
	//Segundo metodo Perimetro
	public double Perimetro() {
		return 2 * (larg + alt);
	}
	//Terceiro metodo Eh_quadrado
	public boolean Eh_quadrado() {
		if(alt == larg) {
			return true;
		}
		else {
			return false;
		}
		
		
	}*/
	//Lampada
	
	public boolean estado;
	public int watts;
	
	//construtor com argumentos
	
	public Classe(int watts) {
		
		this.watts = watts;
	}
	//Construtor sem argumentos
	
	public Classe() {
		this.watts = 60;
	}
	
	//Metodo
	
	public void Ligar() {
		this.estado = true;
	}
	public void Desligar() {
		this.estado = false;
	}
	
	
}
