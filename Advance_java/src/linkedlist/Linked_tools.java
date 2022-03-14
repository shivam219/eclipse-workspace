package linkedlist;

import java.util.*;

public class Linked_tools {
	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<>();
		// Add elements in the linked list
		animals.add("Dog");
		animals.add("Horse");
		animals.add("Cat");
		System.out.println("LinkedList: " + animals);

		String str = animals.get(1);// Get the element from the linked list
		System.out.print("Element at index 1: " + str);
		Iterator<String> iterate = animals.iterator();
//		while (iterate.hasNext()) {
//			System.out.print(iterate.next());
//			System.out.print(", ");
//		}
		
		while (iterate.hasNext()) {
			System.out.println(iterate.next());
			System.out.println(", ");
		}
		while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

	}
}
