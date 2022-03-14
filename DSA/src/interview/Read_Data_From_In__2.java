package interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_Data_From_In__2 {
	public static void main(String[] args) throws IOException {
		
		//useing buffer class
		FileReader fr = new FileReader("E:\\ko.txt");

		BufferedReader br = new BufferedReader(fr);

		String str = "";

		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		br.close();
		
		
		// Using scanner class
		File file = new File("E:\\ko.txt");
//		
		Scanner sc = new Scanner(file);
//		
//		while(sc.hasNextLine())
//		{
//			System.out.println(sc.nextLine());
//		}
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
	}
}
