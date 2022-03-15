package interface_f;

import java.io.IOException;

interface a {
	void show() throws Exception;

	int a = 10;
}

public class inter_with_exc implements a {

	public void show() throws IOException {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
//		int x = 10;
//		char x ='a';
		String s ="sfd";
		switch (s) {
		case "sfd":

			System.out.println();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + s);
		}
		final int n =23;
		float f = 123.2f;
		Long L =13l;
		switch (10) {
		case n:
		
		
		
		default :
		throw new IllegalArgumentException("Unexpected value: " + f);
		}
	}
}
