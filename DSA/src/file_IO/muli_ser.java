package file_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class muli_ser {}

//	public static void main(String[] args) throws Exception {
//		FileOutputStream f = new FileOutputStream("abc.txt"); // create file if not presetn
//		ObjectOutputStream of = new ObjectOutputStream(f); // throws filee not founded
//		//gp ob = new gp();
//		gpp ob1 = new gpp(); 
//		ppp ob2 = new ppp(); 
//		of.writeObject(ob2);
//		of.writeObject(ob1);
//		System.out.println("succeessully write obejct");
//		Thread.sleep(2000);
//
//		FileInputStream fi = new FileInputStream("abc.txt");
//		ObjectInputStream ofi = new ObjectInputStream(fi);
////		gp ob2 = (gp) ofi.readObject();// interally name class but object referece hold that object
////		System.out.println("succeessully write obejct");
////		System.out.println(ob.i + "  " );
//		gpp gg= null;
//		 ppp  pp = null;
//		Object s = new String();
//		while(s!=null) {
//		
//			s = ofi.readObject();
//			
//			if( s instanceof gpp) {
//				gg = (gpp) s;
//			}
//			else if (s instanceof  ppp) {
//				pp = (ppp) s;
//			}
//		}
//		System.out.println(gg.i);
//		System.out.println(pp.i);
//		
//	}
//}
//class gp implements Serializable {
//
//	int i  =110;
//}
//class p extends gp{
//	int a = 10;
//
//}
//class gpp  implements Serializable {
//		int i =10;
//}
//class ppp  implements Serializable{
//	int i =10;
//	
//}


