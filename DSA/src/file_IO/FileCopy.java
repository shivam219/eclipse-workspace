package file_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		FileInputStream fis = new FileInputStream("C:\\Users\\Shivam\\eclipse-workspace\\DSA\\src\\oi\\Untitled 1");
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\Shivam\\eclipse-workspace\\DSA\\src\\oi\\Untitled 3");

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter src file");
		String srcfile = scn.nextLine();
		
		
		System.out.println("Enter dest file : ");
		String destfile = scn.nextLine();
		
//		FileInputStream fis = new FileInputStream(args[0]);
		FileInputStream fis = new FileInputStream(srcfile);

//		FileOutputStream fos = new FileOutputStream(args[1]);
		FileOutputStream fos = new FileOutputStream(destfile);
		int data;
		while ((data = fis.read()) != -1) {

			fos.write(data);
		}
		System.out.println("File is copied");
		fos.close();
		fis.close();
	}
}
