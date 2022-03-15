package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_Class {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.println("Program to map using HashMap");
//		Map<String, String> contact = new HashMap<>();
//		Set<String> key = contact.keySet();
//		System.out.println("Enter amount of time to iterate : - ");
//		int n = Integer.parseInt(sc.nextLine());
//		String name = "";
//		String Pno = "";
//		while (n-- > 0) {
//			System.out.print("\nEnter name : ");
//			name = sc.nextLine();
//			System.out.print("\nEnter no : ");
//			Pno = sc.nextLine();
//			contact.put(name, Pno);
//		}
//
////		for (String i : key) {
////			System.out.println(i + " : " );
////		}
//
////		Map has nestes interface entry
//		Set<Map.Entry<String, String>> values = contact.entrySet();
//		for (Entry<String, String> e : values) {
//			System.out.println(e.getKey() + "  " + e.getValue());
//
//		}
//		if method public synchronized void increment(){} -- one thread can access this
//		use AtomicInteger and increase with count.increamentAndGet();
//		String buffer is thread safe mutable

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.valueOf(br.readLine());
//		HashMap<String, Integer> map = new HashMap<>();
//		while (n-- > 0) {
//			String name = br.readLine();
//			int phone = Integer.valueOf(br.readLine());
//			map.put(name, phone);
//		}
		// In map .equals check both key and value of of map
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Map<String, Integer> map = new HashMap<>();

		while (n-- > 0) {
			String name = sc.nextLine();
			int phone = sc.nextInt();
			sc.nextLine();
			map.put(name, phone);
		}

		while (sc.hasNext()) {

			String s = sc.nextLine();

			int no = map.get(s);
			if (map.containsKey(s))
				System.out.println(s + "=" + no);
			else
				System.out.println("Not found");
		}

		// sc.nextInt();sc.nextLine(); == it help on when nothing value is assing at runtinme
		// Integer.parseInt(System.in);  == only valid value is clean and nothing black value is assing 
	}

}
