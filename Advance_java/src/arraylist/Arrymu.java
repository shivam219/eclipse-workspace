package arraylist;

import java.util.*;

public class Arrymu {
	public static void main(String[] args) {
		ArrayList<String> nu = new ArrayList<String>();
		nu.add("first");
		nu.add("second");
		nu.add("third");
		System.out.println("array size = " + nu.size());

//		
//		Iterator it =nu.iterator();//to get valcue and save it in iterator
//		while (it.hasNext()) 
//		{
//			System.out.println(it.hasNext());
//			
//		}		
//		nu.remove(0);
//		System.out.println(nu.get(1));/// direct print value of certain index value
//		String a = nu.get(2);
//		System.out.println(nu.set(1, ""));
//		System.out.println(nu);
		for (String str : nu)
			System.out.print(str + " ");
	}

}
