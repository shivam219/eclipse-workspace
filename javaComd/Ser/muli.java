import java.io.*;

class  muli{ // IOException
public static void main(String[] args) throws  Exception {
	FileOutputStream f = new FileOutputStream("abc.txt"); // create file if not presetn
	ObjectOutputStream of =  new ObjectOutputStream(f); // throws filee not founded
	gp ob = new gp();
	of.writeObject(ob);System.out.println("succeessully write obejct");
	Thread.sleep(2000);
	
	FileInputStream fi  = new FileInputStream("abc.txt");
	ObjectInputStream ofi = new ObjectInputStream(fi);
	gp ob2 = (gp) ofi.readObject();// interally name class but object referece hold that object
	System.out.println("succeessully write obejct");
	System.out.println(ob.ob.ob.a +"  " +   "  " );
	}
}
class gp implements Serializable {
	p ob = new p();
}
class p  implements Serializable{
	
	c  ob = new c();
}

class c   implements Serializable{
	int a = 10;

}