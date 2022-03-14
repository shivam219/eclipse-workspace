import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class  noImpPar{
public static void main(String[] args) throws Exception {
		FileOutputStream f = new FileOutputStream("abc.txt"); // create file if not presetn
		ObjectOutputStream of = new ObjectOutputStream(f); // throws filee not founded
		
		q  ob1 = new q();
		of.writeObject(ob1);
		System.out.println("succeessully write obejct");
		Thread.sleep(1000);

		FileInputStream fi = new FileInputStream("abc.txt");
		ObjectInputStream ofi = new ObjectInputStream(fi);
		q ob2 = (q) ofi.readObject();// interally name class but object referece hold that object
		System.out.println("succeessully read obejct");	
		System.out.println( ob2.a);	
			

}}

class p {
	public p(){
			System.out.println( "Constructor call of p is not implements seriazable");	
	}
int a = 10;	
}
class q extends p implements Serializable {
	int c = 20 ;
}