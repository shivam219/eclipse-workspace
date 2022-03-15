package input;

import java.util.Scanner;

// Encapsulation data with methods.
class student {
	private int rollno;
	private String name;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Encapsulation_level {
	public static void main(String[] args) {
		student s1 = new student();
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter  name :- ");
		s1.setName(sc.next());
		sc.close();
		System.out.println(s1.getName());
		
	}

}