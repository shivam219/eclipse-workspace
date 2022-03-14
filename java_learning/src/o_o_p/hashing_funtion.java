package o_o_p;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class hashing_funtion {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner input = new Scanner(System.in);
		MessageDigest m = MessageDigest.getInstance("SHA-256");
		m.reset();
		m.update(input.nextLine().getBytes());
		for (byte i : m.digest()) {
			System.out.print(String.format("%02x", i)); // put zero in empty place
		}
		System.out.println();
	}

}
