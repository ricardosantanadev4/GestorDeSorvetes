package GESTAOSORVETES.GESTAOSORVETES;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import entidade.Lote;

public class Ricardotestes {

	public static void main(String[] args) {
		// Exibe a data atual no console
		LocalDate hoje = LocalDate.now();
//		System.out.println(hoje);

		String data = "11/04/2021";
		String data1 = "02/04/2021";
		String data2 = "03/04/2021";
		
		LocalDate ld = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate ld1 = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate ld2 = LocalDate.parse(data2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

//		System.out.println(ld1.isAfter(ld));//false
//		System.out.println(ld.isAfter(ld1));//true
//		System.out.println(ld.isBefore(ld1));//false
//		System.out.println(ld2.isEqual(ld));//true
        
		System.out.println(ld2.isBefore(hoje));
		System.out.println(ld.isBefore(hoje));
		System.out.println(hoje.isBefore(ld));
		
		long diferencaEmDias = ChronoUnit.DAYS.between(ld2, hoje);
		System.out.println(diferencaEmDias);
		
		
	}
}
