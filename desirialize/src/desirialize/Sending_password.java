package desirialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Pass implements Serializable {
	String name = "shivam";
	String carypws;
	transient String pas = "rama";

	private void writeObject(ObjectOutputStream o) throws Exception {
		o.defaultWriteObject();// tell jvm to wirte
		String pws = 123 + pas;
		o.writeObject(pws);
	}

	private void readObject(ObjectInputStream o) throws Exception {
		o.defaultReadObject();
		String pws = (String) o.readObject();
		pas = pws.substring(3);
	}
}

public class Sending_password {

	String name = "deepak";

	private void mi() {
		String name = "shivam";

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Pass ob = new Pass();
		FileOutputStream fos = new FileOutputStream("pas.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ob);

		FileInputStream fis = new FileInputStream("pas.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Pass ob2 = (Pass) ois.readObject();
		
		System.out.println(ob2.pas);
	}
}
