package file_hand;

import java.io.FileOutputStream;
import java.util.concurrent.ExecutionException;

public class me_a {

	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
			String s= "welcome to  need for speed";
			
			byte ss[]=s.getBytes();
			fout.write(ss);
			fout.close();
			System.out.println("success...");
			}
		catch(Exception e) {
			System.out.println(e);
		}

	
}}