import java.io.*;
import java.util.*;
class filewr{
	public static void main(String[] args) throws Exception{
	File f = new File("ko.txt");
	
	FileWriter fw =  new FileWriter(f);//f ref and string as
		fw.write(97);
		fw.write("shivam");
		fw.close();
		
		
	}
}