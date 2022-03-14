package linkedlist;
import java.util.*;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.ListIterator;

public class Linked_list_iterator {
	public static void main(String[] args) {
		LinkedList<String> animals= new LinkedList<>();

	        // Creating an object of ListIterator
	        ListIterator<String> listIterate = animals.listIterator();
	        listIterate.add("Dog");
	        listIterate.add("Cat");

	        System.out.println("LinkedList: " + animals);
	}
}
