package regex;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find_file_type {
	public static void main(String[] args) {
//		[a-zA-Z0-9][a-zA-Z0-9_$.]*[.](java|class)
		int count = 0;
		
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_$.]*[.](java|class)"); 
		File f = new File("C:\\Users\\Shivam\\Documents\\LInux");
		String [] s = f.list();
		for(String s1 :s) {
			Matcher m = p.matcher(s1);
			if(m.find()&& m.group().equals(s1))
			{
				count++;
				System.out.println(s1);
			}
		}
		System.out.println("total number of file"+count);
	}
}
