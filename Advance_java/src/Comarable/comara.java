package Comarable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class comara {
	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("Rama", 2, 0));
		al.add(new Student("krisna", 15, 0));
		al.add(new Student("mahdev", 64, 0));
		al.add(new Student("mahdev", 65, 0));
		al.add(new Student("mahdev", 5, 0));
		Collections.sort(al);
		//defualt is comparable 
		System.out.println(al);
		//        Collections.sort(ld, Comparator.comparing(DaySheetDto::getProjectName));

	}

}
