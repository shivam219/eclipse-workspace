package Fuction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream_cas {
	public static void main(String[] args) {
		List<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(12);
		ar.add(14);
		ar.add(16);
		ar.add(18);
		ar.add(19);
		ar.add(11);
		
		Stream s = ar.stream().filter(e-> e>=15).filter(e-> e%2==0);
		
		ar.stream().filter(e-> e>=15);
		
		
			
	}
}
