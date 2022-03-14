package file_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class last {
	public static void main(String[] args) throws IOException{

		FileOutputStream fos = new FileOutputStream("c:\\f.txt");
		
		fos.write(97);
		
		fos.close();
		System.out.println("Successfull created class");
		
	}
}
