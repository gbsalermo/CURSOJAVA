package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
	
	public static void main(String[] ags) {
		
		
		//Estrutura para armazenar cookies
		Map<String, String> cookies = new TreeMap<>();
		
		//cookies.put(apelido, valor do apelido)
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		
		cookies.remove("email");
		cookies.put("phone", "9998888555");
		
		//Verificando se contem
		System.out.println("Contains key 'phone'? " + cookies.containsKey("phone"));
		
		//Pegando o valor do elemento
		System.out.println("Phone number: " + cookies.get("phone"));
		
		//Tamanho do map
		
		System.out.println("Size: " + cookies.size( ));
		
		System.out.println("ALL COOKIES: ");
		//A função keySet() - retorna um Set<k>
		for ( String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
	}

}
