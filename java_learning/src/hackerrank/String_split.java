package hackerrank;

import java.util.Scanner;
// better to wrtie scan.nextline();after scaning taking int or double 
public class String_split {
	public static void main(String[] args) {
		System.out.println("Hello");
//		 blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
//		colun : semi-colon ;
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		scan.close();
		boolean  blk = s.isBlank();
		if (!blk) {

			String[] splitString = (s.replaceAll("[!,?._'@\\s]+", " ").split("[\\s!,?._'@]+"));

			System.out.println(splitString.length);
			for (String string : splitString) {
				System.out.println(string);
			}
		}
		else {
			System.out.println(0);
		}

	}

//		System.out.print("Before formate : ");
//		Scanner sc = new Scanner(System.in);
//		String value = sc.nextLine();
////		String value = sc.next();
//		value.strip();

	// 1 format and assign to String array
//		String[] SliptSring = value.split("[\\s!,?._'@]+");

//		System.out.println("after trim : " + value);

}
