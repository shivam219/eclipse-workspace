package Fuction;

interface Is {
	public abstract int sum(int a, int b);
}

interface Even {
	public abstract int even(int a[]);
}

interface StrLen {
	public abstract int ss(String s);
}

public class Run {
	public static void main(String[] args) throws InterruptedException {

		StrLen str = (s) -> s.length();
		System.out.println(str.ss("shivam"));
		Even e = (int a[]) -> {
			for (int i = 0; i < a.length; i++) {
				if (i % 2 == 0)
					System.out.println("Even value - " + i);
			}

			return 1;
		};
		int b[] = { 1, 2, 4, 5, 6, 34, 34, 3, 124, 64, 5, 343, 41, 455242 };
		System.out.println(e.even(b));

	}
}
