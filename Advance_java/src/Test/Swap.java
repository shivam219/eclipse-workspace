package Test;
public class Swap {
	public static void main(String[] args) {
		int a = 2; // a = 10
		int b = 3; // b = 20
		a = a + b; // a = 30
		b = a - b; // b = 10
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	
// printing value 1 to 100 without any loop
//show100(1);
	}
	public static void show100(int i) {
		if (i <= 100) {
			System.out.println(i);
			i++;
			show100(i);
		}
	}
}
