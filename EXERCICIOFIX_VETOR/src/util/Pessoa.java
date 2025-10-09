package util;

public class Pessoa {
	
	//Variaveis
	private String nome;
	private double altura;
	private int idade;
	
	//Construtor
	public Pessoa(String nome, double altura, int idade) { 
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
	}
	
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome() {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura() {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade() {
		this.idade = idade;
	}
	

}
