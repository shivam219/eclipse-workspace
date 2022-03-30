package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class dataFormate_iso_format {
	public static void main(String[] args) throws ParseException {

//		LocalDate localDate1 = LocalDate.parse("2019-04-26T20:55:00.000Z");
//		LocalDate localDate2 = LocalDate.parse("2020-01-08");
//
//		// calculate difference
//		long days = Period.between(localDate1, localDate2).getDays();
//		System.out.println(days);
//
//		Date date11 = new Date();
//		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Date d =  new SimpleDateFormat("yyyy-MM-dd").parse("2022-03-29T14:19:25Z".substring(0, 10));
		System.out.println(d);
		
		LocalDate ld = LocalDate.parse("2022-03-28T14:19:25Z".substring(0, 10), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		LocalDate ld2 = LocalDate.now();
		long days = Period.between(ld, ld2).getDays();
		System.out.println(days);
	}
}
