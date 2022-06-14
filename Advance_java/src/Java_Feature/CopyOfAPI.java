package Java_Feature;

import java.util.ArrayList;
import java.util.List;

public class CopyOfAPI {
	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("shivam");
		li.add("rama");
		li.add("kumar");
		dontChangeName(li);
		System.out.println(li);
		List<String> li2 = List.copyOf(li);// create immutable collection objects
		dontChangeName(li2);
		System.out.println(li2);//give error ImmutableCollections.uoe	
	}

	public static void dontChangeName(List<String> li) {
		li.add("krishna");
	}
}
