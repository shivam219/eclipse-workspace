import java.io.*;

class  conf{ // IOException
public static void main(String[] args) throws  Exception {
	
	FileOutputStream f = new FileOutputStream("abc.txt"); // create file 
	ObjectOutputStream of =  new ObjectOutputStream(f); // select file object
	//name ob = new name();
	
	of.writeObject(ob);
	System.out.println("succeessully write obejct");
	
	FileInputStream fi  = new FileInputStream("abc.txt");
	ObjectInputStream ofi = new ObjectInputStream(fi);
	name ob2 = (name) ofi.readObject();// interally name class but object referece hold that object
	System.out.println("succeessully write obejct");
	System.out.println(ob.name +"  " + ob2.pass + "  " + ob.a);

	
	
	}
}
class name implements Serializable {
	String name = "acc";
	 transient  String pass = "10";
	 static  transient int a = 10;
	 //static not participate in instance leve
}

class gp implements Serializable {
	p ob = new p();
}
class p implements Serializable{
	c  ob = new c();
}

class c implements Serializable{
	int a = 10;

}