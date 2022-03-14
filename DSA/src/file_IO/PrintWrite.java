package file_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWrite {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("output.txt");
		FileReader fc = new FileReader("contact.txt"); // throw file not found exception
		BufferedReader brc = new BufferedReader(fc);//
		String line = brc.readLine();
		while (line != null) {
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));
			String tag = br2.readLine();
			while (tag != null) {
				if (line.equals(tag)) {
					available = true;
				}
				tag = br2.readLine();
			}
			if (!available) {
				pw.println(line);
			}
			line = brc.readLine();
		}
		pw.flush();// get all file
	}
}
