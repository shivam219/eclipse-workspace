package exce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//two new feature with respect 
// try with resourse
// multi-catch block
//
public class try_with_resource {
	public static void main(String[] args) throws IOException {
//		int x =10;;;;;;;;;;;;;;;;;;
//				assert(x==10);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(""));
			// file not founded
		} catch (Exception e) {

		} finally {
			if (br != null) {
				br.close();
			}
		}
		try (FileReader fr = new FileReader(""); FileReader fr1 = new FileReader("");) {

		} finally {

		}

	}
}
