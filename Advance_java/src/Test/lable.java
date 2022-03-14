package Test;

public class lable {
	public static void main(String[] args) {
		Label1: for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break Label1;

			}
			System.out.println("this not are " + i);

		}
	}
}
