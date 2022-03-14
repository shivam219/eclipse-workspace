package desirialize;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Ex implements Externalizable {
	int i = 10;
	transient String surname = "shivam";
	String	 surname2 = "";
	Ex (){
		System.out.println("hii");
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(surname);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		surname2 = (String) in.readObject(); // string from write external method

	}
}

public class Externizable {
	public static void main(String[] args) throws IOException , FileNotFoundException{
		Ex ob = new Ex();
		FileOutputStream fos = new FileOutputStream("exter.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ob);

		FileInputStream fis = new FileInputStream("pas.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
	}
}
