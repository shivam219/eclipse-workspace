package file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Write {
	public static void main(String[] args) throws Exception {
		File f = new File("ko.txt");
		FileWriter fw = new FileWriter(f);// f ref and string as
		fw.write('\n');// new lint \r
//		fw.write("\t");// new lint  \r
		fw.write("shivam  choudhary somwati ramehs choudhary kumar deepa");
		fw.flush();
		fw.close();
		
	}
}

class Reader {
	public static void main(String[] args) throws FileNotFoundException , IOException{
		File f = new File("ko.txt"); f.createNewFile();
		FileReader fr = new FileReader(f);
		char[] ch = new char[(int)f.length()];// return character length
		fr.read(ch);//copy all char[]
		for(char c : ch) {System.out.print(c);}
//		---getting character by charater
	 	int cc = fr.read();
		System.out.println(cc);
		while(cc!=-1) {
			System.out.print(cc); cc= fr.read();
		}
		fr.close();
		
	}
}