package M_f;

import java.util.ArrayList;

public class fizz_buzz {

	public static void main(String[] args) {
		System.out.println((3));
	}
	public  ArrayList<String> fizzBuzz(int A) {
		ArrayList<String> al = new ArrayList<String>();
		boolean fizz[] = new boolean[A+1];
		for (int i = 3; i <= A; i++) {
			fizz[i] = true;
			i = i + 2;
		}
		boolean buzz[] = new boolean[A+1];
		for (int i = 5; i <= A; i++) {
			buzz[i] = true;
			i = i + 4;
		}

		for (int i = 1; i <= A; i++) {
			al.add("" + i);
			if (fizz[i] && buzz[i]) {
				al.set(i-1, "FizzBuzz");
			} else {
				if (fizz[i]) {
					al.set(i-1, "Fizz");
				}
				if (buzz[i]) {
					al.set(i-1, "Buzz");
				}
			}
		}
		return al;
	}
}
