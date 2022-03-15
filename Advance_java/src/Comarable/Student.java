package Comarable;

public class Student implements Comparable {
	private String studentname;
	private int rollno;
	private int studentage;

	public Student(String studentname, int rollno, int studentage) {
		super();
		this.studentname = studentname;
		this.rollno = rollno;
		this.studentage = studentage;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	public int compareTo(Student comparestu) {
		int compareage = ((Student) comparestu).getStudentage();
		/* For Ascending order */
		return this.studentage - compareage;

		/* For Descending order do like this */
		// return compareage-this.studentage;
	}

	@Override
	public String toString() {
		return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
