package file_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Inputlass {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Shivam\\eclipse-workspace\\DSA\\src\\oi\\Untitled 1");
//		int data1  =  fis.read();/// first value ascii 
//		int data2 =  fis.read();/// first value ascii 
//		int data3  =  fis.read();/// first value ascii 
//		int data4 =  fis.read();/// first value ascii 
//		int name5 = fis.read();// -1 if not byte and read one byte data
		int data;
		while ((data = fis.read()) != -1) {
			System.out.println( data +"\t"+ (char)data);
		}
		fis.close();
		
	}
}
