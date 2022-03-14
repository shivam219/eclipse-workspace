package file_IO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class File_Reading_from_directory {
	public static void main(String[] args) throws IOException {
		/// File f = new File("abc.txt");// no exception is there but performing any
		/// action the throws or caugh
//		System.out.println(f.exists());
		// f.createNewFile();
		// System.out.println(f.exists());
		// System.out.println(f.isDirectory());
//		File f1 = new File("fold", "abc.txt");
		/// file not found exc eption should be thrown or caught
		File f3 = new File("E:\\"); // return E:
		System.out.println(f3.length());// 8192 which length i dont know
		System.out.println(f3.list());
		
		
		String str[] = f3.list(); // return folder and file
//		for (String st : str) {
//			File f4 = new File(f3, st);	/// in folede , folder is there with this name
//			if (f4.isDirectory()) {
//				while (f4.isDirectory()) {
//					String in[] = f4.list();
////					Arrays.stream(f4.list()).forEach(e -> System.out.print(e + " "));
//				
//					break;//valid  	
//				}

//			}
//		}
		
	}
}
