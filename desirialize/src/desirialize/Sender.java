package desirialize;

import java.io.*;

public class Sender {
	private static final long serialVerisonUID = 1L;
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {
		Uid ob = new Uid();
		FileOutputStream fos = new FileOutputStream("uid.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ob);
		

//		Object

	}

}
