package desirialize;

import java.io.*;

public class Receiver {
	private static final long serialVerisonUID = 1L;
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("uid.ser");
		ObjectInputStream oos = new ObjectInputStream(fis);
		Uid ob2 = (Uid) oos.readObject();

	}
}
