package linkedlist;

import java.util.LinkedList;

public class Linked_number_removeif {
	public static void main(String[] args) {
		LinkedList<Integer> no = new LinkedList<>();
		LinkedList<Integer> noo = new LinkedList<>();
		no.add(10);
		no.add(20);
		no.add(30);
		no.add(40);
		no.add(50);
		no.add(60);
		try {
			no.removeIf((Integer i) -> i>30); 
			System.out.println(no);
		} catch ( Exception e) {
			System.out.println(e);
		}
//		noo.addAll(no);
	
		
//		noo.removeIf((Integer i) -> i>30); 
//		System.out.println("linked list = " + no);		
//		no.removeIf((Integer i) -> i < 4);
//		System.out.println("New LinkedList: " + no);

	}
}
