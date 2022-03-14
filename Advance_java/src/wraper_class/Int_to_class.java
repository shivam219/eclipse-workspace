package wraper_class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Int_to_class 
{

	public static void main(String args[]) throws IOException 
	{
		char ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
		while (true) 
		{
			System.out.println("Enter a Character  ");
			ch = (char) br.read();
			System.out.println("your Enter");
			
			if (Character.isDigit(ch))
				System.out.println("it is a digit");
			
		}
		
//		while (true) 
//		{//sdf
//			System.out.println("Enter a charachter");
//			ch = (char) br.read();
//			System.out.println("you eneterd");
//			if (Character.isDigit(ch))
//				System.out.println("it is a digit");
//			else if (Character.isUpperCase(ch))
//				System.out.println("it is a Uppercase");
//			else if (Character.isLowerCase(ch))
//				System.out.println("it is a Lowercase");
//			else if (Character.isSpaceChar(ch))
//				System.out.println("it is a space");
//			return;
//		}
	}
}
