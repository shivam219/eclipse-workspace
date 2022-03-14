package file_IO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Buffer_Write {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("ss");
		System.out.println("ss");
		File f = new File("ko.txt");
//		FileWriter fr = new FileWriter(f);
		FileWriter fr = new FileWriter(f,true);
		BufferedWriter br = new BufferedWriter(fr);
		char ch [] = {'s','c','d'};
		br.write(ch);
		br.write(75);
		br.write("ramakara", 0, 5);
		br.write(ch,0,1);
//		br.newLine();
	br.close();
	}
}
class BufferRead {
	public static void main(String[] args)throws FileNotFoundException, IOException{
	//	char ch = new char[];//invalid because atleast declare size
		File f = new File("ko.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		BufferedReader br1 = new BufferedReader(fr);
		char ch[] = new char[(int) f.length()];
		char ch2[] = new char[(int)f.length()];
		
		br.read(ch);// insert character in
		for (char c : ch) {
			System.out.print(c);
		}
		
		String str = br1.readLine();
		while(str!=null) {
			System.out.println(str);
		}
	}
}