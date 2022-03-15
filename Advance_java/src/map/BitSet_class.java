package map;

import java.util.BitSet;
import java.util.Scanner;

public class BitSet_class {
	public static void main(String[] args) {
//		BitSet b1 = new BitSet(10);
//		BitSet b2 = new BitSet(10);
//		for(int i = 0; i<10; i++) {
//			if(i % 2 == 0 ) b1.set(i);
//			if(i % 3 == 0 ) b2.set(i);
//		}
//		System.out.println("value of b1"+b1);
//		System.out.println("value of b2"+b2);
//		b1.and(b2); // performing on b1
//		
//		System.out.println(b1.size());
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int m  = sc.nextInt();
		BitSet b1 = new BitSet(n);
		BitSet b2 = new BitSet(n);
		BitSet[] bitset  = new BitSet[3];
		
		bitset[1] = b1 ;
		bitset[2] = b2 ;
		
		while(m --> 0)	{
			String op = sc.next(); //get string of word
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			switch(op) {
			case "AND" : bitset[x].and(bitset[y]); break;
			case "OR" : bitset[x].or(bitset[y]); break;
			case "XOR" : bitset[x].xor(bitset[y]); break;
			case "FLIP" : bitset[x].flip(y); break;
			case "SET" : bitset[x].set(y); break;
			}
			System.out.printf("%d %d %n ", b1.cardinality(), b2.cardinality());
		}
		
	}
}
