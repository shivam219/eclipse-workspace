package new_instance;

import new_instance.Student.Name;

public class New_instanc {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		 creating object by using new keyword
		Student s1 = new Student();

//		printing the ojbect refference
//		System.out.println(s1);
//		s1.show();
//		s1.id=50;
//		System.out.println(s1.id);
//		Creating object using newInstance method of class
		/* one way */
		Student s2 = (Student) Class.forName("new_instance.New_instanc").newInstance();
		/* second way */
		Student ss2 = Student.class.newInstance();
		/*
		 * Name s3=(Name) Class.forName("new_instance.New_instanc").newInstance();
		 * Name.hiii(); if class declare as static we don't need create object just
		 * classname.show();
		 */
		Class<String> c = (Class<String>) Class.forName("java.lang.String");
		String s3 = (String) Class.forName("new_instance.New_instanc").newInstance();
		String s4 = String.class.newInstance();
	}
}
