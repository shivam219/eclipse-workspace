package JAVABASIC;

import java.util.*;

///comparaTo 0 == equal 
//comparaTo 1  == date is gerate
//compara to -1== data is less
public class Date_clas {
	public static void main(String[] args) {
		Date da1 = new Date(2022, 1, 14);
		Date da2 = new Date(2022, 1, 15);
		System.out.println("Date is " + da1.toString());
		int comp = da1.compareTo(da2);
		System.out.println(" cur " + comp);
	}
}
