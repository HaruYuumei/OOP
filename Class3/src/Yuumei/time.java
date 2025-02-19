package Yuumei;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class time {

	public static void main(String[] args) {
		
		LocalDate dataHoje = LocalDate.now();
		
		System.out.println(dataHoje);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MMMM/yy - EEEE");
		System.out.println(dataHoje.format(format));

	}

}
