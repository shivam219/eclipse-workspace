package Comarable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class comara {
	public static void main(String[] args) {

		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(new Student("Rama", 10, 0));
		arraylist.add(new Student("krisna", 10, 0));
		arraylist.add(new Student("mahdev", 10, 0));
		Collections.sort(arraylist);
		  
	}

}
