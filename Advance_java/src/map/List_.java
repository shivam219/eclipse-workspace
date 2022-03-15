package map;

import java.util.ArrayList;
import java.util.*;

public class List_ {
	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		student.add(new Student(1, "Ram"));
		student.add(new Student(2, "Shayam"));
		student.add(new Student(3, "Arjun"));
		student.add(new Student(4, "Bheen"));
//		Collections.sort(student, (o1, o2) -> {
//			if (o1.name.equals(o2.name)) {
//				return o1.marks - o2.marks;
//
//			} else {
//				return o1.name.compareTo(o2.name);
//
//			}
//		});

//		Collections.sort(student, (o1, o2) -> o1.name.compareTo(o2.name));

		Collections.sort(student, Comparator.comparing(Student::getName));
		student.forEach(System.out::println);

	}
}

class Sort implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.name.equals(o2.name)) {
			return o1.marks - o2.marks;

		} else {
			return o1.name.compareTo(o2.name);
		}
	}
}
