package exceptions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Test.Access;

abstract class hii {
	abstract void hu();

	/*
	 * if declared method as abstract then we can only extends method not declared
	 * in main class
	 */
	public void toDate() {
		int date;
	}
}

public class Get {
	public static void main(String[] args) {
		/*
		 * Access ob = new Access(); System.out.println(ob.rollno);
		 * 
		 * main ob2 = new main(); int a = ob2.s;
		 */
		System.out.println(" programm to print name ");
		Scanner sc = new Scanner(System.in);
		Access ob = new Access();
		ob.showMyName(sc.next());
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(formatter.format(date));

		Date today = new Date(2002, 11, 9);
		System.out.println(today);

	}
}
