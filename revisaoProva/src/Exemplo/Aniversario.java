package Exemplo;

public class Aniversario {

	private String nome;
	private int idade;
	private double altura;
	
	
	//Construtor padrão
	public Aniversario(){
	}
	
	public Aniversario(String nome, int idade, double altura) {
		
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;

	}
	
	
	
	//getters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	//metodos
	public void fazerAniversario() {
		this.idade++; //uso o this para incrementar o atributo
	}
	
	public void apresenta() {
		System.out.println("O nome é: " + nome);
		System.out.println("A altura é: " + altura);
		System.out.println("Sua idade: " + idade);
	}
	
}
