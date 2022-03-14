package hackerrank;

import java.util.Scanner;

public class check_para {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {	//  ---\\(\\)|\\[\\]|\\{\\}
			String line = sc.next().replaceAll("\\{\\}|\\(\\)|\\[\\]", "");
			System.out.println(line.isEmpty());
		}
	}

}
