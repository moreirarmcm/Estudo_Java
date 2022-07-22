package LocalDate_003;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Manipulação básica de datas usiando java.time;
 * 
 *|Util|
 *
 * 
 * @author Renan Moreira
 *
 */
public class UsandoDatas {

	public static void main(String[] args) {
		LocalDate data_atual = LocalDate.now();
		LocalDate data_futura = LocalDate.of(2023, 10, 9); 
		System.out.println("Data de hoje: " + data_atual + "\nData de aniversário no ano que vem: " + data_futura);
		System.out.println("==============================================");
		Period intervalo_tempo = Period.between(data_atual, data_futura); // Mostra o intervalo entre uma data e outra
		System.out.println(intervalo_tempo);
		System.out.println("Faltam " + intervalo_tempo.getDays() + " dia(s), " + intervalo_tempo.getMonths() + " mes(es) e " + intervalo_tempo.getYears() + " ano(s) para " + data_futura);
		System.out.println("==============================================");

		DateTimeFormatter formatador_data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(data_atual.format(formatador_data));
		
		LocalDateTime data_e_hora = LocalDateTime.now();
		formatador_data = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		System.out.println(data_e_hora.format(formatador_data));
	}
}
