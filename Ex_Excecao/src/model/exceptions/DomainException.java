package model.exceptions;

//Classe de exception personalizada
//Uso o RuntimeException para não precisar tratar
public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg); //Permitir que eu possa instaciar a exceção personalizada passando uma msg pra ela
		
	}
}
