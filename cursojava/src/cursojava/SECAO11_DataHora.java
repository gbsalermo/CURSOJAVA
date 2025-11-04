package cursojava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;



public interface SECAO11_DataHora {

	public static void main(String[] ags) {
		
		Scanner sc = new Scanner(System.in);
		/*DATAS E HORAS
		//Link da classe LocalDate
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
	
		//data local
		LocalDate d1 = LocalDate.now();
		//data e hora local
		LocalDateTime d2 = LocalDateTime.now();
		//data e hora GMT - horario de londres
		Instant d3 = Instant.now();
		//gerar um texto iso 8601
		LocalDate d4 = LocalDate.parse("2025-10-30");
		LocalDateTime d5 = LocalDateTime.parse("2025-10-30t10:13:30");
		Instant d6 = Instant.parse("2025-10-30t10:13:30Z");
		//imprindo o horario de londres no instante
		Instant d7 = Instant.parse("2025-10-30t10:13:30-03:00");
		//TEXTO CUSTOMIZADO
		//LocalDate d8 = LocalDate.parse("30/10/2025"); exemplo de erro
		//convertendo para o java aceitar o exemplo acima
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d8 = LocalDate.parse("30/10/2025", fmt1); //agora funciona
		//LocalDateTime d9 = LocalDateTime.parse("30/10/2025 01:30", fmt1); //Aqui da erro de novo pois esta diferente do formato acima
		//Convertendo
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //de 1 as 12 se usa HH
		LocalDateTime d9 = LocalDateTime.parse("30/10/2025 01:30", fmt2); //agora funciona
		//Local Date passando dia mes e ano separado
		LocalDate d10 = LocalDate.of(2025,  10, 30);
		//Com horario agora
		LocalDateTime d11 = LocalDateTime.of(2025, 10, 30, 10, 39);
		
		//print basico
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
		System.out.println(d9);
		System.out.println(d10);
		System.out.println(d11);
		
		//print com toString() - transformando diretamente o objeto para o padrao ISO
		System.out.println("d1 = " + d1.toString());
		System.out.println("d2 = " + d2.toString());
		System.out.println("d3 = " + d3.toString());
		System.out.println("d4 = " + d4.toString());
		System.out.println("d5 = " + d5.toString());
		System.out.println("d6 = " + d6.toString());
		System.out.println("d7 = " + d7.toString());
		System.out.println("d8 = " + d8.toString());
		System.out.println("d9 = " + d9.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
		
		*/
		/*CONVERTENDO DATA-HORA PARA TEXTO
		
		
		//USANDO EXEMPLOS ANTERIORES
		LocalDate d4 = LocalDate.parse("2025-10-30");
		LocalDateTime d5 = LocalDateTime.parse("2025-10-30t10:13:30");
		Instant d6 = Instant.parse("2025-10-30t10:13:30Z");
		
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
		
		//posso chamar de três formas
		System.out.println("d4 =" + d4.format(fmt1));
		System.out.println("d4 =" + fmt1.format(d4));
		System.out.println("d4 = " + d4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		//formatar localDateTime
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

		//posso chamar
		System.out.println("d5 =" + d5.format(fmt1));
		System.out.println("d5 = " + d5.format(fmt2));
		
		//Agora formatar Instant
		//a função (ZoneId.systemDefault() usa o fuso horario do sistema local
		//é necessario especificar o fuso horario em horarios assim
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault());

		//posso chamar
		System.out.println("d6 =" + fmt3.format(d6));
		
		//existem outros padrões no site datetime
		//ex:
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		
		//chamando
		
		System.out.println("d5 =" + d5.format(fmt4)); 

		// não tem como fazer com fmt4.format(d5) em instante, pois o iso_date nao tem fuso horario
		//nesse caso podemos usar
		
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		System.out.println("d6 =" + fmt5.format(d6)); 
		//da pra fazer d6.toString() tambem


		*/
		//Convertendo data-hora global para local
		
		LocalDate d4 = LocalDate.parse("2025-11-04");
		LocalDateTime d5 = LocalDateTime.parse("2025-11-04T00:24:00");
		Instant d6 = Instant.parse("2025-11-04T00:25:00Z");
		
		//Converter em uma localdate
		
		//ZoneId.systemDefault() Aqui ele considera o fuso horario do meu computador
		LocalDate r1 = LocalDate.ofInstant(d6, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d6, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d6, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d6, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		//Imprimindo dia, mes e ano
		
		System.out.println("d4 dia = " + d4.getDayOfMonth());
		System.out.println("d4 mês = " + d4.getMonthValue());
		System.out.println("d4 ano = " + d4.getYear());
		System.out.println("d5 hora = " + d5.getHour());
		System.out.println("d5 minuto = " + d5.getMinute());
		
		
		
		sc.close();
		
		
		
	}
}
