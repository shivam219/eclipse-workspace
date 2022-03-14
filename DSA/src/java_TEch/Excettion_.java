package java_TEch;

import java.io.*;

public class Excettion_ {
	public static void main(String[] args) throws Exception {
		try {
			M ob = new M();
			ob.m1();
		} catch (Exception e) {
			System.out.println("Handle ");
		}
	 
		throw new Exception("ss");
	}
}

class M {

	void m1() throws IOException {
		System.out.println("s");
	}
}