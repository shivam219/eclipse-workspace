package test;

import java.io.*;

class rational1 {
	public rational1() {
	}

	public long gcd(long a, long b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}

public class rational {
	public static void main(String args[]) throws IOException {
		rational1 r = new rational1();
		long a, b, x, y;
		String str;
		DataInputStream in = new DataInputStream(System.in);
		System.out.println("Enter the value for A");
		str = in.readLine();
		a = Integer.parseInt(str);
		System.out.println("Enter the value for B");
		str = in.readLine();
		b = Integer.parseInt(str);
		long l = r.gcd(a, b);
		System.out.println();
		System.out.println("The GCD of the number is:" + l);
		x = a / l;
		y = b / l;
		System.out.println();
		System.out.println("The resultant value is: " + x + "/" + y);
	}
}