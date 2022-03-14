package hackerrank;

import java.util.Scanner;
import java.util.stream.Stream;

public class Scanner_kip_method {
//	private static final Scanner scan = new Scanner(System.in);
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

//		System.out.print("Integer value : ");
//		double salary = scan.nextDouble();
//		scan.skip("\r\n");
//		scan.close();
//		System.out.println("Integer value : "+salary);

//		System.out.println("Enter you roll no ");
//		int  roll = scan.nextInt();
//		scan.nextLine();
//		System.out.println("Enter you name ");
//		String name = scan.nextLine();
//		System.out.println("Enter your school name");
//		String sname = scan.nextLine();
//		System.out.println(roll+ " "+ name + " " + sname);

//		scan.useDelimiter("\\.|\n");
////		scan.useDelimiter("<end>");
//		System.out.println("you typed "+scan.next());
//		System.out.println("you typed "+scan.next());
		System.out.println("j");
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		scanner.close();
		if (N % 2 != 0 && N > 2)
			System.out.println("Weird");
		else if (N % 2 == 0 && N >= 2 && N <= 5)
			System.out.println("Not Weird");
		else if (N % 2 == 0 && N >= 6 && N <= 20)
			System.out.println("Werid");
		else
			System.out.println("Not Weird");
	}
}
