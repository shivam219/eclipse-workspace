package map;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapClasss {
	public static void main(String[] args) {
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		Integer n1 = 20;
//		Integer n2 = 20;
//		map.put(n1, "shivam");
//		map.put(n1, "choudhary");
//		System.out.println(map);
		HashSet<stu> set = new HashSet<stu>();
		stu n1 = new stu("college");
		stu n2 = new stu("college");
		set.add(n1);
		set.add(n2);
		System.out.println(set);
//		System.out.println(n1);
//		System.out.println(n2);
//		System.out.println(n2.equals(n2));

	}
}

class stu {
	String name;

	public stu(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public int hashCode() {
		return this.name.hashCode();
	}

	public boolean equals(String name) {
		return this.hashCode() == name.hashCode() ? true : false;
	}
}