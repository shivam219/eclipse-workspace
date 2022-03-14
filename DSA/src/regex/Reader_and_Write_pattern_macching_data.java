package regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader_and_Write_pattern_macching_data {

	// reader and writtten
	public static void main(String[] args) throws IOException {

		Pattern p = Pattern.compile("[7-8][0-9]{9}");/// for email --[a-zA-Z0-9] 
		PrintWriter pw = new PrintWriter("output.txt");//"C:\Users\Shivam\Documents\LInux\input.txt"
		BufferedReader br = new BufferedReader(new FileReader("D:\\input.txt"));
		String line = br.readLine();
		while (line != null) {
			Matcher m = p.matcher(line);
			while (m.find()) {
				pw.println(m.group());
				System.out.println("mobile number"+ m.group());
			}
			line = br.readLine();
		}
		pw.flush();
		pw.close();
		br.close();
//		FileInputStream fis 
		BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\Shivam\\Oracle\\eclipse-workspace\\DSA\\output.txt"));
		String s1 = br1.readLine();
		while(s1 != null) {
			System.out.println("no :" + s1);
			s1 = br1.readLine();
			
		}
		
	}
	

}
