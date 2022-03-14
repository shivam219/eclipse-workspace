package Fuction;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
public class Date_api {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt.getDayOfWeek());//WEDnesday
		System.out.println(dt.getDayOfMonth());//15
		System.out.println(dt.getDayOfYear());//150
		System.out.println(dt.getSecond());
		
//		Year y = Year.of(2021);
	//	
		LocalDate bir= LocalDate.of(2002, 7, 18);
		LocalDate cur = LocalDate.now();
		Period p = Period.between(bir, cur);/*only for */
		
		System.out.println(p.getDays());
//		LocalTime t = LocalTime.now();
		LocalTime t  = LocalTime.of(1, 2);
		LocalTime t1 = LocalTime.now();
		
		
		System.out.println(t1.isAfter(t));/*true boolean */
		
		
		
	}
}