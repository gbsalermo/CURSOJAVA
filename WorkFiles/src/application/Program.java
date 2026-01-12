package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] ags) {
		
		
		/*Lendo arquivo texto com classes File e Scanner
		//instancio o file
		File file = new File("C:\\Users\\enzog\\OneDrive\\Área de Trabalho\\Artigo Fisica.docx");
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(file); //no lugar de System.in add um arquivo
			while(sc.hasNextLine()) {
				System.out.println((sc.nextLine()));
			}
			sc.close();
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
		
		*/
		/*FileReader(Stream de leitura de caracteres a partir de arquivos
		//BufferReader(mais rápido)
		
		String path = "C:\\Windows\\Temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path); //leitor
			br = new BufferedReader(fr); //aqui deixa mais rapida a leitura
			
			String line = br.readLine(); //Faço a leitura de uma linha
			//Crio um while para verificar se ainda existe algo na linha
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) { //crio a excessão
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
			if(br != null) {
				br.close();
			}
			if (fr != null) {
				fr.close();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}}
		*/
		/*Bloco try-with-resources
		
		String path = "C:\\Windows\\Temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine(); //Faço a leitura de uma linha
			//Crio um while para verificar se ainda existe algo na linha
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) { //crio a excessão
			System.out.println("Error: " + e.getMessage());
		}
		*/
		
		/*FileWriter e BufferedWriter
	
		 String[] lines = new String[] { "Good morning", "Good afternoon", "good night" };
		 
		 String path = "c:\\temp\\out.txt";
		 
		 try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ // o true dps do path serve para ele nao recriar o arquivo, e sim escrever caso o arquivo ja exista
			 for (String line : lines) {
				 bw.write(line); //Esceve no arquivo
				 bw.newLine(); //quebra linha
			 }
		 }
		 catch (IOException e) {
			 e.printStackTrace();
		 }
		 */

	/*Manipulando pastas com File
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		//Pegar so a lista de arquivos
		File [] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for( File file : files) {
			System.out.println(file);
		}
		//Criar uma subPasta
		
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory Created sucessfully: " + sucess);
		
	
		sc.close();
		*/

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a file path: "); //peço o caminho do arquivo
	String strPath = sc.nextLine();
	
	File path = new File(strPath);//Crio a manipulação do arquivo
	
	System.out.println("getName: " + path.getName()); // pegar apenas o nome do arquivo
	System.out.println("getParent: " + path.getParent()); //pegar só o caminho sem o nome do arquivo
	System.out.println("getPath: " + path.getPath()); //caminho completo
	
	
	
	
	sc.close();
	
	}
	

}
