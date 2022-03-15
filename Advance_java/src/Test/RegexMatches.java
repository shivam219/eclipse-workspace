package Test;

import java.util.ArrayList;
import java.util.List;

public class RegexMatches {

	public static void main(String args[]) {
//      
		List<String> list = new ArrayList<String>();
		list.add("hello");
		String s = list.get(0); // no cast

//	   List list = new ArrayList();
//	   list.add("hello");
//	   String s = (String) list.get(0);
//     } 

	}
}

class Box<T> {
	// T stands for "Type"
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}