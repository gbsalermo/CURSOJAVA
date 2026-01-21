package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public interface Program {
	
	
	public static void main(String[] ags) {
		
		Scanner sc = new Scanner(System.in);
	
		Map<String, Integer> voto = new LinkedHashMap<>();
		
		System.out.println("Enter file full path: ");
		String path = sc.nextLine();
		
		//Crio a excessão para ler o doc
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			//Leitura do doc por linha
			String line = br.readLine();
			
			//Enquanto a linha for diferente de 0
			while(line != null) {
				//Crio o vetor Strin, informando que o conteudo das linhas são separados por ,
				String[] fields = line.split(",");
				String name = fields[0]; //anexo os valores na posição 0 em name
				int count = Integer.parseInt(fields[1]); //Os valores da posição 1 em count(Faço conversão com parse)
			
				//Condicional para votos
				if (voto.containsKey(name)) {
					int TotVotos = voto.get(name);
					voto.put(name, count + TotVotos);	
				}
				else {
					voto.put(name, count);
				}
				line = br.readLine();
			}
			
			for (String key : voto.keySet()) {
				System.out.println(key + ": " + voto.get(key));
			}
			
			
		} catch (IOException e) {
			
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
		sc.close();
	}

}
