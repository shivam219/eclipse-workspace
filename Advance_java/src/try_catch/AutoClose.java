package try_catch;

import java.util.Scanner;

public class AutoClose {
	public static void main(String[] args) {
		try (mystrem stre = new mystrem()) {
			stre.start();
			try {
			System.out.println(10/0);
			}
			catch(Exception e) {
				System.out.println("Inner catch");
				System.out.println(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Outer catch");
		}

	}
}

class mystrem implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("User defind close method call");
	}

	public void start() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}

}
