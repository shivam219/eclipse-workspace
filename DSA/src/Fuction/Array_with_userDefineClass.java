package Fuction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Array_with_userDefineClass {
	public static void main(String[] args) {
		ArrayList<Emp> emp = new ArrayList<Emp>();
		emp.add(new Emp("rama", 1));
		emp.add(new Emp("deepak", 4));
		emp.add(new Emp("shivam", 7));
		emp.add(new Emp("kaka", 2));
		emp.add(new Emp("ramesh", 5));
		emp.add(new Emp("suraj", 3));
		emp.add(new Emp("somwati", 6));
		System.out.println(emp);
		/*sorting based on ascending*/
		Collections.sort(emp,(e1,e2)->(e1.id<e2.id)?-1:(e1.id>e2.id)?1:0);
		System.out.println(emp);
		/*sorting based on name Ascending*/
		Collections.sort(emp,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(emp);
		/*sorting based on name Descending */
		Collections.sort(emp,(e1,e2)->e2.name.compareTo(e1.name));
		System.out.println(emp);
		emp.stream().sorted();
		
		emp.stream().sorted((e1,e2)->e1.id>e2.id?-1:e2.id>e1.id?1:0 );
		System.out.println("cur");
		System.out.println(emp);
		emp.sort((e1,e2)->e1.id>e2.id?-1:e2.id>e1.id?1:0 );
		String str1 = "a";
		String str2 = "z";
		System.out.println(str1.compareTo(str2) +" ");
		
		Comparator<String> c = (s1,s2)->{
			int l1 =s1.length();
			int l2 =s2.length();
			if(l1>l2)return +1;
			else if(l1<l2)return -1;
//			else return s1.compareTo(s2);
			else return  0;
		};
		
		Comparator<Emp> e = (e1,e2)->{
			int l2 =e1.id;
			int l1 =e2.id;
			if(l1>l2)return +1;
			else if(l1<l2)return -1;
//			else return s1.compareTo(s2);
			else return  0;
		};
		emp.sort(e);
		System.out.println(emp);
		
	}
}

class Emp{
	String name  ;
	int id ;
	public Emp(String name , int id ) {
	this.name= name; this.id=id;
	}
	@Override
	public String toString() {
		 return  this.name + "   "+ this.id; 
	}
	
}
