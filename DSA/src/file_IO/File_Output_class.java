package file_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Output_class {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileOutputStream fis = new FileOutputStream("C:\\Users\\Shivam\\eclipse-workspace\\DSA\\src\\oi\\Untitled 3");

		fis.write(97);
		fis.close();
		System.out.println();
	}
}
