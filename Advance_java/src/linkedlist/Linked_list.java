package linkedlist;

import java.util.*;

import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		LinkedList<Integer> aa = new LinkedList<>();
		aa.add(20);
		aa.add(50);
		aa.add(100);

		aa.add(1, 30);
		aa.add(1, 40);
//		int sec =  aa.size(); // cast value linked list in simple array
//		System.out.println(sec);
		for (int a : aa) {

			System.out.println(a); // printing linked list using advance for
			
		}System.out.println("after");
		LinkedList<Integer> aaa = new LinkedList<>();
		aaa.add(1);
		aaa.add(4);
		aaa.add(5);
		aaa.add(9);
		aa.addAll(aaa);         /////element merge withing last element
		for (int b : aa) {
		 System.out.println(b);
		}
	}

}
