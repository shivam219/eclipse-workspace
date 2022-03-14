package JAVABASIC;
import java.lang.String;
import java.util.Scanner;
import java.lang.Package;

public class Sample {

	public static void main(String[] args) {
	

		int day=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input");
	day=	sc.nextInt();
		switch(day) {
		case 1:
			System.out.println("monday");
//			break;		
		case 2:
			System.out.println("tueday");
//			break;
		case 3:
			System.out.println("wednesday");
//			break;
		case 4:
			System.out.println("thusday");
//			break;
		case 5:
			System.out.println("friday");
//			break;
		case 6:
			System.out.println("saturday");
//			break;
		case 7:
			System.out.println("monday");
//			break;
			default:
				System.out.println("error");
		}
	
	}
}