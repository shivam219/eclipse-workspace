package file_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class gp implements Serializable {p ob = new p();}
class p   implements Serializable {c ob = new c();}
class c   implements Serializable {int a = 10;}
public class Seriable_as {
	public static void main(String[] args) throws  ClassNotFoundException, IOException {
		FileOutputStream f = new FileOutputStream("abc.txt"); // create file 
		ObjectOutputStream of =  new ObjectOutputStream(f); // select file object
		gp ob = new gp();
		of.writeObject(ob);
		System.out.println("succeessully write obejct");
		FileInputStream fi  = new FileInputStream("abc.txt");
		ObjectInputStream ofi = new ObjectInputStream(fi);
		gp ob2 = (gp) ofi.readObject();// interally name class but object referece hold that object
		System.out.println("succeessully write obejct");
		System.out.println(ob2.ob.ob.a);
	//	 c obc = (c) ob2;//only possible when parent child relaion is there
//		 System.out.println(obc.a);
		ArrayList<Integer> ne = new ArrayList<>();
		ne.ensureCapacity(10);
		ne.size();
	}
}

class conf {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileOutputStream f = new FileOutputStream("abc.txt"); // create file
		ObjectOutputStream of = new ObjectOutputStream(f); // select file object
		name ob = new name();
		of.writeObject(ob);
		System.out.println("succeessully write obejct");

		FileInputStream fi = new FileInputStream("abc.txt");
		ObjectInputStream ofi = new ObjectInputStream(fi);
		name ob2 = (name) ofi.readObject();// interally name class but object referece hold that object
		System.out.println("succeessully write obejct");
		System.out.println(ob.back + "  " + ob2.na);

	}
}

class name implements Serializable {
	String na = "acc";
	String back = "10";
}
