package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_extends_HashMap {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		Map<String, Integer> map = new HashMap<>();
		// key value
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			in.nextLine();
			map.put(name, phone);

		}
		while (in.hasNext()) {
			String s = in.next();
			if (map.get(s) == null)
				System.out.println("Not found");
			else
				System.out.println(s + "=" + map.get(s));

		}
		in.close();
	}
}
