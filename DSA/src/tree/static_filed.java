package tree;

public class static_filed {

}

class college {
	static int collegeNo = 10;
	int student  = -1 ;
}

class Student {
	public static void main(String[] args) {
		college st1  = new college();
		college st2  = new college();
		college st3  = new college();
		college st4  = new college();
		st1.collegeNo = 10;
		st1.student= 10;
		System.out.println(st1.collegeNo);
		System.out.println(st1.student);
		st2.collegeNo = 30;
		System.out.println(st2.collegeNo);
		System.out.println(st2.student);
		
		
		
	}
}