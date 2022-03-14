package desirialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

class Abc implements Serializable { // parent class implicity add serialize all class member of fiel
	int a = 10;
	transient int b = 10; // not working

	Abc() { // paramterized constructer then errror invalid class
		System.out.println("abc first excute");
	}

}

class xyz extends Abc {
	int x = 40;
	transient int y = 80;
	static transient int z = 100;/// class level does't take part onsericlizaiont
	final transient int q = 1000;

	xyz() {
		System.out.println("abc first excute");
	}
}

class Ser_class { // default construcotr complusary
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		xyz ob1 = new xyz();
		FileOutputStream fos = new FileOutputStream("file.ser");
		PrintWriter pw = new PrintWriter(fos);
		pw.write("shviam");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ob1);
		System.out.println("Serilizaion complete...done");

		FileInputStream fis = new FileInputStream("file.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		xyz ob2 = (xyz) ois.readObject();
		System.out.println(ob2.a + " " + ob2.b);
		System.out.println(ob2.x + " " + ob2.y + " " + ob2.z + "" + ob2.q);

	}
}
