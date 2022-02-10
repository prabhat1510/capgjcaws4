package dayfive.datenumbercurrencyapi;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateExample {

	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = date.plusDays(1);
		System.out.println(yesterday);
		System.out.println(tomorrow);
		System.out.println(LocalDate.now().isLeapYear());
		LocalDate dateToCheckLeapYear = LocalDate.of(2016, 1, 31);
		System.out.println(dateToCheckLeapYear.isLeapYear());
		
		LocalDate dateTime = LocalDate.of(2021, 10, 15);
		System.out.println(dateTime);
		LocalDateTime dateWithTime = dateTime.atTime(1,50,9);
		System.out.println(dateWithTime);
		//Get current date
		LocalDate currentDate = LocalDate.now();
		String strDate = currentDate.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Current date in string----"+currentDate);
		
		LocalDate cDate = LocalDate.of(2022, 07, 02);
		System.out.println("cDate in String----"+cDate.format(DateTimeFormatter.ISO_DATE));
		
		//Convert string into a localdate
		String dateString ="2022-02-09";
		LocalDate d1= LocalDate.parse(dateString);
		System.out.println(d1);
		System.out.println(d1.getDayOfMonth());
		System.out.println(d1.getDayOfYear());
		System.out.println(d1.getMonthValue());
		System.out.println(d1.getMonth());
		
		System.out.println("************Custom Format using Date and SimpleDateFormat*******************");
		Date dt = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDt = formatter.format(dt);
		System.out.println(strDt);
		System.out.println("************Custom Format using LocalDate and DateTimeFormatter*******************");
		LocalDate d2 = LocalDate.now();
		System.out.println(d2);
		String formattedDate =d2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(formattedDate);
	}

}
