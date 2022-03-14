package file_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class readFile_name {

	public static void main(String[] args) throws Exception {
		File note = new File("note.txt");
		note.createNewFile();
		FileWriter fr = new FileWriter(note);
		File f = new File("C:\\Users\\Shivam\\Documents\\A_C_Deepa_web\\Z_web\\media2");

		String filesOrFolder[] = f.list();
		for (String fileName : filesOrFolder) {
			File checkFile = new File(f, fileName);
			if (checkFile.isFile() && fileName.contains(".mp3")) {
//				fr.write(fileName +"\n"); fr.flush();
				System.out.println(fileName);
				String sD[] = fileName.split("_");
				fr.write(" <li onclick=\"profile( " + sD[0] + ", 'media/" + sD[1] + " ', 'songimg/" + sD[2] + "', '"
						+ sD[3] + "',  '" + sD[4] + "')\"> " + sD[4] + " </li>");
				fr.write("\n");
				fr.flush();
			}
		}
	}
}

class String_function {
	public static void main(String[] args) {
		String str = "shivamchoudhary2002211@gmail.com";
		System.out.println("sd");
		Pattern p = Pattern.compile("[\\w][\\w.-]*@[\\w.-]+.([.][\\w]+)");
//		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)");

		Matcher m = p.matcher(str);
		while (m.matches()) {
			System.out.println(m.group());
			break;
		}

	}
}