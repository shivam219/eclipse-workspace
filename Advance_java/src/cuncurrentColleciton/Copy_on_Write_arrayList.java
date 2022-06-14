package cuncurrentColleciton;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Copy_on_Write_arrayList {
	public static void main(String[] args) {
		/*
		 * copyOnWriteArrayList - synchronized version here only add method is
		 * synchronized in addind single element is generate all new collection and copy
		 */
		List<String> li = new CopyOnWriteArrayList<String>();
		li.add("shivam");
		li.add("deepak");
		li.add("suraj");
		li.add("rama");
		for (String str : li) {
			System.out.println(str);
		}
	}
}