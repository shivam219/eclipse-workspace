package interview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer_cal {
	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("E:\\koo.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("shviam choudhary");
		bw.write("shviam choudhary");
		bw.write("shviam choudhary");
		bw.write("shviam choudhary");
		bw.write("shviam choudhary");
		bw.write("shviam choudhary");
		bw.write("shviam choudhary");
		
		System.out.println("Finish");
		
		
		FileReader file = new FileReader("E:\\koo.txt");
		BufferedReader br = new BufferedReader(file);
		String str ="";
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		
		
	}
}
