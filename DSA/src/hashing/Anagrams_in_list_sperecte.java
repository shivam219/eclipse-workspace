package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Anagrams_in_list_sperecte {
	public static void main(String[] args) {
		String str[] = {"abc","acd"};
		List<String> a = Arrays.asList(str);
		
		ArrayList<ArrayList<Integer>> al  = anagrams(a);
		for(ArrayList<Integer> val : al) {
			System.out.println(val);
		}
	}
/*-----------------------Arraylist Sorted--------------------------------------*/
	public static  ArrayList<ArrayList<Integer>> anagrams(List<String> A) {
		ArrayList<String> arr = new  ArrayList<String>();
		for(int i = 0; i<A.size(); i++) {
			String str  =  A.get(i);
			char ch [] = str.toCharArray();
			Arrays.sort(ch); 
			for(char c : ch){System.out.print(c+"  ");}
			arr.add(String.valueOf(ch));
		}
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i<arr.size(); i++) {
			for(int j  = i+1; j<arr.size(); j++ ) {
				if(arr.get(i).equals(arr.get(j))) {
				ArrayList<Integer> val1 = new ArrayList<Integer>();
				val1.add(i+1); val1.add(j+1);
				}
			}
		}
			
		return al;
	}

public static  ArrayList<ArrayList<Integer>> anagrams2(List<String> A) {
return null;	
}
}