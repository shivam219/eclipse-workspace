package Java_Feature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class F_i_L_E_ReaderNewApi {
	/*
	 * \t	Inserts a tab in the text at this point.
\b	Inserts a backspace in the text at this point.
\n	Inserts a newline in the text at this point.
\r	Inserts a carriage return in the text at this point.
\f	Inserts a form feed in the text at this point.
\'	Inserts a single quote character in the text at this point.
\"	Inserts a double quote character in the text at this point.
\\	Inserts a backslash character in the text at this point.
	 */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("rama.txt");///created path 
		List<String>  lines = Files.readAllLines(path);// 
		lines.forEach(System.out::println);//not need e->e key here
		String str = Files.readString(path);
		System.out.println(str);
		String str2 = str.replace("rama","ramaa");
		//write data to file
		Path path2 = Paths.get("rama.txt");///created path 
		Files.writeString(path2 ,str2);
		
	}
}
