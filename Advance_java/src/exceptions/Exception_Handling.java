package exceptions;

public class Exception_Handling {
	public static void main(String[] args) {

		int i = 5;

		try {
			if (i < 10) {
				throw new Excep("Errorr");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Excep extends Exception {

	public Excep(String mess) {
		super(mess);
	}

}