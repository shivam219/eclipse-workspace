package stack__queue;

import java.util.ArrayList;

public class call_by_referece_Dynamic  {
	public static void main(String[] args) {
		String s1 = new String("deepak");
		String s2 = "deepak";
		System.out.println(s1==s2);
		s1 = "deepak";
		System.out.println(s1==s2);
		s1 = new String("deepak");
		System.out.println(s1==s2);
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		
//		
//		
//		
//		
//		
//		ArrayList<Integer> s = new ArrayList<Integer>();
//		ArrayList<Integer> s1 = new ArrayList(); //non generis are
//		change(s1);
//		System.out.println(s1);
//		callre(s);
//		System.out.println(s1.getClass().getName());
//		System.out.println(s);
		//generic area
	}
	public static void change(ArrayList s) {
		s.add("shviam");
		s.add("shviam");
		s.add("shviam");
		s.add("shviam");
	}
	public static  ArrayList<Integer> callre (ArrayList<Integer> a){
		a.add(10);
		a.add(10);
		a.add(10);
		return a;
	}
}
