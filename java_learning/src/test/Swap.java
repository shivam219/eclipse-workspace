package test;

public class Swap {
	public static void main(String[] args) {
//		int a = 2; // a = 2
//		int b = 3; // b = 3
//		a = a + b; // 5
//		b = a - b; // 5-3 = 2
//		System.out.println(b);
//		a = a - b; // 5-2 = 3
//		System.out.println(a);
		// printing value 1 to 100 without any loop
		show100(1);
		
	}

	public static void show100(int i) {
		if (i <= 100) {
			System.out.println(i);
			i++;
			show100(i);
		}
	}
}
