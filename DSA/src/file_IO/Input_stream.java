package file_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Input_stream {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
//		InputStreamReader ir = new InputStreamReader(System.in);

		FileReader fr = new FileReader("D:\\koo.txt");

		// bufferedReader works with instreamStream and fileREader
		BufferedReader br = new BufferedReader(fr);

//		int a = Integer.parseInt(br.readLine());// take individual input
//
//		float b = Float.parseFloat(br.readLine()); // take individual input

		String str = br.readLine();

//		System.out.println(a + "\n" + b + "\n" + str);
		System.out.println(str);
	}
}
