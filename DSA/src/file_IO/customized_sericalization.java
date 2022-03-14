package file_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class customized_sericalization {
	public static void main(String[] args) throws Exception{
		FileOutputStream f = new FileOutputStream("cur.txt"); // create file if not presetn
		ObjectOutputStream of = new ObjectOutputStream(f); // throws filee not founded
		se1 ob = new se1();	of.writeObject(ob);
		System.out.println("succeessully write obejct");
		Thread.sleep(2000);

		FileInputStream fi = new FileInputStream("cur.txt");
		ObjectInputStream ofi = new ObjectInputStream(fi);
		se1 ob2 = (se1) ofi.readObject();// interally name class but object referece hold that object
		System.out.println("succeessully write obejct");
		System.out.println(ob + "  " + "  ");
		System.out.println(ob.pass);
	
	}
}

class se1 implements Serializable {
	String username = "Rama";
	transient String pass= "Rama";

	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
		String epwd = "123" + pass;
		oos.writeObject(epwd);
	}

	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
		String epwd = (String) ois.readObject();
		pass = epwd.substring(3);//started from 3
	}
}
class se2 implements Serializable {
	String username = "Rama";
	transient String pass= "Rama";
	transient  int  pin= 4655;
	
	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
		String epwd = "123" + pass;
		int epin = 10;
		oos.writeInt(epin+pin);
		oos.writeObject(epwd);
		
	}
	
	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
		String epwd = (String) ois.readObject();
		pass = epwd.substring(3);//started from 3
		int epin = ois.readInt();
		pin = epin -pin;
	}
}