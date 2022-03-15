package map;

import java.util.LinkedList;
import java.util.Scanner;

public class LIst_check {
	public static void main(String[] args) {
		System.out.println("tj");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		int value = 0;
		while (N-- > 0) {
			value = sc.nextInt();
			list.add(value);
		}
//		int q = Integer.parseInt(sc.nextLine());
		int q = sc.nextInt();sc.nextLine();
		while (q-- > 0) {
			String qn1 = sc.nextLine();
			if (qn1.equals("Insert")) {
				int index = sc.nextInt();
				int v = sc.nextInt();
				list.add(index, v);

			}
			if (qn1.equals("Delete")) {
				int d = sc.nextInt();
				list.remove(d);
			}
		}
		sc.close();

		for (Integer num : list) {
			System.out.print(num + " ");
		}
	}
}
