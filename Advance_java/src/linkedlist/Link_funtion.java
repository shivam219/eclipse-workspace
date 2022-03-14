package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Link_funtion {
public static void main(String[] args) {
	 LinkedList<String> animals= new LinkedList<>();

     animals.add("Dog");// Add elements in LinkedList
     animals.add("Horse"); // Add elements in LinkedList
     animals.add("Cat");
     ListIterator<String> listIterate = animals.listIterator();
     System.out.print("LinkedList: ");

     while(listIterate.hasNext()) {
         System.out.print(listIterate.next());
         System.out.print(", ");
     }

     // Iterate backward
     System.out.print("\nReverse LinkedList: ");

     while(listIterate.hasPrevious()) {
         System.out.print(listIterate.previous());
         System.out.print(", ");
     }
     }
}
